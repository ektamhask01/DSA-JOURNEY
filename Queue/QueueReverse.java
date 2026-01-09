import java.util.*;

public class QueueReverse {

      public static void reverse(Queue<Integer>q) 
        {
            Stack <Integer> s = new Stack<>();
            // add element in the stack in  1. 2. 3 4 5 order 
            while(!q.isEmpty()) {
                s.push(q.remove());
            }

            // add element in the order  5 4 3 2 1
            while( !s.isEmpty()) {
                q.add(s.pop());
            }

        }

    public static void main(String[] args) {

        Queue<Integer>q = new LinkedList<>();
        q.add(1) ;
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        reverse(q);

        // print queue 
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }

   }
}
