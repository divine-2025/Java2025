package JavaSamplePrograms;

import java.util.Scanner;

public class CigarParty
{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter number of cigars");
        int num = scanner.nextInt();

        System.out.println("Is weekend party Y/N? ");
        String isWeekend = scanner.next();

            if ((isWeekend=="y" || isWeekend=="Y" )&& num>40 )
            {
                System.out.println("party is Successful");
            } else if (num >=40 && num <=60) {
                System.out.println("party is Successful");
                
            }
            else
            {
                System.out.println("party is not Successful");
            }

    }
}
