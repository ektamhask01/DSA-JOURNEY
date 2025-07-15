//  Print Nth Fibonacci Number

public class Fibonacci {

    public static int Fib(int n) {
        if(n ==0 || n ==1) {
            return n;
        }

        int fibNm1 = Fib(n -1);
        int fibNm2 = Fib(n - 2);
        int fibN = fibNm1 + fibNm2;

        return fibN;
    }

    public static void main(String[] args) {
        int n = 26;
        System.out.println(Fib(n));
    }
}
