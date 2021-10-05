import java.util.Scanner;

public class TichMaTranChuyenVi {

    static void printMatrix(int[][] M, int rowSize, int colSize) {
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++)
                System.out.print(M[i][j] + " ");
            System.out.println();
        }
    }


    static void multiplyMatrix(int row1, int col1, int[][] A, int row2, int col2, int[][] B) {
        int i, j, k;
        int[][] C = new int[row1][col2];
        for (i = 0; i < row1; i++) {
            for (j = 0; j < col2; j++) {
                for (k = 0; k < row2; k++)
                    C[i][j] += A[i][k] * B[k][j];
            }
        }
        printMatrix(C, row1, col2);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int u = 0; u < t; u++) {
            int h, c;
            h = scanner.nextInt();
            c = scanner.nextInt();
            int [][] A = new int[h][c];
            int [][] B = new int[c][h];
            for (int i = 0; i < h; i++) {
                for (int j =0;j<c;j++){
                    A[i][j] = scanner.nextInt();
                    B[j][i] = A[i][j];
                }
            }
            System.out.println("Test "+(u+1)+":");
            multiplyMatrix(h, c, A, c, h, B);
        }
    }
}

