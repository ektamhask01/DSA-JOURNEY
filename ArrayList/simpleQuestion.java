import  java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class simpleQuestion {


    // 3 . swap two values

    // public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
    //     int temp = list.get(idx1);
    //     list.set(idx1, list.get(idx2) );
    //     list.set(idx2 , temp);

    // }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(7);
        list.add(4);
        list.add(2);
        list.add(10);


        // 1 . reverce arraylist
        // System.out.println("Reverse arraylist : " );
        // for(int i =list.size()-1; i>=0; i--) {
        //     System.out.print(list.get(i) + " ");
        // }

        // 2 . maximum in arraylist

    //     int max = Integer.MIN_VALUE;
    //     for (int i = 0 ; i<list.size() ; i++) {
    //         if (list.get(i) > max) {
    //             max =list.get(i);
    //         } 
    //     }
    //     System.out.println("Maximum element : " + max);


    // 3. Swap 2 numbers 
    // int idx1 = 1 , idx2 = 3;
    // swap(list, idx1, idx2);
    // for (int i = 0 ; i<list.size(); i++) {
    //     System.out.print(list.get(i) + " ");
    // }



    // 4 . Sorting an Arraylist

    System.out.println(list);
    Collections.sort(list); // acending order
    System.out.println(list);
    Collections.sort(list, Collections.reverseOrder()); // `decending order
    System.out.println(list);
     }
}
