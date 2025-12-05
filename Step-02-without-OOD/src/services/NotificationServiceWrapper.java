package services;

import constants.Notifier;
import services.Reservation;

public class NotificationServiceWrapper {
    private NotificationService notificationService;
    private Notifier notifierType;
    
    public NotificationServiceWrapper(NotificationService notificationService, Notifier notifierType) {
        this.notificationService = notificationService;
        this.notifierType = notifierType;
    }
    
    public void sendReservationConfirmation(Reservation reservation) {
        String message = "Your reservation confirmed!";
        String contactInfo;
        
        if (notifierType == Notifier.EMAIL) {
            contactInfo = reservation.getCustomerEmail();
        } else {
            contactInfo = reservation.getCustomerMobile();
        }
        
        notificationService.send(contactInfo, message);
    }
}

