import java.util.*;
public class palindrome {
    public static  boolean palindrome(String str) {
        for (int i = 0 ; i<str.length()/2 ; i++) {
            if (str.charAt(i)!= str.charAt(str.length()-1-i)) {
                System.out.println("String is not palindrome");
                return false;
            }
        }
        System.out.println("Sting is pallindrome ");
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        System.out.print("Enter string to check palindrome or not : ");
        str = sc.nextLine();
        palindrome(str);
    }
}

