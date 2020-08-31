/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial.basics.exceptionpackage;

/**
 *
 * @author aakash
 */
public class ExceptionThrowingClass {
    private String [] cars = {"Mercedes", "BMW", "Toyota"};

    public void fetchCarDetailsByIndex(int index) throws CustomException {
        if(index > (cars.length -1)){
            throw new CustomException("The maximum size limit is " + (cars.length -1));
        }
        System.out.println("The car you searched for is " + cars[index]);
    }
}
