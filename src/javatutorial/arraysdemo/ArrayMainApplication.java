/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial.arraysdemo;

/**
 * @author aakash
 */
public class ArrayMainApplication {
    public static void main(String[] args) {
        String[] cars = {"Mercedez", "Toyota", "BMW"};
        //Printing the car of 0th index
        System.out.println(cars[0]);


        //Traditional Looping through cars array
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        System.out.println();
        System.out.println();

        System.out.println("Looping through car in new for each loop");
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
