package JavaSamplePrograms;

import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x= scanner.nextInt();
        int fact=1;
        for(int i=x;i>0;i--)
        {
            fact *=i;
        }
        System.out.println("factorial of "+x +" "+fact);
        }

    }

