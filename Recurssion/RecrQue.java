
public class RecrQue  {

    // 1. Print Number is  Decreasing Order

    public static void printNum(int n) {
        if (n == 0) {
            return;
        } else {
            System.out.println(n);
            printNum(n-1);
        }
 
    }

    // 2. Factorial by Recursion

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }  
        int fn = n* fact(n-1);
        return fn;
    }

    // 3. Print N Numbers in Increasing Order
     
    public static void printInc(int n ) {
        if (n ==0) {
            return;
        }
        printInc(n-1);
        System.out.println(n);
    }


    // 4. Sum of N natural numbers


    public static int Sum(int n) {
    if (n == 0) {
        return 0;
    }
    return n + Sum(n - 1);
}



    public static void main(String[] args) {
        int n = 5
        ;
        // printNum(n);
        // printInc(n);
        //System.out.println(fact(n));
       // System.out.println(Sum(n));

    }
}
