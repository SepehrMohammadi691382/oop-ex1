import constants.PaymentMethods;
import models.Customer;
import models.LuxuryRoom;
import constants.Notifier;
import services.Reservation;
import services.ReservationService;
import services.DiscountService;
import services.PaymentService;
import services.InvoiceService;
import services.NotificationServiceWrapper;
import services.PaymentStrategyFactory;
import services.NotificationServiceFactory;

public class Main {
    public static void main(String[] args){
        Customer customer = new Customer("Ali", "ali@example.com","09124483765", "Paris");
        LuxuryRoom luxuryRoom = new LuxuryRoom("203", 150);
        Reservation res = new Reservation(luxuryRoom, customer, 2);

        DiscountService discountService = new DiscountService();
        PaymentService paymentService = new PaymentService(
            PaymentStrategyFactory.create(PaymentMethods.ONSITE)
        );
        InvoiceService invoiceService = new InvoiceService();
        Notifier notifier = Notifier.SMS;
        NotificationServiceWrapper notificationService = new NotificationServiceWrapper(
            NotificationServiceFactory.create(notifier),
            notifier
        );
        
        ReservationService service = new ReservationService(
            discountService,
            paymentService,
            invoiceService,
            notificationService
        );
        
        service.makeReservation(res, PaymentMethods.ONSITE, Notifier.SMS);
    }
}

