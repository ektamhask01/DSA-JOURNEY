import java.util.*;

public class SearchInSortedMatrix {
     
    public static boolean staircaseSearch(int matrix[][] , int key) {
        int row = 0 , col = matrix[0].length-1;

        while ( row < matrix.length && col >= 0) {
            if (matrix[row][col] == key ) {
                System.out.println("Key found at ( " + row + " , " + col + ")");
                return true;
            }

            else if (key <matrix[row][col] ) {
                col--;
            } 
            else {
                row++;
            }
        }
        System.out.println("Key is not present!");
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int m;
        int key;
        System.out.println("Enter the no. of rows in 2D array : ");
        n = sc.nextInt();
        System.out.println("Enter the no. of columns in 2D array : ");
        m = sc.nextInt();
        int matrix[][] = new int[n][m];
        System.out.println("Add the elements in  2D array : ");
        for (int i = 0 ; i<n; i++) {
            for (int j= 0; j<m;j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter key to search : ");
        key = sc.nextInt();
        System.out.println("Matrix is given as : ");

        for (int i = 0 ; i < n; i++) {
            for (int j = 0 ; j<m;j++) {

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        staircaseSearch(matrix, key);
 
     

    }
}

