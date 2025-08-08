package Aug5;

public class PaymentMain {
    public static void main(String[] args) {
        Payment payment =new CreditCardPayment();
        Payment payment1 =new PaypalPayment();
        Payment payment2 =new DebitCardPayment();

        System.out.println("Payment for Credit Card");
        payment.validate();
        payment.processPayment(900);
        System.out.println();
        System.out.println("Payment for Paypal");
        payment1.validate();
        payment1.processPayment(1000);
        System.out.println();
        System.out.println("Payment for Debit Card");
        payment2.validate();
        payment2.processPayment(800);
    }
}
