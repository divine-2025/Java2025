package Aug12;

import java.util.Scanner;

public class BankMainClass {

    public static void main(String[] args) {

        int optionValue;
        BankAccount bankAccount = new BankAccount();
        Scanner scanner = new Scanner(System.in);



            System.out.println("*** Select any option ***\n" + " 0 for Check Balance" + "\n 1 for Withdraw" + "\n 2 for Deposit");
            optionValue = scanner.nextInt();


            switch (optionValue) {
                case 0: {

                        System.out.println("Balance :" + bankAccount.balance());

                    break;

                }
                case 1: {
                    System.out.println("enter amount ");
                    try {
                        double currentBalance = bankAccount.withdraw(scanner.nextDouble());
                        System.out.println("Current Balance :"+currentBalance);
                    }catch (Exception e) {
                    e.printStackTrace();
                }


                    break;
                }

                case 2: {
                    System.out.println("enter amount deposit");

                    double currentBalance = bankAccount.deposit(scanner.nextDouble());
                    System.out.println("Current Balance :"+currentBalance);
                    break;

                }


                default: {
                    System.out.println("Invalid Input !...");
                    break;
                }
            }



    }
}
