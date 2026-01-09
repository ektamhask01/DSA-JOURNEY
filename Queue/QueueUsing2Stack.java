//  Asked in Microsoft and Google

import java.util.*;

public class QueueUsing2Stack {
    

    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static  Stack<Integer> s2 = new Stack<>();

        // Is Queue empty??

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        // 1 . Add element

        public static void add(int data) {

            // shift elements from s1 to s2
            while (!s1.isEmpty()) {
                s2.push(s1.pop()); 
            }

            s1.push(data);

            // shift elements from s2 to s1

            while (!s2.isEmpty()){
                s1.push(s2.pop());
            }

        }

        // 2. Remove 

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int result = s1.pop();
            return result;
        }

        // 3 .peek

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
    
            return s1.peek();
        }



    }


    public static void main(String[] args) {

        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
       System.out.println(q.peek());
        q.remove();
       System.out.println(q.peek());
        q.remove();

        q.add(4);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
        
        
    
}
}
