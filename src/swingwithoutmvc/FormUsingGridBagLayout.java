/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingwithoutmvc;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author aakash
 */
public class FormUsingGridBagLayout {

    public static void main(String[] args) {
        JFrame frame = new JFrame("User information fill up form");
        GridBagLayout gridBagLayout = new GridBagLayout();

        frame.setLayout(gridBagLayout);

        GridBagConstraints constraints = new GridBagConstraints();

        constraints.insets = new Insets(0, 0, 10, 10);
        constraints.ipady = 15;

        constraints.fill = GridBagConstraints.HORIZONTAL;

        constraints.gridx = 0;
        constraints.gridy = 0;
        frame.add(new JLabel("Enter your first name: "), constraints);

        constraints.gridx = 1;
        constraints.gridy = 0;
        JTextField firstName = new JTextField(20);
        frame.add(firstName, constraints);

        constraints.gridx = 2;
        constraints.gridy = 0;
        JLabel firstNameErrorLabel = new JLabel("First name cannot be empty.");
        firstNameErrorLabel.setForeground(Color.RED);
        firstNameErrorLabel.setVisible(false);
        frame.add(firstNameErrorLabel, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        frame.add(new JLabel("Enter your last name: "), constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        JTextField lastName = new JTextField(20);
        frame.add(lastName, constraints);

        constraints.gridx = 2;
        constraints.gridy = 1;
        JLabel lastNameErrorLabel = new JLabel("Last name cannot be empty.");
        lastNameErrorLabel.setVisible(false);
        lastNameErrorLabel.setForeground(Color.RED);
        frame.add(lastNameErrorLabel, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        frame.add(new JLabel("Enter your email address: "), constraints);

        constraints.gridx = 1;
        constraints.gridy = 2;
        JTextField emailAddress = new JTextField(20);
        frame.add(emailAddress, constraints);

        constraints.gridx = 2;
        constraints.gridy = 2;
        JLabel emailErrorLabel = new JLabel("Email not valid.");
        emailErrorLabel.setVisible(false);
        emailErrorLabel.setForeground(Color.RED);
        frame.add(emailErrorLabel, constraints);

        constraints.gridx = 0;
        constraints.gridy = 3;
        frame.add(new JLabel("Enter your mobile number: "), constraints);

        constraints.gridx = 1;
        constraints.gridy = 3;
        JTextField mobileNumber = new JTextField(20);
        frame.add(mobileNumber, constraints);

        constraints.gridx = 2;
        constraints.gridy = 3;
        JLabel mobileNumberErrorLabel = new JLabel("Mobile number not valid.");
        mobileNumberErrorLabel.setVisible(false);
        mobileNumberErrorLabel.setForeground(Color.RED);
        frame.add(mobileNumberErrorLabel, constraints);

        constraints.gridx = 0;
        constraints.gridy = 4;
        frame.add(new JLabel("Enter your permanent address: "), constraints);

        constraints.gridx = 1;
        constraints.gridy = 4;
        JTextField permanentAddress = new JTextField(20);
        frame.add(permanentAddress, constraints);

        constraints.gridx = 2;
        constraints.gridy = 4;
        JLabel permanentAddressErrorLabel = new JLabel("Permanent address cannot be empty.");
        permanentAddressErrorLabel.setVisible(false);
        permanentAddressErrorLabel.setForeground(Color.RED);
        frame.add(permanentAddressErrorLabel, constraints);

        constraints.gridx = 0;
        constraints.gridy = 5;
        frame.add(new JLabel("Enter your temporary address: "), constraints);

        constraints.gridx = 1;
        constraints.gridy = 5;
        JTextField temporaryAddress = new JTextField(20);
        frame.add(temporaryAddress, constraints);

        constraints.gridx = 2;
        constraints.gridy = 5;
        JLabel temporaryAddressErrorLabel = new JLabel("Temporary address cannot be empty.");
        temporaryAddressErrorLabel.setVisible(false);
        temporaryAddressErrorLabel.setForeground(Color.RED);
        frame.add(temporaryAddressErrorLabel, constraints);

        constraints.gridx = 0;
        constraints.gridy = 6;
        JButton submitButton = new JButton("Submit");
        frame.add(submitButton, constraints);

        constraints.gridx = 1;
        constraints.gridy = 6;
        JButton clearButton = new JButton("Clear");
        frame.add(clearButton, constraints);

        frame.setSize(1000, 800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validateFields();
                validateEmail();
            }

            private boolean validateFields() {
                if (isEmptyString(firstName.getText())) {
                    firstNameErrorLabel.setVisible(true);
                    return false;
                } else {
                    firstNameErrorLabel.setVisible(false);
                }

                if (isEmptyString(lastName.getText())) {
                    lastNameErrorLabel.setVisible(true);
                    return false;
                } else {
                    lastNameErrorLabel.setVisible(false);
                }

                if (isEmptyString(emailAddress.getText())) {
                    emailErrorLabel.setVisible(true);
                    return false;
                } else {
                    emailErrorLabel.setVisible(false);
                }
                if (isEmptyString(mobileNumber.getText())) {
                    mobileNumberErrorLabel.setVisible(true);
                    return false;
                } else {
                    mobileNumberErrorLabel.setVisible(false);
                }
                if (isEmptyString(permanentAddress.getText())) {
                    permanentAddressErrorLabel.setVisible(true);
                    return false;
                } else {
                    permanentAddressErrorLabel.setVisible(false);
                }
                if (isEmptyString(temporaryAddress.getText())) {
                    temporaryAddressErrorLabel.setVisible(true);
                    return false;
                } else {
                    temporaryAddressErrorLabel.setVisible(false);
                }
                return true;
            }

            private void validateEmail() {
                String s = emailAddress.getText();
                int atPosition = s.indexOf("@");
                int dotPosition = s.lastIndexOf(".");
                if (atPosition < 1 || dotPosition < atPosition + 2 || dotPosition + 2 >= s.length()) {
                    emailErrorLabel.setText("Invalid email.");
                    emailErrorLabel.setVisible(true);
                }
            }

            private boolean isEmptyString(String value) {
                return value == null || value.equals("");
            }
        });

        clearButton.addActionListener((ActionEvent e) -> {
            firstName.setText("");
            lastName.setText("");
            emailAddress.setText("");
            mobileNumber.setText("");
            permanentAddress.setText("");
            temporaryAddress.setText("");
        });

    }
}
