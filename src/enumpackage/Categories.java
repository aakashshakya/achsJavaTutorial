package enumpackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aakash
 */
public enum Categories {
    KITCHEN_APPLIANCES("Kitchen Appliances"), 
    MOBILE_DEVICES("Mobile Devices"),
    CLEANING_APPLIANCES("Cleaning Appliances");
    
    private String value;
    
    private Categories(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return value;
    }
}
