/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author aakash
 */
public class BeanMain {
    public static void main(String[] args) {
        UserBean user = new UserBean();
        user.setFullName("Aakash Raj Shakya");
        user.setContactNumber("9860706065");
        user.setAddress("Lagan Tole");
        
        System.out.println("Bean Example of User bean.");
        System.out.println(user.getFullName());
    }
    
}
