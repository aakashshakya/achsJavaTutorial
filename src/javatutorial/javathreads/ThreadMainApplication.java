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
public class ThreadMainApplication {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = Thread.currentThread();
        
        System.out.println("The current thread is: " + thread);
        
        thread.setName("Some other application thread");
        
        System.out.println("After name change the current thread is: " + thread);
        
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }

        CustomThread customThread = new CustomThread();
        customThread.setPriority(10);
        customThread.start();
        
        
        
    }
}
