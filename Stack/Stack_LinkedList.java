public class Stack_LinkedList {

    // Node class
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Stack class
    static class Stack {
        static Node head = null;

        // Check if stack is empty
        public static boolean isEmpty() {
            return head == null;
        }

        // PUSH operation
        public static void push(int data) {
            Node newNode = new Node(data);
            newNode.next = head;  // link new node to old head
            head = newNode;       // make new node the new head
        }


        // POP operation
        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return -1;
            }
            int top = head.data;
            head = head.next;  // move head down
            return top;
        }


        // PEEK operation
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return -1;

            }
            return head.data;
        }


    }

    // Main method

    public static void main(String[] args) {
        Stack s= new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!Stack.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}

