package f6.Factory;

public class NotificationFactory {
    public Notification createNotification(String channel)
    {
        if (channel == null || channel.isEmpty())
            return null;
        if ("Baha".equals(channel)) {
            return new BahaNotification();
        }
        else if ("Danil".equals(channel)) {
            return new DanilNotification();
        }
        else if ("PUSH".equals(channel)) {
            return new PushNotification();
        }
        return null;
    }
}
