/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumpackage;

/**
 *
 * @author aakash
 */
public class EnumMain {
    public static void main(String[] args) {
        Product firstProduct = new Product();
        firstProduct.setCategory(Categories.MOBILE_DEVICES);
        firstProduct.setName("iPhone 11");
        firstProduct.setPrice(135000.0);
        firstProduct.setQuantity(10);
        
        Product secondProduct = new Product();
        secondProduct.setCategory(Categories.CLEANING_APPLIANCES);
        secondProduct.setName("LG front load washing machine");
        secondProduct.setPrice(92000.0);
        secondProduct.setQuantity(5);
        
        System.out.println("Printing the enum ordinal = " + firstProduct.getCategory().ordinal());
        System.out.println("Printing the enum name = " + firstProduct.getCategory().name());
        System.out.println(firstProduct.toString());
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        System.out.println("Printing the enum ordinal = " + secondProduct.getCategory().ordinal());
        System.out.println("Printing the enum name = " + secondProduct.getCategory().name());
        System.out.println(secondProduct.toString());
        
    }
    
}
