package jul29;

public class UserlogIn {
    private String userName;
    private String password;

    public UserlogIn(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void loginUser(String userName, String password){
        if(this.userName.equals(userName) && this.password.equals(password)){
            System.out.println("user is authenticated ");
            System.out.println("welcome to my app");
        }
        else {
            System.err.println("Invalid Username Or Password....!");
        }

    }
}
