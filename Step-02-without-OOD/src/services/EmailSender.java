package services;

public class EmailSender implements NotificationService {
    public void send(String to, String message){
        System.out.println("Sending email to " + to + ": " + message);
    }
}

