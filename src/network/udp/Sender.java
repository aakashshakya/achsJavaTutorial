package network.udp;

import java.net.*;

public class Sender {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        try {
            String str = "Welcome java";
            InetAddress ip = InetAddress.getByName("127.0.0.1");
            DatagramPacket packet = new DatagramPacket(str.getBytes(), str.length(), ip, 3000);
            socket.send(packet);
        } finally {
            socket.close();
        }
    }
}