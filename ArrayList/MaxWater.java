
import java.util.ArrayList;

public class MaxWater {
 

    // 1. Brute force Approach  tc -> O(n)
    // public static int storeWater(ArrayList<Integer> height) {
    //     int max = 0;
    //     for (int i = 0 ; i<height.size();i++) {
    //         for (int j = i+1 ; j< height.size(); j++) {
    //             int  ht = Math.min(height.get(i) , height.get(j));
    //             int width = j -i;
    //             int area = ht * width;
    //             max = Math.max(max , area);
    //         }
    //     }
    //     return max;
    // }


    //  2. Two pointer Approach
    public static int TwoPointerAppro(ArrayList <Integer> height) {
        int max = 0;
        int lp = 0;
        int rp = height.size() -1 ;
        
        while(lp<rp) {

            // calculate water area
            int ht = Math.min(height.get(lp) , height.get(rp));
            int width = rp -lp;
            int area = ht * width;
            max = Math.max(max, area);

            // update pointer

            if (height.get(lp) < height.get(rp)) {
            lp++;
            } else  {
             rp--;
          }
        }

        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height  = new ArrayList<>();
        
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        // System.out.println(storeWater(height));
        System.out.println(TwoPointerAppro(height));
    }
}
