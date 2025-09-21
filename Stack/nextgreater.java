import java.util.*;

public class nextgreater {
    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<>();
        int nextgreater[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {

            // 1. while - remove smaller elements
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            // 2. if-else
            if (s.isEmpty()) {
                nextgreater[i] = -1;
            } else {
                nextgreater[i] = arr[s.peek()];
            }

            // 3. push index in stack
            s.push(i);
        }

        // Print result outside loop
        for (int j = 0; j < nextgreater.length; j++) {
            System.out.print(nextgreater[j] + " ");
        }
    }
}
