package services;

import services.Reservation;

public class DiscountService {
    public void applyCityDiscount(Reservation reservation) {
        if (reservation.getCustomerCity().equals("Paris")) {
            System.out.println("Apply city discount for Paris!");
            double currentPrice = reservation.getRoomPrice();
            reservation.setRoomPrice(currentPrice * 0.9);
        }
    }
}

