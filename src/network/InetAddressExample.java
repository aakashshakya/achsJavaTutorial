package network;

import java.net.*;

public class InetAddressExample {
    public static void main(String[] args) {
        try {
            InetAddress ip  = InetAddress.getByName("www.youtube.com");
            System.out.println("Host Name: " + ip.getHostName());
            System.out.println("IP Address: " + ip.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("Unknown host exception: " + e.getMessage());
        }
    }
}
