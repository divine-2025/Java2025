package JavaSamplePrograms;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 3 digit number ");
        int num = scanner.nextInt();
        int x=num;
        int reverse = 0;
        int sum = 0;
        int reminder=0;
        for(int i=0;i<3;i++ )
        {
            reminder= num %10;
             reverse = reverse *10 + reminder ;
             num = num/10;
             //sum = sum + reminder;


        }
       System.out.println("reverse ="+ reverse);
        //System.out.println("sum = "+ sum);
        if(x==reverse)
            System.out.println("palindrome" +reverse);


    }
}
