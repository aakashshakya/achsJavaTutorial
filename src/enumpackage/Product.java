/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumpackage;

import java.io.Serializable;

/**
 *
 * @author aakash
 */
public class Product implements Serializable {
    private String name;
    private int quantity;
    private double price;
    private Categories category;
    private boolean available;
    
    public Product() {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Categories getCategory() {
        return category;
    }

    public void setCategory(Categories category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" + "name = " + name + ", quantity = " + quantity 
                + ", price = " + price + ", category = " + category.getValue()+ '}';
    }    
}
