package network.tcp.multipleclient;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class NetworkClient extends Thread {
    Socket s1 = null;
    String line = null;
    BufferedReader br = null;
    BufferedReader in = null;
    PrintWriter os = null;
    static JTextArea conversationView = new JTextArea();
    JTextField messageField = new JTextField();
    JButton sendMessageBtn = new JButton("Send Message");
    private String username;
    private boolean isConnectionCreated;


    public NetworkClient(String username) {
        this.username = username;
    }

    @Override
    public void run() {

        JFrame userFrame = new JFrame(this.username + " chat window");
        userFrame.setLayout(null);
        userFrame.setSize(500, 500);

        conversationView.setEditable(false);
        conversationView.setBounds(0, 0, 500, 350);
        userFrame.add(conversationView);

        messageField.setBounds(0, 355, 350, 65);
        userFrame.add(messageField);

        sendMessageBtn.setBounds(355, 355, 145, 65);
        userFrame.add(sendMessageBtn);

        sendMessageBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {

                InetAddress address = null;
                try {
                    address = InetAddress.getLocalHost();
                } catch (UnknownHostException ex) {

                }
                if (!isConnectionCreated) {
                    try {
                        s1 = new Socket(address, 4445); // You can use static final constant PORT_NUM
                        in = new BufferedReader(new InputStreamReader(s1.getInputStream()));
                        os = new PrintWriter(s1.getOutputStream());
                        isConnectionCreated = true;
                    } catch (IOException e) {
                        e.printStackTrace();
                        System.err.print("IO Exception");
                    }

                    System.out.println("Client Address : " + address);
                    System.out.println("Enter Data to echo Server ( Enter QUIT to end):");
                }

                String response = null;
                line = messageField.getText();
                if (!line.equalsIgnoreCase("QUIT")) {
                    os.println(username + ": " + line);
                    os.flush();
                    response = messageField.getText();
                    System.out.println("Server Response : " + response);
                    line = messageField.getText();
                    messageField.setText("");
                } else {
                    try {
                        in.close();
                        os.close();
                        s1.close();
                        System.out.println("Connection Closed");
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }

            }
        });

        userFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        userFrame.setVisible(true);
    }
}