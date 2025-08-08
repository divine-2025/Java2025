package Aug5;

public class PaypalPayment extends Payment {
    @Override
    public void validate() {
        System.out.println("Validate for Paypal");

    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Payment processed for Paypal" + amount);
    }

}
