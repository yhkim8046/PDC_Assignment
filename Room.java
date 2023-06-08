/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HotelBooking;

/**
 *
 * @author yuhwankim
 */
public class Room 
{
    private String roomType;
    private int price;
    private int maxGuest;
    
    public Room(String roomType, int price, int maxGuest)
    {
        this.roomType = roomType;
        this.price = price;
        this.maxGuest = maxGuest;
    }
    
    /**
     * @return the roomType
     */
    public String getRoomType() {
        return roomType;
    }

    /**
     * @param roomType the roomType to set
     */
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the maxGuest
     */
    public int getMaxGuest() {
        return maxGuest;
    }

    /**
     * @param maxGuest the maxGuest to set
     */
    public void setMaxGuest(int maxGuest) {
        this.maxGuest = maxGuest;
    }
    
    public String toString()
    {
        return this.getRoomType()+ " " + this.getPrice() + " " + this.getMaxGuest();
    }
}

