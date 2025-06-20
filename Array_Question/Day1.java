import java.util.*;

public class Day1 {
    // Question 1 : Sorting array using insertion sort 
    public static void InsertionSortR(int arr[]) {
        for (int i = 1 ; i< arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            while (prev>=0 && arr[prev] < curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int n ;
        System.out.println("Enter the size of array : ");
        n = sc.nextInt();
        int arr[] = new int [n];

        // Take input of array elements from array
        System.out.println("Enter the array elements : ");
        for (int i = 0 ; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        InsertionSortR(arr);
        int mid = n/2;
        System.out.println("The Majority Element : " + arr[mid]);
    }
}
