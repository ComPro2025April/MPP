package midterm.prob6;

public class NotificationFactory {

    public static Notification createNotificationSMS() {
        SMSNotification notification = new SMSNotification();
        return notification;
    }
    public static Notification createNotificationEmail() {
        EmailNotification notification = new EmailNotification();
        return notification;
    }
    public static Notification createNotificatinPush(){
        PushNotification notification = new PushNotification();
        return notification;
    }
    public static Notification createNotificatinInAppNotification(){
        InAppNotification notification = new InAppNotification();
        return notification;
    }
}
