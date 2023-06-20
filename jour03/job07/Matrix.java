public class Matrix {
    public static void main(String[] args) {
        int[][] matrice1 = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] matrice2 = {{10,20,30}, {40,50,60}, {70,80,90}};

        for (int i=0; i<matrice1.length; i++) {
            for (int j=0; j<matrice1.length; j++) {
                System.out.print(matrice1[i][j] + " ");
            }
            System.out.println(); // for new line
        }

        // We create a new matrix
        int[][] matrix_sum = new int[3][3];
        System.out.println("Sum : ");

        for (int i=0; i<matrice1.length; i++) {
            for (int j=0; j<matrice1.length; j++) {
                matrix_sum[i][j] = matrice1[i][j] + matrice2[i][j];
                System.out.print(matrix_sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
