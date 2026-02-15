package DependencyInjection;

public class Main {
    public static void main(String[] args){
        EmailService email = new EmailService();
        Notification notification = new Notification(email);

        notification.notifyUser("Hello Alice!");
    }
}
