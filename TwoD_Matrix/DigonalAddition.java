import java.util.*;


public class DigonalAddition {
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

     

    }
}
