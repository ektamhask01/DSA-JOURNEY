

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
    public static int size;


    // 1. ADD AT FIRST POSITION
    
    public void addFirst(int data) {
          // step 1 . create new node
        Node newNode = new Node(data);

        if(head == null) {
            head = tail = newNode;
            size++;
            return;
        }

        // step 2 . newNode -> next == head
        newNode.next = head;

        //  step 3 . head = newNode
        head = newNode;
        size++;

    }

        // 2. ADD AT LAST POSITION

    public void addLast(int data) {
          // step 1 . create new node
        Node newNode = new Node(data);

        if(head == null) {
            head = tail = newNode;
            size++;
            return;
        }

        // step 2 . tail next point to newnode
        tail.next = newNode;

        //  step 3 . tail = newNode
        tail = newNode;
        size++;

    }


    // 3. ADD AT SPECIFIC POSITION

 
    public void add(int data, int index) {
        if (index == 0) {
            addFirst(data);
            size++;
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
         size++;

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

    // 1. REMOVE FROM FIRST POSITION


    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is Empty");
        } 
        else if (size== 1) {
            int val = head.data;
            head =  tail = null;
            size--;
            return  val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }


    // 2. REMOVE FROM LAST POSITION

    public int removeLast() {
        if (size ==0) {
            System.out.println("LL is empty");
            return -1;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return  val;
        }
        Node prev = head;
        for (int i = 0 ; i<size-2 ; i++) {
           prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }


    // 3 . REMOVE FROM SPESIFIC POSITION




    // SEARCH ITERATIVE

        public int searchIterative(int key) {
            if (size == 0) {
                System.out.println("LL is empty ");
                return 0;
            }
            int i = 0 ;
            Node temp = head;
            while (temp != null) {
                if (temp.data == key) {
                    System.out.println("key is at " + i +  "th index");
                    return i;
                }
                temp = temp.next;
                i++;
            }
            return  -1;
        }



        // RECURSIVE SEARCH

        public int helper(Node head , int key) {
            if (head == null) {
                return -1;
            }

            if (head.data == key) {
                return 0;
            }

            int idx = helper(head.next, key);
            if (idx == -1) {
                return -1;
            } 
            return  idx+1;
        }

        public int recurssiveSearch(int key ) {
            return helper(head , key);
        }

        // REVERSE THE LINKED LIST

        public void reverse() {
            Node prev = null;
            Node curr = tail = head;
            Node next ;
            while( curr != null) {
                next = curr.next;
                curr.next = prev ; // main reversing statement
                prev = curr;
                curr = next;
            }
            head = prev;
        }


        // Question : Delete Nth Node from End 

         public void deleteNthfromEnd( int n) {
        int Size = 0;
        Node temp = head;

        while(temp != null) {
            Size++;
            temp = temp.next;

        }

        if (n == Size) {
            head = head.next;  // remove First
            return;
        }

        // Size -n
        Node prev = head;
        for (int i =1; i< Size -n ; i++) {
            prev = prev.next;
        }
        prev.next= prev.next.next;
        return;
    }

    public static void main(String[] args) {
        linkList  obj = new linkList();
        int index = 3;
        int n  = 3;
        obj.addFirst(3);
        obj.addFirst(2);
        obj.addFirst(1);
        obj.addLast(4);
        obj.addLast(5);
        obj.add(6, index);
        // obj.print();
        // obj.removeFirst();
        // obj.print();
        // System.out.println(obj.size);
        // System.out.println(obj.removeLast());
        // obj.searchIterative(key);
        // System.out.println(obj.recurssiveSearch(key));
        obj.print();
        obj.deleteNthfromEnd(n);
        obj.print();
        
    }
}
