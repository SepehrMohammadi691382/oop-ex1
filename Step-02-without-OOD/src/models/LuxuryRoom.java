package models;

public class LuxuryRoom implements RoomInterface {
    private Room room;
    
    public LuxuryRoom(String number, double price){
        this.room = new Room(number, "luxury", price);
    }
    
    public String getNumber() { return room.getNumber(); }
    public String getType() { return room.getType(); }
    public double getPrice() { return room.getPrice(); }
    public void setPrice(double price) { room.setPrice(price); }
    
    public void addFreeDinner(){
        System.out.println("Free dinner added for luxury room " + room.getNumber());
    }
    
    public Room getRoom() { return room; }
}

