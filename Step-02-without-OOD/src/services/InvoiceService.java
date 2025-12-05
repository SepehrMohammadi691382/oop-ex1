package services;

import services.Reservation;

public class InvoiceService {
    public void printInvoice(Reservation reservation) {
        System.out.println("----- INVOICE -----");
        System.out.println("hotel.Customer: " + reservation.getCustomerName());
        System.out.println("hotel.Room: " + reservation.getRoomNumber() + " (" + reservation.getRoomType() + ")");
        System.out.println("Total: " + reservation.totalPrice());
        System.out.println("-------------------");
    }
}

