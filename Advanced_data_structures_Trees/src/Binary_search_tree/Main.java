package Binary_search_tree;

public class Main {

    public static void main(String[] args) {

        // Creating the binary search tree shown above
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        // You can perform various operations on this binary search tree, such as searching, insertion, deletion, etc.
        // For example, you can search for a value in the tree like this:

        int target = 4;
        if (BinarySearchTree.search(root, target)) {
            System.out.println(target + " exists in the tree.");
        } else {
            System.out.println(target + " does not exist in the tree.");
        }
    }
}
