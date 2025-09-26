public class MatrixMultiplication {
    public static void main(String[] args) {
        // Define first matrix (2x3)
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Define second matrix (3x2)
        int[][] matrix2 = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        // Resultant matrix will be 2x2
        int[][] result = new int[matrix1.length][matrix2[0].length];

        // Matrix multiplication logic
        for (int i = 0; i < matrix1.length; i++) {              // loop through rows of matrix1
            for (int j = 0; j < matrix2[0].length; j++) {       // loop through columns of matrix2
                for (int k = 0; k < matrix2.length; k++) {      // loop through rows of matrix2
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Print the result
        System.out.println("Multiplication of two matrices:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println(); // next line after each row
        }
    }
}