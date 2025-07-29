package JavaSamplePrograms;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter limit -");
        int limit = scanner.nextInt();
        int a=0;
        int i=0;
        int j=1;
        int k =0 ;
        while ( k < limit)
        {

            System.out.println(k);
            i=j;
            j=k;
            k=i+j;
            a=i+1;
        }

    }
}
