public class PrintXtoPowerN {

    // Normal code time complexity => O(n)

    public static int pow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x* pow(x, n-1);

    }

    // Optimized Code for x^n  of O (log(n)) time complexity
    

    public  static int OptimizePow(int x , int n) {
        if (n == 0 ){
            return 1;
        }
        
        int halfPowSqaure  = OptimizePow(x, n/2) * OptimizePow(x, n/2);
        // n is odd
        if (n%2 != 0) {
            halfPowSqaure = x * halfPowSqaure;
        }
        return halfPowSqaure;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        //System.out.println("answer : " + pow(x, n));
        System.out.println(OptimizePow(x, n));

    }
    
}
