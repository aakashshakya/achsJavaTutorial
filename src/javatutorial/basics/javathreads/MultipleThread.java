/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial.basics.javathreads;

/**
 *
 * @author aakash
 */
public class MultipleThread extends Thread {

    String name; // name of thread

    MultipleThread(String threadname) {
        super(threadname);
        name = threadname;
        System.out.println("New thread: " + this.getName());
        this.start(); // Start the thread
    }
    
    // This is the entry point for thread.
    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + "Interrupted");
        }
        System.out.println(name + " exiting.");
    }

}
