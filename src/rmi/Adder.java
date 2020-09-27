/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author aakash
 */
public interface Adder extends Remote {

    // Declaring the method prototype 
    public int add(int firstNumber, int secondNumber) throws RemoteException;
    
    int multiply(int firstNumber, int secondNumber) throws RemoteException;
}
