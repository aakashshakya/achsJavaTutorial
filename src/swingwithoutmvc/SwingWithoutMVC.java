/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingwithoutmvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author aakash
 */
class SwingWithoutMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("User information form.");

        JLabel nameLabel = new JLabel("Enter full name:");
        JTextField nameField = new JTextField();

        JLabel ageLabel = new JLabel("Enter age:");
        JTextField ageField = new JTextField();

        JLabel addressLabel = new JLabel("Enter Address:");
        JTextField addressField = new JTextField();

        JLabel contactNumberLabel = new JLabel("Contact number:");
        JTextField contactNumberField = new JTextField();

        JButton submitButton = new JButton("Submit");

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

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    validate(nameField.getText(), "Full Name");
                    validate(addressField.getText(), "Address");
                    validate(contactNumberField.getText(), "Contact Number");
                    validateAge(ageField.getText());

                    String userInformation = "Full name is " + nameField.getText() + " address is " + addressField.getText()
                            + " age is " + ageField.getText() + " contact number is " + contactNumberField.getText();

                    BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt", true));
                    writer.newLine();
                    writer.write(userInformation);
                    writer.close();

                } catch (Exception ex) {
                    System.out.println("Exception occurred: " + ex.getMessage());
                }
            }
        });
    }

    static void validate(String field, String fieldName) throws Exception {
        if (field == null || field.equals("")) {
            throw new Exception(fieldName + " field cannot be empty.");
        }
    }

    static void validateAge(String age) throws Exception {
        validate(age, "Age");
        try {
            Integer.parseInt(age);
        } catch (Exception ex) {
            System.out.println("Age is not of integer type.");
        }
    }

}
