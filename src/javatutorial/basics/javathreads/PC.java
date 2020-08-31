/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial.basics.javathreads;

import java.util.Scanner;

/**
 *
 * @author aakash
 */
public class PC {
    // Prints a string and waits for consume() 

    public void produce() throws InterruptedException {
        // synchronized block ensures only one thread 
        // running at a time. 
        synchronized (this) {
            System.out.println("producer thread running");

            // releases the lock on shared resource 
            wait();

            // and waits till some other method invokes notify(). 
            System.out.println("Resumed");
        }
    }

    // Sleeps for some time and waits for a key press. After key 
    // is pressed, it notifies produce(). 
    public void consume() throws InterruptedException {
        // this makes the produce thread to run first. 
        Thread.sleep(1000);
        Scanner s = new Scanner(System.in);

        // synchronized block ensures only one thread 
        // running at a time. 
        synchronized (this) {
            System.out.println("Waiting for return key.");
            s.nextLine();
            System.out.println("Return key pressed");

            // notifies the produce thread that it 
            // can wake up. 
            notify();

            // Sleep 
            Thread.sleep(2000);
        }
    }
}
