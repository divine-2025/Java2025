package Aug5;

public abstract class Payment {
    public abstract void validate();
    public void processPayment(double amount){
        System.out.println("super method" + amount);
    }


}
