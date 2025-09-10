public class linkList {
    
    public static class Node{
        int data;
        Node next;
        public  Node(int data) {
            this.data= data;
            this.next = next;
        }
    }

    public static Node head;
    public static Node tail;


    // 1. ADD AT FIRST POSITION
    
    public void addFirst(int data) {
          // step 1 . create new node
        Node newNode = new Node(data);

        if(head == null) {
            head = tail = newNode;
            return;
        }

        // step 2 . newNode -> next == head
        newNode.next = head;

        //  step 3 . head = newNode
        head = newNode;

    }

        // 2. ADD AT LAST POSITION

    public void addLast(int data) {
          // step 1 . create new node
        Node newNode = new Node(data);

        if(head == null) {
            head = tail = newNode;
            return;
        }

        // step 2 . tail next point to newnode
        tail.next = newNode;

        //  step 3 . tail = newNode
        tail = newNode;

    }


    // 3. ADD AT SPECIFIC POSITION

 
    public void add(int data, int index) {
        if (index == 0) {
            addFirst(data);
            return;
        }
           // step 1 . create new node
        Node newNode = new Node(data);
        int i = 0;
        Node temp = head;

        // step 2 . traverse linkedlist till index -1
         while (i< index-1) {
            temp = temp.next;
            i++;
         }
         // step 3 newnode next = temp next

         newNode.next = temp.next;

         // step 4 .temp next = newnode

         temp.next = newNode;

    }



    //  # ##  PRINT LINKED LIST
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



    public static void main(String[] args) {
        linkList  obj = new linkList();
        int index = 3;
        obj.addFirst(3);
        obj.addFirst(2);
        obj.addFirst(1);
        obj.addLast(4);
        obj.addLast(5);
        obj.print();
        obj.add(6, index);
        obj.print();


    }
}
