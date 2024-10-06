package notifications;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Notification sms = new SMSNotification();
        NotificationSystem smsSystem = new NotificationSystem(sms);
        smsSystem.send("Привет через SMS!", "+1234567890");


        Notification email = new EmailNotification();
        NotificationSystem emailSystem = new NotificationSystem(email);
        emailSystem.send("Привет через Email!", "example@example.com");


        Notification push = new PushNotification();
        NotificationSystem pushSystem = new NotificationSystem(push);
        pushSystem.send("Привет через Push!", "User123");


        List<String> smsRecipients = Arrays.asList("+1234567890", "+0987654321", "+1122334455");
        smsSystem.sendBulk("Массовая рассылка SMS!", smsRecipients);


        List<String> emailRecipients = Arrays.asList("user1@example.com", "user2@example.com", "user3@example.com");
        emailSystem.sendBulk("Массовая рассылка Email!", emailRecipients);


        List<String> pushRecipients = Arrays.asList("User1", "User2", "User3");
        pushSystem.sendBulk("Массовая рассылка Push-уведомлений!", pushRecipients);
    }
}

