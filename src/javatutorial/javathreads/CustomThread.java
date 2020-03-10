/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial.javathreads;

/**
 *
 * @author aakash
 */
public class CustomThread extends Thread {
    @Override
    public void run(){
        System.out.println("Aakash");
    }
    public void printName(){
        System.out.println("Test teacher");
    }
}
