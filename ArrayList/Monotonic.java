
import java.util.ArrayList;

public class Monotonic {
    
    public static Boolean monotonic( ArrayList <Integer> list) {

     if (list.size() <= 1) {
        return true;
     }

     boolean isIncreasing = true;
     boolean isDecreasing = true;

     for (int i = 0 ; i< list.size() -1; i++) {
        if (list.get(i) < list.get(i+1) ) {
            isDecreasing = false;
        } else if (list.get(i ) > list.get(i+1) ) {
            isIncreasing = false;
        }
     }

        return isDecreasing || isIncreasing;
    }
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(8);
        list.add(4);
        list.add(7);

        System.out.println(monotonic(list));
    }
}
