import java.util.ArrayList;

public class PairSumOne {
    
// 1. brute force Approach

    public static boolean paiSumOne(ArrayList<Integer> list , int target) {

        for (int i = 0 ; i<list.size(); i++) {
            for (int j = i+1;j<list.size(); j++ ) {
                if (list.get(i) + list.get(j) == 5)  {
                    System.out.println( "( " + list.get(i) + " , " + list.get(j) + " ) ");
                    
                }
            }
        }
        return false;
    }

    // 2 . two pointer Approach 


    public static void pairSumOne (ArrayList<Integer> list , int target ) {
        int lp = 0;
        int rp = list.size()-1;
        ArrayList<String> pairs = new ArrayList<>();
        while (lp < rp ) {
            if (list.get(lp) +(list.get(rp) ) == target) {
                pairs.add("( " + list.get(lp) + " , " + list.get(rp) + " )");
            lp++;
            rp--;  // move both to find new pairs

            } else if (list.get(lp) + (list.get(rp) )< target) {
                lp++;
            } else {
                rp--;
            }
        }
        System.out.println(pairs);
    } 
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<> ();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 5;
        System.out.println("All possible pairs are : ");
        // paiSumOne(list, target);
        pairSumOne(list, target);
    }
}
