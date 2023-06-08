/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HotelBooking;

import java.util.ArrayList;

/**
 *
 * @author yuhwankim
 */
public class Guest extends User
{
    private ArrayList<Guest> guestList;
    
    public Guest(String firstName, String lastName, String mobile) 
    {
        super(firstName, lastName, mobile);
        guestList = new ArrayList<Guest>();
    }
 
    public ArrayList<Guest> getGuestList()
    {
        return this.guestList;
    }
    
    public void addGuest(Guest guest)
    {
        this.guestList.add(guest);
    }
    
    public void removeGuest(Guest guest)
    {
        this.guestList.remove(guest);
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("First Name: ").append(getFirstName()).append("\n");
        sb.append("Last Name: ").append(getLastName()).append("\n");
        sb.append("Mobile: ").append(getMobile()).append("\n");
        
        if (!guestList.isEmpty()) {
            sb.append("Guest List:\n");
            for (Guest guest : guestList) {
                sb.append("\t- ").append(guest.getFirstName()).append(" ")
                        .append(guest.getLastName()).append("\n");
            }
        }
        
        return sb.toString();
    }
}