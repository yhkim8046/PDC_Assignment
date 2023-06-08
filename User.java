/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HotelBooking;

/**
 *
 * @author yuhwankim
 */
public abstract class User 
{
    private String firstName;
    private String lastName;
    private String mobile;
    
    public User(String firstName, String lastName, String mobile)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
    } 
    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile the mobile to set
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    
    public String toString()
    {
        return this.getFirstName() + " " + this.getLastName() + " " + this.getMobile();
    }
}
