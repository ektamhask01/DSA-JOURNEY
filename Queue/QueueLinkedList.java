 public class QueueLinkedList {
    
     static class Node {
            int data;
            Node next;

            Node (int data) {
                this.data = data;
                this.next = null;
            }
    }

    static class Queue {

         Node head = null;
         Node tail = null;

        public  boolean isEmpty() {
            return head == null && tail == null;
        }


        // add 

        public  void add(int data) {
           Node newNode = new Node(data);

           // if list is empty

           if (head == null) {
            head = tail = newNode;
            return;
           }

           tail.next = newNode;
           tail = newNode;

    } 


    //  remove 

    public  int remove() {
       if (head == null) {
           System.out.println("Queue is empty");
           return -1;
       }


       int front = head.data;

       // if single element
       if (tail == head) {
            tail = head = null;
       }  else {
        head = head.next;

       }

       return front ;
    }


    // peek


    public  int peek() {
        if (head == null) {
        System.out.println("Queue is empty");
         return -1;
       }
        return head.data;
    }

}

    public static void main(String[] args) {
        Queue q = new  Queue();
        q.add(1);
        q.add(2);
         System.out.println(q.remove());
        q.add(3);

      
        System.out.println(q.remove());
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    
}
   
} 
