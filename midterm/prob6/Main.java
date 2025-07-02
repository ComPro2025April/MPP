package midterm.prob6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Notification> notifications = new ArrayList<>();

        notifications.add(NotificationFactory.createNotificationSMS());
        notifications.add(NotificationFactory.createNotificationEmail());
        notifications.add(NotificationFactory.createNotificatinPush());
        notifications.add(NotificationFactory.createNotificatinInAppNotification());

        for (Notification notification : notifications) {
            notification.send(" kk ");
        }
    }
}
