
import java.util.Scanner;

public class QuesOne {

    // Calculate odd and Even 

    public  static  void oddEven(int n) {
        int Mask = 1;
        if ((n & Mask) == 0) {
            System.out.println("Even Number ");
        } else {
            System.out.println("Odd Number");
        }
        
    }


    // Get ith Bit

    public static int getIthBit(int n, int i) {
        int bitMask = 1<<i;
        if ((n& bitMask ) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    // Set ith Bit 

    public static int setIthBit(int n , int i ) {
        int bitMask = 1<<i;
        return n| bitMask;
    }


    // Clear ith Bit

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1<<i);
        return n & bitMask;
    }


    // Clear i bits

    public static int clearIthBits(int n, int i ) {
        int bitMask =((-1) << i);
        return n & bitMask;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no : ");
        int n = sc.nextInt();
        System.out.print("Enter i : ");
        int i = sc.nextInt();
        oddEven(n);
        System.out.println(getIthBit(n, 2));
        System.out.println(setIthBit(n, i));
        System.out.println(clearIthBit(n, i));
        System.out.println(clearIthBits(n, i));
        
     }
}
