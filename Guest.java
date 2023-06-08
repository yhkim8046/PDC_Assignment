/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HotelBooking;

/**
 *
 * @author yuhwankim
 */
public class Guest extends User
{
    private int numberOfNights;
    
    public Guest(String firstName, String lastName, String mobile) 
    {
        super(firstName, lastName, mobile);
        this.numberOfNights = numberOfNights;
    }
    
    public void setNumberOfNights(int n)
    {
        this.numberOfNights = n;
    }
    public int getNumberOfNights()
    {
        return this.numberOfNights;
    }
}