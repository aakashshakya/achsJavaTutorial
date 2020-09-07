package network.tcp;


/**
 * @author aakash
 */

// A Java program for a Client
import java.io.*;
import java.net.*;


public class Client {
    public static void main(String[] args) throws IOException {
        try {
            Socket clientSocket = new Socket("localhost", 6666);

            DataOutputStream outputStream = new DataOutputStream(clientSocket.getOutputStream());
            outputStream.writeUTF("Hello Server");
            outputStream.flush();
            outputStream.close();

            clientSocket.close();
        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());
        }
    }
}

