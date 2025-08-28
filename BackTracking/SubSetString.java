public class SubSetString {

    public static void findSubSets(String str, String ans , int i)  {
        // base case 
        if (i == str.length()) {
            if (ans.length() ==0) {
                System.out.println("null");
                System.out.println();
            } else {
                System.out.println(ans);
            
            }
            return;
        }

        // Yes choice
        findSubSets(str, ans+ str.charAt(i), i+1);

        // No choice
        findSubSets(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abcd";
        findSubSets(str, "", 0);
    }
}
