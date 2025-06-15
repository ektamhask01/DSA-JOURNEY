import  java.util.*;

public  class  SpiralMatrix {

    public  static void printSpiral(int matrix[][]) {
    int startRow = 0;
    int startCol = 0;
    int endRow = matrix.length - 1;
    int endCol = matrix.length -1;

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
            System.out.print(matrix[endRow][i] + " ");
        }

        // left


        for (int j = endRow-1; j>startRow; j--) {
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

        int matrix[][] = new int[4][4];
        System.out.println("Add the elements in the 4 by 4 2D array : ");
        for (int i = 0 ; i<matrix.length; i++) {
            for (int j= 0; j<matrix.length;j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix is given as : ");

        for (int i = 0 ; i < matrix.length; i++) {
            for (int j = 0 ; j<matrix.length;j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Spiral Matrix Output  : " );
        printSpiral(matrix);

    }
}