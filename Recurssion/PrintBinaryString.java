
// Print binary string of n size but two (1) should not come together
public class PrintBinaryString {
    public static void BinaryString(int n , int lastPlace , String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // if (lastPlace == 0) {
        //     BinaryString(n-1, 0, str.append('0'));
        //     BinaryString(n-1, 1, str.append('1'));
        // } else {
        //      BinaryString(n-1, 0, str.append('0'));
        // }

        // In simpler form

        BinaryString(n-1, 0, str + "0");
        // append 1 only if last place is 0

        if (lastPlace == 0) {
             BinaryString(n-1, 1, str + "1");
        }


    }
    public static void main(String[] args) {
        int n = 2;
        BinaryString(n, 0, "");

    }
}
