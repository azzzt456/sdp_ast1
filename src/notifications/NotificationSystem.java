package notifications;

import java.util.List;

public class NotificationSystem {
    private Notification notification;

    public NotificationSystem(Notification notification) {
        this.notification = notification;
    }


    public void send(String message, String recipient) {
        notification.sendNotification(message, recipient);
    }


    public void sendBulk(String message, List<String> recipients) {
        for (String recipient : recipients) {
            notification.sendNotification(message, recipient);
        }
    }
}

