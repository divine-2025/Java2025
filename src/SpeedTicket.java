import java.util.Scanner;

public class SpeedTicket {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter speed");
        int speed = scanner.nextInt();
        System.out.println("Is your Birth Day y/n");

        String bDay= scanner.next();


        if(speed<= 60 || bDay=="10/19/90" )
        {
            if (speed<=65) {
                System.out.println("ticket is 0");
            }
            else
            {
                System.out.println("ticket is 0");
            }
        }
        if(speed>= 60 && speed <=80 || bDay=="10/19/90" )
        {
            if (speed<=85) {
                System.out.println("ticket is 0");
            }
            else
            {
                System.out.println("ticket is 1");
            }
        }
        if(speed> 80 || bDay=="10/19/90" )
        {
            if (speed>85) {
                System.out.println("ticket is 1");

            }
            else
            {
                System.out.println("ticket is 2");
            }
        }
    }
}
