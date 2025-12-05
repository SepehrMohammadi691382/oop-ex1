package services;

import models.Customer;
import models.RoomInterface;

public class Reservation {
    private RoomInterface room;
    private Customer customer;
    private int nights;

    public Reservation(RoomInterface r, Customer c, int nights) {
        this.room = r;
        this.customer = c;
        this.nights = nights;
    }
    
    public double totalPrice(){
        return room.getPrice() * nights;
    }
    
    public RoomInterface getRoom() { return room; }
    public Customer getCustomer() { return customer; }
    public int getNights() { return nights; }
    
    public String getCustomerName() { return customer.getName(); }
    public String getCustomerEmail() { return customer.getEmail(); }
    public String getCustomerCity() { return customer.getCity(); }
    public String getCustomerMobile() { return customer.getMobile(); }
    public String getRoomNumber() { return room.getNumber(); }
    public String getRoomType() { return room.getType(); }
    public double getRoomPrice() { return room.getPrice(); }
    public void setRoomPrice(double price) { room.setPrice(price); }
}

