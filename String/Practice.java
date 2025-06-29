import java.util.*;

public class Practice {

// Question 1 : to count lower case  vowels 
    public static int loverCaseVowel(String str) {

        int count = 0;
        for (int i = 0; i< str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch =='e' || ch == 'i' || ch== 'o' || ch == 'u') {
                count++;
            }
        }
        return count; 
    }


    // Question 2 : String are anagrams or not

    public static void anagram(String str, String str1) {
        str = str.toLowerCase();
        str1 = str1.toLowerCase();


        // first check if strings length is same or not 

        if (str.length() == str1.length()) {
            // Converting the  string into character array

            char [] strArray = str.toCharArray();
            char [] str1Array = str1.toCharArray();

            // sort the array

            Arrays.sort(strArray);
            Arrays.sort(str1Array);

            //if the sorted character array are same then string is anagram

            boolean result = Arrays.equals(strArray, str1Array);
            if (result) {
                System.out.println("Strings are anagrams of each other.");
            } else {
                System.out.println("String are not anagrams of each other.");
            }

        } else {
            System.out.println("String are not anagrams of each other.");
        }
        
    }

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
        String str1 = sc.nextLine();
        System.out.println("Lower case vowel are : " + loverCaseVowel(str));
        anagram(str, str1);

        sc.close();
    }
  
}
