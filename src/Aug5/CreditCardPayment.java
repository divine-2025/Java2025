package Aug5;

public class CreditCardPayment extends Payment {
    @Override
    public void validate() {
        System.out.println("Validate Credit Card");

    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Payment processed for Credit Card" + amount);
        super.processPayment(19);
    }

}
