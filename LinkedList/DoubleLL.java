public class DoubleLL {

    public class Node{
        int data;
        Node next;
        Node prev;

        public Node (int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;


    // 1 . Add element at first position in  doubly linked list

    public void addFirst(int data) {
        // create Node 
        Node newNode = new Node(data);

        // place in node at appropriate position

        if (head == null  ) {
            head = tail =newNode;
            size++;
            return;
            
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        size++;

    }


     // 2 .. Add element at Last position in  doubly linked list

    public void addLast(int data) {
        // create Node 
        Node newNode = new Node(data);

        // place in node at appropriate position

        if (head == null  ) {
            head = tail =newNode;
            size++;
            return;
            
        }

        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
        size++;

    }


    // Print Doubly linked listw

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp. data + " <-> ");
            temp = temp.next;
        }
        System.out.println(" null ");
    }


    // 1 . Remove First in doubly Linked List

    public int removeFirst() {
        if (size == 1) {
            int temp = head.data;
            head = tail = null;
            return temp;
        }
        int temp = head.data;
        head = head.next ;
        head.prev = null;
        size--;
        return  temp;

    }


    // 2 . Remove Last in doubly Linked List

    public int removeLast() {
        if (size == 1) {
            int temp = head.data;
            head = tail = null;
            return temp;
        }
        int temp = tail.data;
        tail = tail.prev ;
        tail.next = null;
        size--;
        return  temp;

    }

    // Reverse Doubly linked List

    public void reverse() {
        Node curr = head;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }

        head = prev;
    }
    
    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addLast(3);
        dll.print();
        //dll.removeFirst();
        // dll.removeLast();
       
        dll.reverse(); 
        dll.print();
        

    }
}
