import java.util.*;

public class DigonalAddition {

    public static void diagonalSum(int matrix[][] ) {
        int sum = 0;
         
        // O (n^2 time complexity)

        // for (int i = 0; i<matrix.length ; i++) {
        //     for (int j = 0 ; j<matrix[0].length; j++) {
        //         if ( i == j ) {
        //             sum += matrix[i][j];
        //         } 
        //         if  ((i+j )== matrix.length-1) {
        //             sum += matrix[i][j];
        //         }

        //     }
        // }


        // Optimized code of O(n ) time complexity


        for (int i = 0 ; i< matrix.length; i++) {

            // Primatry diagonal

            sum += matrix[i][i];

            // Secondary diagonal
            int  j = matrix.length -1-i;
            if (i != j) {
                sum += matrix[i][j]; 
            }


        }

        System.out.println("Diagonal sum is : " + sum);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int m;
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

        System.out.println("Matrix is given as : ");

        for (int i = 0 ; i < n; i++) {
            for (int j = 0 ; j<m;j++) {

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        diagonalSum(matrix);
     

    }
}
