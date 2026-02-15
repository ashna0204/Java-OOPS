package DependencyInjection;

public class Notification {

    private MessageService service;

    public Notification(MessageService service){
        this.service = service;
    }

    public void notifyUser(String msg){
        service.sendMessage(msg);
    }
}
