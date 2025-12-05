package services;

import constants.Notifier;
import constants.PaymentMethods;

public class ReservationService {
    private DiscountService discountService;
    private PaymentService paymentService;
    private InvoiceService invoiceService;
    private NotificationServiceWrapper notificationService;
    
    public ReservationService(DiscountService discountService,
                              PaymentService paymentService,
                              InvoiceService invoiceService,
                              NotificationServiceWrapper notificationService) {
        this.discountService = discountService;
        this.paymentService = paymentService;
        this.invoiceService = invoiceService;
        this.notificationService = notificationService;
    }
    
    public void makeReservation(Reservation res, PaymentMethods paymentType, Notifier notifier) {
        System.out.println("Processing reservation for " + res.getCustomerName());
        
        discountService.applyCityDiscount(res);
        
        paymentService.processPayment(res.totalPrice());
        
        invoiceService.printInvoice(res);
        
        notificationService.sendReservationConfirmation(res);
    }
}

