package Aug5;

public class DebitCardPayment extends Payment {
    @Override
    public void validate() {
        System.out.println("Validate for DebitCard");

    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Payment processed for DebitCard" + amount);
    }

}

