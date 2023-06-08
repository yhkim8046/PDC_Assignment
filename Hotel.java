/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HotelBooking;

/**
 *
 * @author yuhwankim
 */
public class Hotel 
{
    private String name;
    private String address;
    private int cost;
    private int stars;
    
    public Hotel(String name, String address, int cost, int stars)
    {
        this.name = name;
        this.address = address;
        this.cost = cost;
        this.stars = stars;
    }
    
     /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the cost
     */
    public int getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(int cost) {
        this.cost = cost;
    }
    
    /**
     * @return the stars
     */
    public int getStars() {
        return stars;
    }

    /**
     * @param stars the stars to set
     */
    public void setStars(int stars) {
        this.stars = stars;
    }
    

    @Override
    public String toString()
    {
        return this.getName() + " Location: " + this.getAddress() + " Per night: $" + this.getCost() +"("+this.getStars() +" stars)" + "\n";
    }
    
    
    public boolean matchHotelName(String x) //match the hotel name
    {
        if(this.name.toLowerCase().contains(x.toLowerCase()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean matchLocation(String x) //match the hotel location
    {
        if(this.address.toLowerCase().contains(x.toLowerCase()))
        {
            return true;
        }
        else
        {
            return false;
        }
            
    }
       
    
    
                
    
    
    
        
}
