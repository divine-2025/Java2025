package Aug5;

public class NotifierMain {

    public static void main(String[] args) {

        Notifier emailNotifier =   new EmailNotifier();
        Notifier smsNotifier = new SMSNotifier();
        Notifier pushNotifier = new PushNotifier();
        System.out.println("Message From  Email :");
        emailNotifier.notifyUser("Payment Successful");
        System.out.println();
        System.out.println("Message From  SMS :");
        smsNotifier.notifyUser("Payment Successful");
        System.out.println();
        System.out.println("Message From  Push Message :");
        pushNotifier.notifyUser("Payment Successful");
    }
}
