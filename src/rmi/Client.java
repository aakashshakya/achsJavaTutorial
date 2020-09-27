/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.Naming;

/**
 *
 * @author aakash
 */
public class Client {

    public static void main(String args[]) {
        try {
            String ip = "rmi://localhost/service";
            // lookup method to find reference of remote object
            Adder adder = (Adder) Naming.lookup(ip);
            System.out.println("sum: " + adder.add(55, 10));
            System.out.println("Multiplication is : " + adder.multiply(15, 10));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
