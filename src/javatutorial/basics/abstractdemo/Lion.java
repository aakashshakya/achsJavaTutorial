/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial.basics.abstractdemo;

/**
 *
 * @author aakash
 */
public class Lion extends AbstractAnimal {

    @Override
    public void sound() {
        System.out.println("Lion Roars.");
    }

    @Override
    public void eats() {
        System.out.println("Lion eats meat.");
    }
    
}
