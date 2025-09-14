public  class zigzagLL {

        public static class Node{
        int data;
        Node next;
        public  Node(int data) {
            this.data= data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

     public void addFirst(int data) {
          // step 1 . create new node
        Node newNode = new Node(data);

        if(head == null) {
            head = tail = newNode;;
            return;
        }

        // step 2 . newNode -> next == head
        newNode.next = head;

        //  step 3 . head = newNode
        head = newNode;
        

    }


    public void print() {
        if (head == null) {
            System.out.println("Linled list is empty ");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp= temp.next;   
        }
        System.out.println();
    }


    public Node  Findmid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;   
    }

    

    public void zigzag() {
        if (head == null || head.next == null) {
            return ;
        }
        //1.  find mid
        Node mid = Findmid( head);


        // 2. reverse 2nd half
        Node curr= mid.next;
        mid.next = null;
        Node prev = null;
        Node next ;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // 3. alternate merging

        Node rightHead = prev;
        Node leftHead = head;
        Node nextL;
        Node nextR;


        while ( leftHead != null && rightHead != null) {
            // zigzag code
            nextL = leftHead.next;
            leftHead.next =rightHead;
            nextR = rightHead.next;
            rightHead.next = nextL;

            // Update left head and right head
            rightHead = nextR;
            leftHead = nextL;

        }
  

    }
    public static void main(String[] args) {
        zigzagLL list = new zigzagLL();

        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(4);
        list.addFirst(1);
        list.addFirst(5);
        
        
        list.print();
        list.zigzag();
        list.print();
    }
}
 
