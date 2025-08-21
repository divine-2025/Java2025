package Aug5;

public class PushNotifier implements Notifier {
    @Override
    public void notifyUser(String message) {
        System.out.println("Sending Push notification " + message);
    }
}
