package AVLTree;

public class AVLTree {

    // Insert a value into the AVL tree
    public static TreeNode insert(TreeNode root, int val) {

        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insert(root.left, val);
        } else if (val > root.val) {
            root.right = insert(root.right, val);
        } else {
            // Duplicate values are not allowed in AVL trees
            return root;
        }

        // Update height of this ancestor node
        root.height = 1 + Math.max(getHeight(root.left), getHeight(root.right));

        // Get the balance factor of this ancestor node
        int balance = getBalance(root);

        // If this node becomes unbalanced, then there are four cases
        // Left Left Case

        if (balance > 1 && val < root.left.val) {
            return rightRotate(root);
        }

        // Right Right Case
        if (balance < -1 && val > root.right.val) {
            return leftRotate(root);
        }

        // Left Right Case
        if (balance > 1 && val > root.left.val) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // Right Left Case
        if (balance < -1 && val < root.right.val) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    // Perform left rotation
    public static TreeNode leftRotate(TreeNode y) {
        TreeNode x = y.right;
        TreeNode T2 = x.left;

        // Perform rotation
        x.left = y;
        y.right = T2;

        // Update heights
        y.height = 1 + Math.max(getHeight(y.left), getHeight(y.right));
        x.height = 1 + Math.max(getHeight(x.left), getHeight(x.right));

        // Return new root
        return x;
    }

    // Perform right rotation
    public static TreeNode rightRotate(TreeNode x) {
        TreeNode y = x.left;
        TreeNode T2 = y.right;

        // Perform rotation
        y.right = x;
        x.left = T2;

        // Update heights
        x.height = 1 + Math.max(getHeight(x.left), getHeight(x.right));
        y.height = 1 + Math.max(getHeight(y.left), getHeight(y.right));

        // Return new root
        return y;
    }

    // Get height of the node
    public static int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return root.height;
    }

    // Get balance factor of the node
    public static int getBalance(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return getHeight(root.left) - getHeight(root.right);
    }

    // Inorder traversal: left, root, right
    public static void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.val + " ");
            inorderTraversal(root.right);
        }

    }

}
