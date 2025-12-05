package services;

import constants.Notifier;

public class NotificationServiceFactory {
    public static NotificationService create(Notifier notifier) {
        switch (notifier) {
            case EMAIL:
                return new EmailSender();
            case SMS:
                return new SmsSender();
            default:
                throw new IllegalArgumentException("Unknown notifier: " + notifier);
        }
    }
}

