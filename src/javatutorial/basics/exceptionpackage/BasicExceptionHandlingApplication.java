/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial.basics.exceptionpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author aakash
 */
public class BasicExceptionHandlingApplication {
    
    public static void main(String[] args) {
        try{
            FileInputStream fileReader = new FileInputStream("some.txt");
            fileReader.read();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            System.out.println("What ever happened happened.");
        }
        
        
    }
    
}
