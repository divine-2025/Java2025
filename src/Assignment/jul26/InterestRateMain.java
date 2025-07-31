package Assignment.jul26;

import java.util.Scanner;

public class InterestRateMain {
    public static void main(String[] args) {
        String answer ;
        int  optionValue;
        Scanner scanner =new Scanner(System.in);

        BankOfCanada.rateOfInterest= 5.0;

        do {
            System.out.println("*** Select any Bank For Print Interest Rate ***\n"+" 0 for Bank Of Canada"+ "\n 1 for BMO"+"\n 2 for Scotia"+"\n 3 for TD \n"+" 4 for RBC" + "\n 5 for Pragra \n");
            optionValue = scanner.nextInt();


            switch (optionValue){
                case 0:{
                    BankOfCanada bankOfCanada = new BankOfCanada();
                    System.out.print("Bank Of Canada Interest Rate : ");
                    System.out.println( bankOfCanada.RateOfInterest());
                    break;
                }
                case 1:{
                    BankOfCanada bmoObject = new InternalBank(1.15);
                    System.out.print("BMO Interest Rate : ");
                    System.out.println(bmoObject.RateOfInterest());
                    break;
                }

                case 2:{
                    BankOfCanada scotiaObj = new InternalBank(1.10);
                    System.out.print("Scotia Bank Interest Rate : ");
                    System.out.println( scotiaObj.RateOfInterest());
                    break;
                }

                case 3:{
                    BankOfCanada tdObj = new InternalBank(1.25);
                    System.out.print("TD Bank Interest Rate : ");
                    System.out.println(tdObj.RateOfInterest());
                    break;
                }

                case 4:{
                    BankOfCanada rbcObj = new InternalBank(1.50);
                    System.out.print("RBC Bank Interest Rate : ");
                    System.out.println(rbcObj.RateOfInterest());
                    break;
                }
                case 5:{
                    BankOfCanada pragraObj = new InternalBank(0.0);
                    System.out.print("New Pragra Bank Interest Rate : ");
                    System.out.println(pragraObj.RateOfInterest());
                    break;
                }


                default:
                {
                    System.out.println("Invalid Input !...");
                    break;
                }
            }

            System.out.println("Do you Want to Continue....Y/N ?");
            answer = scanner.next().toUpperCase();
            while ( !answer.equals("Y") && !answer.equals("N")){
                System.out.println("Please Enter Valid Input \nDo you Want to Continue....Y/N ?");
                answer = scanner.next().toUpperCase();
            }
            if (answer.equals("N")){
                break;
            }

        }while (answer.equals("Y") );

    }
}
