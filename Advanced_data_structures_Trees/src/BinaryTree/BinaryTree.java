package BinaryTree;

public class BinaryTree {

    public static void inorderTraversal(TreeNode root) {

        if (root != null) {
            System.out.print(root.val + " ");
            inorderTraversal(root.left);
            inorderTraversal(root.right);
        }

    }
}
