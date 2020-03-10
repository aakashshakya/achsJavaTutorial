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
public class MultipleThreadMainApplication {

    public static void main(String[] args) {
        new MultipleThread("One"); // start threads
        new MultipleThread("Two");
        new MultipleThread("Three");
        
        try {
            // wait for other threads to end
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Main thread exiting.");
    }
}
