package RedBlackTree;

public class RedBlackTree {

    public static void inorderTraversal(TreeNode root) {

        if(root != null) {

            inorderTraversal(root.left);
            System.out.println(root.val + "(" + (root.isRed ? "Red" : "Black") + ", Black Height: " + root.blackHeight + ") ");
            inorderTraversal(root.right);
        }
    }
}
