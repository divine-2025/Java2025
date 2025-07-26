import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int x=1;

        while( x<count)
        {
            if(x%2 == 1)
            System.out.println(x);
            x++;
        }

    }
}
