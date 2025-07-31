package jul29;

import java.util.Scanner;

public class UserAppAmin {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String username,password;
        System.out.println("Enter User Name :");
        username=scanner.next();
        System.out.println("Enter Password :");
        password=scanner.next();
        UserlogIn userLogin = new UserlogIn("user1","123");
        userLogin.loginUser(username,password);



       userLogin.setPassword("0000");
        //System.out.println(userLogin.getUserName());
       userLogin.loginUser("user1","123");
    }
}
