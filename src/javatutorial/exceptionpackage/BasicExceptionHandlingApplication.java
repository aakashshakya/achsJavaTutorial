/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial.exceptionpackage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author aakash
 */
public class BasicExceptionHandlingApplication {
    
    public static void main(String[] args) {
        try{
            FileReader fileReader = new FileReader("some.txt");
            fileReader.read();
        } catch(FileNotFoundException fe){
            System.out.println("Sorry we were not able to find the file.");
        } catch(IOException ie){
            System.out.println("Some IO exception occurred. Please try again later");
        } finally{
            System.out.println("What ever happened happened.");
        }
        
        
    }
    
}
