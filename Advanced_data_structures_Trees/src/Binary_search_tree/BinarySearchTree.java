package Binary_search_tree;

public class BinarySearchTree {

    public static boolean search(TreeNode root , int target) {

        if(root == null)
            return false;

        if(root.val == target) {
            return true;
        } else if(target < root.val) {
            return search(root.left , target);
        } else {
            return search(root.right , target);
        }
    }
}
