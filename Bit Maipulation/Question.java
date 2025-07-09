
import java.util.Scanner;

public class Question {

    public static int QuesOne(int a , int b) {
        a = a ^ b;
        b = a ^ b; // b = (a ^ b) ^ b = a
        a = a ^ b; // a = (a ^ b) ^ a = b

        System.out.println("a = " + a + ", b = " + b);


        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b : ");
        int b = sc.nextInt();
        QuesOne(a, b);
    }
}
