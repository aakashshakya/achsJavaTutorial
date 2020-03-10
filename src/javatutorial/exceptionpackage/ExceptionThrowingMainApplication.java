/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial.exceptionpackage;

import java.util.Scanner;

/**
 *
 * @author aakash
 */
public class ExceptionThrowingMainApplication {
    public static void main(String[] args) {
        try {
            ExceptionThrowingClass exceptionThrowingClass = new ExceptionThrowingClass();
            
            Scanner userInput = new Scanner(System.in);
            System.out.println("Please enter the number to display the car in array: ");
            exceptionThrowingClass.fetchCarDetailsByIndex(userInput.nextInt());
        } catch (CustomException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
