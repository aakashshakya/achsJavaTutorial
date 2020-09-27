/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author aakash
 */
public class AdderImplements extends UnicastRemoteObject implements Adder {

    // Default constructor to throw RemoteException from its parent constructor 
    public AdderImplements() throws RemoteException {
        super();
    }

    // Implementation of the adder interface 
    @Override
    public int add(int firstNumber, int secondNumber) {
        return (firstNumber + secondNumber);
    }
    
    @Override
    public int multiply(int firstNumber, int secondNumber) throws RemoteException {
        return (firstNumber * secondNumber);
    }
}
