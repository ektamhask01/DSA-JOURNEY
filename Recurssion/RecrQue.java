
public class RecrQue  {
    public static void printNum(int n) {
        if (n == 0) {
            return;
        } else {
            System.out.println(n);
            printNum(n-1);
        }
 
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }  
        int fn = n* fact(n-1);
        return fn;
    }
     
    public static void printInc(int n ) {
        if (n ==0) {
            return;
        }
        printInc(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n = 4
        ;
        // printNum(n);
        // printInc(n);
        System.out.println(fact(n));
    }
}
