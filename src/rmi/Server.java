/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author aakash
 */
public class Server {

    public static void main(String args[]) {
        try {
            // Create an object of the interface implementation class 
            Adder server = new AdderImplements();
            
            // rmi registry within the server JVM with port number 1099 
            LocateRegistry.createRegistry(1099);
            
            // Binds the remote object by the name service
            Naming.rebind("service", server);
            System.out.println("Server Started ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
