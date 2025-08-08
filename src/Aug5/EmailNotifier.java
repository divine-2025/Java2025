package Aug5;

public class EmailNotifier implements Notifier {
    @Override
    public void notifyUser(String message) {
        System.out.println("Sending email notification " + message);
    }


}
