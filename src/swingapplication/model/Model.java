/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingapplication.model;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 *
 * @author aakash
 */
public class Model {
    public void saveUserInformation(String fullName, String address, String age, String contactNumber) throws Exception{
        validate(fullName, "Full Name");
        validate(address, "Address");
        validate(contactNumber, "Contact Number");
        validateAge(age);
        
        String userInformation = "Full name is " + fullName + " address is " + address
                + " age is " + age + " contact number is " + contactNumber;
        
        BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt", true));
        writer.newLine();
        writer.write(userInformation);
        writer.close();        
    }
    
    private void validate(String field, String fieldName) throws Exception {
        if(field == null || field.equals("")){
            throw new Exception(fieldName + " field cannot be null or empty.");
        }
    }
    
    private void validateAge(String age) throws Exception{
        validate(age, "Age");
        try {
            Integer.parseInt(age);
        } catch(Exception ex){
            throw new Exception("Age is not of integer type.");
        }
    }
}
