import java.util.ArrayList;
import java.util.Collections;
public class LonelyNum {

public static ArrayList<Integer> findLonely(ArrayList<Integer> nums) {
    Collections.sort(nums);  // sort for easy neighbor checking
    ArrayList<Integer> list = new ArrayList<>();

    // Case: single element
    if (nums.size() == 1) {
        list.add(nums.get(0));
        return list;
    }

    // Check first element
    if (nums.get(0) + 1 < nums.get(1)) {
        list.add(nums.get(0));
    }

    // Check middle elements
    for (int i = 1; i < nums.size() - 1; i++) {
        if (nums.get(i - 1) + 1 < nums.get(i) && nums.get(i) + 1 < nums.get(i + 1)) {
            list.add(nums.get(i));
        }
    }

    // Check last element
    if (nums.get(nums.size() - 2) + 1 < nums.get(nums.size() - 1)) {
        list.add(nums.get(nums.size() - 1));
    }

    return list;
}

    public static void main(String[] args) {
         ArrayList<Integer> nums = new ArrayList<> ();
        nums.add(1);
        nums.add(3);
        nums.add(5);
        nums.add(3);
        System.out.println(findLonely(nums));

    }
    
}
