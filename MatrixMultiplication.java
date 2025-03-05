import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter rows and columns for first matrix: ");
        int r1 = scanner.nextInt();
        int c1 = scanner.nextInt();
        int[][] matrix1 = new int[r1][c1];
        
        System.out.print("Enter rows and columns for second matrix: ");
        int r2 = scanner.nextInt();
        int c2 = scanner.nextInt();
        int[][] matrix2 = new int[r2][c2];
        
        if (c1 != r2) {
            System.out.println("Matrix multiplication is not possible.");
            return;
        }
        
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        
        int[][] result = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        
        System.out.println("Resultant matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        
       
    }
}
