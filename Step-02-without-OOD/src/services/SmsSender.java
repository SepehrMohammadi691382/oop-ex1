package services;

public class SmsSender implements NotificationService {
    public void send(String to, String message){
        System.out.println("Sending sms to " + to + ": " + message);
    }
}

