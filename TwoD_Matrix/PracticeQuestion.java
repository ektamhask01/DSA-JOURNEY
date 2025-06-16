import java.util.*;

public class PracticeQuestion {
    // 1. Print the number of 7's that are in the 2D array

   public static void  QuestionOne(int matrix[][] ) {
        int count = 0;
        for (int i = 0 ; i<matrix.length; i++) {
            for ( int j = 0 ; j< matrix[0].length; j++) {
                if (matrix[i][j] == 7){
                    count += 1;
                }
            }
        }
        System.out.println("The no. of 7's in  2D array : " + count);
   }



   // 2. Print out the sum of the numbers in the second row of the “nums” array


   public  static void SumSecondRow(int matrix[][]) {
        int sum = 0;
        for (int j = 0; j<matrix[0].length;j++) {
            int i = 1;
            sum += matrix[i][j];
        }
        System.out.println("Sum of Second Row : " + sum);
   }

// 3 . Write a program to Find Transpose of a Matrix.

   public static void Transpose(int matrix[][]) {
        int row = matrix.length;
        int col =matrix[0].length;

        int transpose[][] = new int [col][row];

        //Transpose the matrix

        for (int i = 0 ;  i< row; i++) {
            for ( int j = 0 ; j< col; j++) {
                transpose[j][i] = matrix[i][j];
                
            }
        }

        System.out.println("Transpose matrix of given matrix : ");
        for (int i = 0 ; i<transpose.length; i++) {
            for (int j = 0 ; j< transpose[0].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }


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
 
        //QuestionOne(matrix);
        //SumSecondRow(matrix);
        Transpose(matrix);

    }

}

