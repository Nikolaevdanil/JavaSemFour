package f6.Factory;

public class test {
    public static void main(String[] args)
    {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("Danil");
        Notification notification1 = notificationFactory.createNotification("Baha");
        notification.notifyUser();
        notification1.notifyUser();
    }
}
