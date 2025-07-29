package JavaSamplePrograms;

public class MatrixAddition {
    public static void main(String[] args) {
        int matrix1[][] = {{10,20,30},{10,20,30},{10,20,30}};
        int matrix2[][] = {{30,20,10},{30,20,10},{30,20,10}};

        int resultMatrix[][] = new int[3][3];

        for (int i = 0; i <matrix1.length ; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];

            }
        }
        for (int i = 0; i <resultMatrix.length ; i++) {
            for (int j = 0; j < resultMatrix.length; j++) {
                System.out.print(resultMatrix[i][j]+ " ");

            }
            System.out.println();

        }

    }
}
