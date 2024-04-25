package AVLTree;

public class Main {

    public static void main(String[] args) {
        // Creating the AVL tree shown above
        TreeNode root = null;
        root = AVLTree.insert(root, 10);
        root = AVLTree.insert(root, 5);
        root = AVLTree.insert(root, 15);
        root = AVLTree.insert(root, 2);
        root = AVLTree.insert(root, 7);
        root = AVLTree.insert(root, 13);
        root = AVLTree.insert(root, 20);
        root = AVLTree.insert(root, 14);

        // You can perform various operations on this AVL tree, such as searching, insertion, deletion, etc.
        // For example, you can perform an inorder traversal like this:
        System.out.println("Inorder traversal:");
        AVLTree.inorderTraversal(root);
    }
}
