



public class Height {
    static class Node {
        int data;
        Node left;
        Node right;
        public Node (int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    // Height of Tree

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
         int leftH = height(root.left); // recursive function
         int rightH = height(root.right); // recursive function 
         int height = Math.max(leftH , rightH) + 1;
         return  height;
    }

    // Count No. of Node 

    public static int countNode(Node root) {
        if (root == null) {
            return 0;
        }
        int x = countNode(root.left);
        int y = countNode(root.right);
        int count = x + y + 1;
        return count;
    }

    // Sum of Node

     public static int SumNode(Node root) {
        if (root == null) {
            return 0;
        }
        int x = SumNode(root.left);
        int y = SumNode(root.right);
        int sum = x + y + root.data;
        return sum;
    }


    // Diameter of tree ( Approach 1 ) 

    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = height(root.left) + height(root.right ) + 1;

        return Math.max( diam3 , Math.max(diam1, diam2));
    }


    // Diameter of tree ( Approach 2 ) 

    static class TreeInfo {
        int height;
        int diameter;

        TreeInfo (int height , int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    public 
    static TreeInfo diameter2(Node root) {
        if (root == null) {
            return new TreeInfo(0 , 0);
        }
        TreeInfo left =diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.height, right.height) + 1;

        int diam1 = left.diameter;
        int diam2 = right.diameter;
        int diam3 = left.height + right.height + 1;

        int myDiameter = Math.max(diam1, Math.max(diam2, diam3));

        TreeInfo myInfo = new TreeInfo(myHeight ,myDiameter );
        return myInfo;
    }

    public static void main(String[] args) {
    //            1
    //         /      \
    //        2       3
    //     /    \    /   \
    //    4    5   6    7

    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);
    root.right.right.right = new Node(8);

    System.out.println(height(root));
    System.out.println("No. of Nodes  : "  + countNode(root));
    System.out.println("Sum of Nodes : " + SumNode(root));
    System.out.println("Diameter  : " + diameter2(root).diameter);

    }
}
