package RedBlackTree;

public class Main {

    public static void main(String[] args) {

        // Creating the red-black tree shown above
        TreeNode root = new TreeNode(10, false, 2); // Root is always black
        root.left = new TreeNode(5, true, 2); // Red
        root.right = new TreeNode(15, false, 2); // Black
        root.left.left = new TreeNode(3, false, 1); // Black
        root.left.right = new TreeNode(8, false, 1); // Black
        root.right.right = new TreeNode(20, true, 1); // Red
        root.right.right.left = new TreeNode(17, false, 1); // Black

        // You can perform various operations on this red-black tree, such as insertion, deletion, searching, etc.
        // For example, you can perform an inorder traversal like this:
        System.out.println("Inorder traversal:");
        RedBlackTree.inorderTraversal(root);
    }
}
