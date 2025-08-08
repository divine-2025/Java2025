package Aug5;

public class SMSNotifier implements Notifier{
    @Override
    public void notifyUser(String message) {
        System.out.println("Sending SMS notification " + message);
    }
}
