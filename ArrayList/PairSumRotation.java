import java.util.ArrayList;

public class PairSumRotation {
    

    public static void PairSum(ArrayList <Integer> list , int target) {
        int bp = -1; // Breaking point

        for (int i = 0; i<list.size()-1; i++) {
            if (list.get(i) > list.get(i+1)) {
                bp = i;
                break;
            }    
        }

        int lp = bp+1; // smallest
        int rp = bp; // largest

        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                System.out.println("( " + lp + " , " + rp + " )" );
                break;
            } else if (list.get(lp) + list.get(rp) >target) {
                rp = (list.size() + rp -1) % list.size();
            } else {
                lp = (lp +1) % list.size();
            }
        }

    }

    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        int target = 16;
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(list);
        PairSum(list, target);

    }
}
