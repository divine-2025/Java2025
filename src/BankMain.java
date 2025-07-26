import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Default Constructor");

        BankClass bankClass = new BankClass();
        bankClass.PrintAccount();

        System.out.println("2 pra");
        BankClass bankClass1 =new BankClass(8888,500.89);
        bankClass1.PrintAccount();

        System.out.println("3 para");
        BankClass bankClass2 = new BankClass("RRSP",1100,900);
        bankClass2.PrintAccount();

        System.out.println("Enter Amount for check Interest  -- ");
        double amount = scanner.nextDouble();
        System.out.println(BankClass.calcualteInterest(amount));


        // System.out.println("Amount Deposit :");
        // bankClass.Deposit(scanner.nextDouble());
        // System.out.println("Amount Withdraw :");
        //bankClass.Withdraw(scanner.nextDouble());
        // System.out.println("Balance :");
        // bankClass.Balance();





    }
}
