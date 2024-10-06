// File: src/notifications/PushNotification.java
package notifications;

public class PushNotification implements Notification {
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Отправка Push-уведомления пользователю " + recipient + ": " + message);
    }
}
