package network.tcp.multipleclient;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MainApplication {
    public static void main(String[] args) throws IOException {

        JFrame frame = new JFrame("Chat Application");
        JLabel usernameLabel = new JLabel("Enter Username:");
        JTextField usernameField = new JTextField();
        JButton addUserBtn = new JButton("Add User");

        frame.setLayout(null);
        frame.setSize(300, 300);

        usernameLabel.setBounds(0, 0, 150, 25);
        usernameField.setBounds(0, 25, 150, 25);
        addUserBtn.setBounds(25, 50, 100, 25);

        frame.add(usernameLabel);
        frame.add(usernameField);
        frame.add(addUserBtn);
        frame.setVisible(true);


        addUserBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NetworkClient networkClient = new NetworkClient(usernameField.getText());
                usernameField.setText("");
                networkClient.start();
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
