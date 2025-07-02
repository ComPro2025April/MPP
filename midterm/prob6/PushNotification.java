package midterm.prob6;

public class PushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("PUSH sent:" + message);
    }
}
