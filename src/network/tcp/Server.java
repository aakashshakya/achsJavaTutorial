/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package network.tcp;

/**
 * @author aakash
 */
// A Java program for a Server

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(4000);
            Socket socket = serverSocket.accept(); //establishes connection

            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            String str = inputStream.readUTF();

            System.out.println("message= " + str);
            serverSocket.close();
        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());
        }
    }
}
