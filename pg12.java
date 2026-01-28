class MatrixOperations {

    // Method to add two 2x2 matrices
    void addMatrices(int[][] a, int[][] b) {
        System.out.println("Addition of 2x2 matrices:");
        int[][] result = new int[2][2];
        int[] a1=new int[10];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        displayMatrix(result);
    }

    // Method to add two 3x3 matrices
    void addMatrices(int[][] a, int[][] b, int size) {
        System.out.println("Addition of 3x3 matrices:");
        int[][] result = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        displayMatrix(result);
    }

    // Method to add matrices of any dimensions
    void addMatrices(int[][] a, int[][] b, int rows, int cols) {
        System.out.println("Addition of matrices of any dimension:");
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        displayMatrix(result);
    }

    // Method to display a matrix
    void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

public class pg12 {
    public static void main(String[] args) {

        MatrixOperations mo = new MatrixOperations();

        // 2x2 matrices
        int[][] m1 = { {1, 2}, {3, 4} };
        int[][] m2 = { {5, 6}, {7, 8} };
        mo.addMatrices(m1, m2);

        // 3x3 matrices
        int[][] m3 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int[][] m4 = { {9, 8, 7}, {6, 5, 4}, {3, 2, 1} };
        mo.addMatrices(m3, m4, 3);

        // Any dimension matrices (2x3)
        int[][] m5 = { {1, 2, 3}, {4, 5, 6} };
        int[][] m6 = { {6, 5, 4}, {3, 2, 1} };
        mo.addMatrices(m5, m6, 2, 3);
    }
}
