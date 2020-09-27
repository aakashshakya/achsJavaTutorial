/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;

/**
 *
 * @author aakash
 */
public class UserBean implements Serializable {
    
    private String fullName;
    private String contactNumber;
    private String address;
    
    public UserBean() {
    }
    
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    public String getFullName() {
        return fullName;
    }
    
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    
    public String getContactNumber() {
        return contactNumber;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getAddress() {
        return address;
    }
}
