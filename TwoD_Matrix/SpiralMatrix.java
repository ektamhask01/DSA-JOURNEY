import java.util.*;

public  class  SpiralMatrix {

    public  static void printSpiral(int matrix[][]) {
    int startRow = 0;
    int startCol = 0;
    int endRow = matrix.length - 1;
    int endCol = matrix[0].length -1;

    while (startRow <= endRow && startCol <= endCol) {

        // top 

        for (int i = startCol;  i<= endCol;i++) {
            System.out.print(matrix[startRow][i] + " ");
        }

        // right 

        for (int j = startRow + 1; j<=endRow;j++) {
            System.out.print(matrix[j][endCol] + " ");
        }

        // bottom

        for (int i = endCol -1 ; i>= startCol; i--) {
            if (startRow ==endRow) {
                 break;
          }
            System.out.print(matrix[endRow][i] + " ");
        }

        // left


        for (int j = endRow-1; j>startRow; j--) {
             if (startCol ==endCol) {
                 break;
             }
            System.out.print(matrix[j][startCol]+ " ");
        }

        startCol++;
        startRow++;
        endCol--;
        endRow--;

 
    }

    System.out.println();

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

    

       System.out.println("Spiral Matrix Output  : " );
        printSpiral(matrix);

    }
}