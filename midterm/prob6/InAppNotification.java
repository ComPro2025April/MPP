package midterm.prob6;


public class InAppNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("New notification :"+message);
    }
}
