import java.util.Scanner;

public class BankClass {

    String accountHolder = "Jatin";
    int accountNumber = 920001;
    double accountBalance= 200;
    String accountType = "Savings";
    static double interestRate = 9.5;

    BankClass(){
        //this(1000,900);



    }

   public BankClass(int accountNumber, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;

    }

    public BankClass(String accountType, int accountNumber, double accountBalance) {
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;


    }
    public void Deposit(double amount)
    {
        accountBalance =accountBalance +amount;

    }
    public void Withdraw(double amount)
    {
        accountBalance =accountBalance - amount;

    }
    public void Balance()
    {
        System.out.println("Account Balance = "+ accountBalance);

    }
    public static double calcualteInterest(double amount) {
    return (amount*interestRate)/100;

    }

    public void  PrintAccount()
    {
        System.out.println("Account Holder Name = "+ accountHolder);
        System.out.println("Account Number = "+ accountNumber);
        System.out.println("Account Type = "+ accountType);
        System.out.println("Account Balance = "+ accountBalance);
        System.out.println("Interest Rate = " + interestRate);
    }


}
