public class Problem {


    // 1. Tiling Problem 

    public static int tillingProblem(int n ) {
       
        if (n ==0 || n==1) {
            return 1;
        }
        // vertical Tile arrangement

        int verticle = tillingProblem(n-1);

        // Horizontal tile arrangement

        int horizontal = tillingProblem(n-2);

        // Total ways 

        int total = verticle + horizontal;
        return  total;
    }

    // 2. Remove duplicates

    public static void removeDuplicates(String str , int idx, StringBuilder newStr, boolean map[] ) {
        if (idx == str.length()) {
            System.err.println(newStr);
            return;
        }
        // kaam 

        char currChar = str.charAt(idx);
        if (map[currChar-'a'] == true) {
            removeDuplicates(str, idx +1 , newStr, map);
        } else {
            map[currChar-'a'] = true;
            removeDuplicates(str, idx + 1, newStr.append(currChar), map);
        }

    }


    public static void main(String[] args) {
        String str = "appnnacollege";
        //System.out.println(tillingProblem(n));
        boolean[] map = new boolean[26];
        removeDuplicates(str, 0, new StringBuilder(""), map);

    }
}
