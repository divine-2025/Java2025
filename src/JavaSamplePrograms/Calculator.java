package JavaSamplePrograms;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String exit = "Y";
        int op;
        double a,b,result;
        while (exit.equals("y") || exit.equals("Y")) {
            System.out.println("************************");
            System.out.println("1- Addition");
            System.out.println("2- Subtraction");
            System.out.println("3- JavaSamplePrograms.Multiplication");
            System.out.println("4- Division");
            System.out.println("5- Modulus");
            System.out.println("0- Exit");
            System.out.println("**************************");
            System.out.println("Enter any Operation");
            op = scanner.nextInt();


            switch (op) {
                case 1: {
                    System.out.println("Enter First Value : ");
                    a = scanner.nextDouble();
                    System.out.println("Enter Second Value : ");
                    b = scanner.nextDouble();
                    System.out.println(a + b );
                    System.out.println("Do You Want To Continue Y/N ?");
                    exit = scanner.next();
                    break;
                }
                case 2: {
                    System.out.println("Enter First Value : ");
                    a = scanner.nextDouble();
                    System.out.println("Enter Second Value : ");
                    b = scanner.nextDouble();
                    System.out.println(a - b);
                    System.out.println("Do You Want To Continue Y/N ?");
                    exit = scanner.next();
                    break;
                }
                case 3: {
                    System.out.println("Enter First Value : ");
                    a = scanner.nextDouble();
                    System.out.println("Enter Second Value : ");
                    b = scanner.nextDouble();
                    System.out.println(a * b);
                    System.out.println("Do You Want To Continue Y/N ?");
                    exit = scanner.next();
                    break;
                }
                case 4: {
                    System.out.println("Enter First Value : ");
                    a = scanner.nextDouble();
                    System.out.println("Enter Second Value : ");
                    b = scanner.nextDouble();
                    System.out.println(a / b);
                    System.out.println("Do You Want To Continue Y/N ?");
                    exit = scanner.next();
                    break;
                }
                case 5: {
                    System.out.println("Enter First Value : ");
                    a = scanner.nextDouble();
                    System.out.println("Enter Second Value : ");
                    b = scanner.nextDouble();
                    System.out.println(a % b);
                    System.out.println("Do You Want To Continue Y/N ?");
                    exit = scanner.next();
                    break;
                }
                case 0: {
                    exit = "n";
                    break;
                }
                default:
                    System.out.println("Invalid Entry");
                    break;
            }


        }
    }
}
