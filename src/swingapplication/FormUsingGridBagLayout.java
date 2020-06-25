/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingapplication;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Ankur
 */
public class FormUsingGridBagLayout {

    public static void ValidateName(JTextField name) throws Exception {
        String s = name.getText();
        try {
            if (s.length() < 2) {
                throw new Exception("Length too short");
            }
        } catch (Exception ex) {
            JFrame j = new JFrame("Error");
            JLabel l = new JLabel("First or last name is too short(minimize and continue with proper name)");
            j.setSize(1200, 1200);
            l.setBounds(600, 1200, 100, 100);
            j.add(l);
            j.setVisible(true);
            j.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }

    public static void ValidateMail(JTextField mail) throws Exception {
        String s = mail.getText();
        int atPosition = s.indexOf("@");
        int dotPosition = s.lastIndexOf(".");
        try {
            if (atPosition < 1 || dotPosition < atPosition + 2 || dotPosition + 2 >= s.length()) {
                throw new Exception("Email invalid");
            }
        } catch (Exception ex) {
            JFrame j = new JFrame("Error");
            JLabel l = new JLabel("Mail is not in correct format(minimize and continue with proper name)");
            j.setSize(1200, 1200);
            l.setBounds(600, 1200, 100, 100);
            j.add(l);
            j.setVisible(true);
            j.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }

    public static void ValidateMobile(JTextField phone) throws Exception {
        String s = phone.getText();
        try {
            if (s.length() != 10) {
                throw new Exception("Mobile number invalid");
            }
        } catch (Exception ex) {
            JFrame j = new JFrame("Error");
            JLabel l = new JLabel("Mobile number is not in correct format (minimize and continue with proper name)");
            j.setSize(1200, 1200);
            l.setBounds(600, 1200, 100, 100);
            j.add(l);
            j.setVisible(true);
            j.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }

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

        constraints.gridx = 0;
        constraints.gridy = 1;
        frame.add(new JLabel("Enter your last name: "), constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        JTextField lastName = new JTextField(20);
        frame.add(lastName, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        frame.add(new JLabel("Enter your email address: "), constraints);

        constraints.gridx = 1;
        constraints.gridy = 2;
        JTextField emailAddress = new JTextField(20);
        frame.add(emailAddress, constraints);

        constraints.gridx = 0;
        constraints.gridy = 3;
        frame.add(new JLabel("Enter your mobile number: "), constraints);

        constraints.gridx = 1;
        constraints.gridy = 3;
        JTextField mobileNumber = new JTextField(20);
        frame.add(mobileNumber, constraints);

        constraints.gridx = 0;
        constraints.gridy = 4;
        frame.add(new JLabel("Enter your permanent address: "), constraints);

        constraints.gridx = 1;
        constraints.gridy = 4;
        JTextField permanentAddress = new JTextField(20);
        frame.add(permanentAddress, constraints);

        constraints.gridx = 0;
        constraints.gridy = 5;
        frame.add(new JLabel("Enter your temporary address: "), constraints);

        constraints.gridx = 1;
        constraints.gridy = 5;
        JTextField temporaryAddress = new JTextField(20);
        frame.add(temporaryAddress, constraints);

        constraints.gridx = 0;
        constraints.gridy = 6;
        JButton submitButton = new JButton("Submit");
        frame.add(submitButton, constraints);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    ValidateName(firstName);
                } catch (Exception ex) {
                    Logger.getLogger(FormUsingGridBagLayout.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    ValidateName(lastName);
                } catch (Exception ex) {
                    Logger.getLogger(FormUsingGridBagLayout.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    ValidateMail(emailAddress);
                } catch (Exception ex) {
                    Logger.getLogger(FormUsingGridBagLayout.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    ValidateMobile(mobileNumber);
                } catch (Exception ex) {
                    Logger.getLogger(FormUsingGridBagLayout.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        constraints.gridx = 1;
        constraints.gridy = 6;
        JButton clearButton = new JButton("Clear");
        frame.add(clearButton, constraints);
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                firstName.setText("");
                lastName.setText("");
                emailAddress.setText("");
                mobileNumber.setText("");
                permanentAddress.setText("");
                temporaryAddress.setText("");
            }
        });
        frame.setSize(600, 800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
