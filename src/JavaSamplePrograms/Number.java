package JavaSamplePrograms;

import java.util.Scanner;

public class Number {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number ");
        int a = scanner.nextInt();
        System.out.println("enter Second number");
        int b = scanner.nextInt();
        if(a<b)
        {
            for(int i = a;i>1;i--)
            {
                if(a%i==0)
                {
                    if(b%i ==0){
                        System.out.println("GCD =" +i);
                    break;}
                }
            }
        } else  {
            for(int i = b;i>1;i--)
            {
                if(b%i==0)
                {
                    if(a%i ==0){
                        System.out.println("GCD =" +i);
                    break;}
                }
            }

        }
    }
}
