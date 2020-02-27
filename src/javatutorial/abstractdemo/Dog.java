/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial.abstractdemo;

/**
 *
 * @author aakash
 */
public class Dog extends AbstractAnimal {

    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }

    @Override
    public void eats() {
        System.out.println("Dog eats both veggies and meat.");
    }
    
}
