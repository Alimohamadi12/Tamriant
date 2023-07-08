public class Main {
        public static void main(String[] args) {
            int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
            int rows = matrix.length;
            int col = matrix[0].length;
            int[][] transposed = new int[col][rows];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < col; j++) {
                    transposedMatrix[j][i] = matrix[i][j];
                }
            }
            System.out.println("Original Matrix:");
            printMatrix(matrix);
            System.out.println("Transposed Matrix:");
            printMatrix(transposedMatrix);
        }
        public static void printMatrix(int[][] matrix) {
            int rows = matrix.length;
            int cols = matrix[0].length;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
