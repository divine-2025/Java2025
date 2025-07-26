import java.util.Scanner;

public class PrintNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int x=1;
        int r=0;
        while(x<=count)
       // while(x<=100)
        {
          r=r+x++;

        }
        System.out.println("sum=" +r);
    }
}
