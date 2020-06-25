/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingapplication.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author aakash
 */
public class FrameView {
    private JFrame frame = new JFrame("User information form.");
    
    private JLabel nameLabel = new JLabel("Enter full name:");
    public JTextField nameField = new JTextField();
    
    private JLabel ageLabel = new JLabel("Enter age:");
    public JTextField ageField = new JTextField();
    
    private JLabel addressLabel = new JLabel("Enter Address:");
    public JTextField addressField = new JTextField();
    
    private JLabel contactNumberLabel = new JLabel("Contact number:");
    public JTextField contactNumberField = new JTextField();
    
    public JButton submitButton = new JButton("Submit");
    
    public FrameView(){
        
        nameLabel.setBounds(100, 50, 100, 25);
        nameField.setBounds(250, 50, 100, 25);

        ageLabel.setBounds(100, 100, 100, 25);
        ageField.setBounds(250, 100, 100, 25);

        addressLabel.setBounds(100, 150, 150, 25);
        addressField.setBounds(250, 150, 100, 25);
        
        contactNumberLabel.setBounds(100, 200, 150, 25);
        contactNumberField.setBounds(250, 200, 100, 25);

        submitButton.setBounds(250, 250, 100, 50);

        frame.add(submitButton);
        frame.add(nameLabel);
        frame.add(nameField);

        frame.add(ageField);
        frame.add(ageLabel);

        frame.add(addressField);
        frame.add(addressLabel);
        
        frame.add(contactNumberLabel);
        frame.add(contactNumberField);

        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
        
    }
}
