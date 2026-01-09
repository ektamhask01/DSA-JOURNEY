public class isSubTree {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public boolean isIdentical(Node root, Node subRoot) {

        if (root == null && subRoot == null) {
            return true;
        }

        if (root == null || subRoot == null) {
            return false;
        }

        if (root.data != subRoot.data) {
            return false;
        }

        return isIdentical(root.left, subRoot.left)
            && isIdentical(root.right, subRoot.right);
    }

    public boolean isSubTree(Node root, Node subRoot) {

        if (subRoot == null) {
            return true;
        }

        if (root == null) {
            return false;
        }

        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }

        return isSubTree(root.left, subRoot)
            || isSubTree(root.right, subRoot);
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.right = new Node(8);

        Node subRoot = new Node(3);
        subRoot.left = new Node(6);
        subRoot.right = new Node(9); // not present in main tree

        isSubTree tree = new isSubTree();
        System.out.println(tree.isSubTree(root, subRoot)); // false
    }
}
