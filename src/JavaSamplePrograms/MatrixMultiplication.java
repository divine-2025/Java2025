package JavaSamplePrograms;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int mat1[][] = new int[2][3];
        int mat2[][] =  new int[3][2];
        int result[][] = new int [2][2];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <mat1.length ; i++) {
            for (int j = 0; j <3; j++) {
                System.out.println("Enter matrix 1  -" + i + "X" +j);
                mat1[i][j] = scanner.nextInt();
            }

        }
        for (int i = 0; i <mat2.length ; i++) {
            for (int j = 0; j <2 ; j++) {
                System.out.println("Enter matrix 2  -" + i + "X" +j);
                mat2[i][j] = scanner.nextInt();
            }

        }
        for (int i = 0; i <mat1.length ; i++) {
            for (int j = 0; j <mat2.length ; j++) {
                result [i][j]= mat1[i][j]*mat2[j][i];
            }

        }
        for (int i = 0; i <result.length ; i++) {
            for (int j = 0; j <result.length ; j++) {
                System.out.println(result[i][j]);
            }
            System.out.println();

        }

    }
}
