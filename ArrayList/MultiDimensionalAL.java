
import java.util.ArrayList;



public class MultiDimensionalAL {
    public static void main(String[] args) {

        // cration of ArrayList --------------------------------------------------------------------



        // ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // mainlist.add(list);
        // ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add(4) ; list2.add(5);list2.add(6);
        // mainlist.add(list2);

        // System.out.println(mainlist);

        // for (int i = 0 ; i<mainlist.size(); i++) {
        //     ArrayList<Integer> currList = mainlist.get(i);
        //     for (int j = 0 ; j<currList.size(); j++) {
        //         System.out.print(currList.get(j) + " ");
        //     }
        //     System.out.println();
        // }


        ArrayList<ArrayList<Integer>>mainArrayList = new ArrayList<>();
        ArrayList <Integer> list1 = new ArrayList<>();
        ArrayList <Integer> list2 = new ArrayList<>();
        ArrayList <Integer> list3 = new ArrayList<>();
        
        for (int i = 1 ; i<= 5 ; i++) {
            list1.add(i);
            list2.add(i*2);
            list3.add(i*3);
        }
       mainArrayList.add(list1);
       mainArrayList.add(list2);
       mainArrayList.add(list3);

       System.out.println(mainArrayList);
       for (int i = 0 ; i<mainArrayList.size(); i++)  {
        ArrayList<Integer> cuArrayList = mainArrayList.get(i);
        for (int j = 0 ; j<cuArrayList.size(); j++) {
            System.out.print(cuArrayList.get(j) + " ");
        }
        System.out.println();
       }

    }
}
