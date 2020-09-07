package network.udp;

import java.net.*;

public class Receiver {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(3000);
        try {
            byte[] buf = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buf, 1024);
            socket.receive(packet);
            String str = new String(packet.getData(), 0, packet.getLength());
            System.out.println(str);
        } finally {
            socket.close();
        }
    }
}