/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingwithoutmvc;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author aakash
 */
public class MyGridLayout {

    private static JFrame frame;

    public static void main(String[] args) {
//        frame = new JFrame("List");

        frame = new JFrame("List");

        JLabel firstColumnLabel = new JLabel("First Name");
        JLabel secondColumnLabel = new JLabel("Last Name");

        JTextField tf = new JTextField();
        // tf.setBounds(20,20, 100,20);

        JTextField tf2 = new JTextField();
        JTextField tf3 = new JTextField();
        JTextField tf4 = new JTextField();
        JTextField tf5 = new JTextField();
        JTextField tf6 = new JTextField();

        frame.add(firstColumnLabel);
        frame.add(secondColumnLabel);

        frame.add(tf);

        frame.add(tf2);

        frame.add(tf3);
        frame.add(tf4);
        frame.add(tf4);
        frame.add(tf5);
        frame.add(tf6);

        frame.setLayout(new GridLayout(4, 2));

        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
