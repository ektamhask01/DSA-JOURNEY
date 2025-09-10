import java.util.ArrayList;
import java.util.HashMap;

public class MostFrequentNum {
    
    public static int getFrequentNum( ArrayList<Integer> list  , int key) {
        HashMap <Integer , Integer> map = new HashMap<>();
         // edge case
            if (list.size() == 1) {
                return 1;
            }
        for (int i = 0 ; i<=list.size()-2; i++) {
            if(list.get(i) == key) {
                int target = list.get(i+1);
                map.put(target , map.getOrDefault(target, 0) +1 );
            }
        }

        // Find max count

        int maxTarget = -1;
        int maxCount = 0;
        for(int Key : map.keySet()) {
            if (map.get(Key) > maxCount) {
                maxCount = map.get(Key);
                maxTarget= Key;

            }
        }

        return maxTarget;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int key = 1;
        list.add(1);
        list.add(100);
        list.add(200);
        list.add(1);
        list.add(100);

        System.out.println(getFrequentNum(list, key));

    }

}
