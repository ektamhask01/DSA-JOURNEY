

public class PracticeQ {

    // Question 1 : print occurances of key by idx

    public static  void occuranceKey(int arr[] , int key , int idx) {
        // base 
        if (idx == arr.length) {
            return ;
        }

        // kaam
   
        if (arr[idx] == key) {
            System.out.print(idx + " ");
        }

        // occuranceKey(arr, key, idx+1);

    }

    // Question 2 : print  num into string format as 19 -> one nine

    public static void numToString(int number,   String[] digits ) {
        if (number  == 0 )  {
            return;
        }

        numToString(number/10 , digits);
        System.out.print( digits[number % 10 ] + " ");
       
    }


    //  Question 3 : find length of string 

    public static int findLengthOfString(String str ) {
        if (str.length() == 0) {
            return 0;
        }
       return 1 + findLengthOfString(str.substring(1));
    }


    // Question 4 : 

    public static void main(String[] args) {

        String[] digits = {"zero", "one", "two","three", "four", "five", "six", "seven", "eight", "nine"};
        int key = 2;
        int number = 2010;
        String str = "Hello";
        int length = findLengthOfString(str );
        System.out.println(length);
        // numToString(number, digits);
        // occuranceKey(arr, key, 0  );
     

    }

}
