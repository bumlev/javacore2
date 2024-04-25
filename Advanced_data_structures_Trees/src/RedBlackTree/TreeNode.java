package RedBlackTree;

public class TreeNode {

    int val;
    boolean isRed;
    TreeNode left;
    TreeNode right;
    int blackHeight; // Number of black nodes on the path from this node to its descendant leaves

    TreeNode(int x, boolean red, int blackHeight) {
        val = x;
        isRed = red;
        this.blackHeight = blackHeight;
    }
}
