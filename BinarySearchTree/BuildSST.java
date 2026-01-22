
import java.util.ArrayList;


public class BuildSST {
    static class Node {
        int data ;
        Node left ;
        Node right;

        Node (int data) {
            this.data = data;
        }

    }

    public static Node insert(Node root, int val ) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            // let subtree
           root.left = insert(root.left , val);
        } else {
            root.right = insert(root.right , val);
        }
        return root;
    }


    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean search(Node root , int key) {
        if (root == null) {
            return false;
        }
        if (root.data > key ) {
            return search(root.left, key);
        } 
        else if (root.data == key) {
            return true;
        }
        else {
           return  search(root.right, key);
        } 

    }

    // Deleting Node from BST

    public static Node delete(Node root, int val) {
        if (root.data > val ) {
            root.left = delete(root.left, val);
        } else if (root.data < val ) {
            root.right = delete(root.right , val);
        } 
        else { // root.data == val

            // Case 1 : Zero Child 

            if (root.left == null  && root.right == null) {
                return null;
            }


            // Case 2 : One child

            if (root.left == null ) {
                return root.right;
            } else if (root.right == null ){
                return root.left;
            }


            // Case 3 : Two child 
            Node IS =inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right , IS.data);

        
        }

        return root;
    }

    public static Node inorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }


    // Question  1 : Print In range

    public static void printInRange(Node root, int X , int Y) {
        if (root == null ) {
            return;
        }
        if (root.data >= X && root.data <=Y) {
            printInRange(root.left, X, Y);
            System.out.print(root.data + " ");
            printInRange(root.right, X, Y);

        } 

        else if (root.data >= Y) {
            printInRange(root.left, X, Y);
        } else {
            printInRange(root.right, X, Y);
        }
    }


    // Question 2 : Root To Leaf Paths

    public static void printRoot2Leaf(Node root ,ArrayList<Integer> path  ) {
        if (root == null ) {
            return;
        }
        path.add(root.data);

        if (root.left == null && root.right == null) {
            // Leaf Node
            printPath(path);
        } else {
            printRoot2Leaf(root.left, path);
            printRoot2Leaf(root.right, path);
        }
        path.remove(path.size()- 1);
    }

    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0 ; i<path.size();i++) {
            System.out.print(path.get(i) + " -> ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int values[] = {8, 5, 6, 3, 10, 11, 14};
        
        Node root = null;
        int key = 2;
        for (int i =0 ; i<values.length;i++) {
            root = insert(root, values[i]);
        }
        // inorder(root);
        // System.out.println();
        // System.out.println(search(root, key));

        //printInRange(root, 3 ,12);

        printRoot2Leaf(root, new ArrayList<>());
    }


    
}
