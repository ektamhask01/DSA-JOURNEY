import  java.util.*;

public class MaxAreaHistogram {

    public static void maxArea(int arr[] ) {
        int maxArea = 0;
        int nsr[] = new int[arr.length];// next smaller right array
        int nsl[] = new int [arr.length]; //next smaller left  arrray

        //Next smaller right arrray
        Stack <Integer> s = new Stack<>();

        for (int i = arr.length-1; i>=0 ; i--) {
            while(!s.isEmpty()&& arr[s.peek()] >= arr[i] ) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }


           //Next smaller left arrray

       s = new Stack<>();

        for (int i = 0; i<=arr.length-1 ; i++) {
            while(!s.isEmpty()&& arr[s.peek()] >= arr[i] ) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }


        // current Area : width = nsr[i] - nsl[i] -1
    
    for (int i = 0 ; i< arr.length; i++) {
        int height = arr[i];
        int width = nsr[i] - nsl[i] -1;
        int currArea = height * width;
        maxArea =Math.max(currArea, maxArea);
        
    }

    System.out.println("Maximum area : " + maxArea);
    }

    public static void main(String[] args) {
        int arr[] = {6, 2, 5, 4, 5, 1, 6 };
        maxArea(arr);

    }
}
