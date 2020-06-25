/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingwithoutmvc;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author aakash
 */


public class GridBagLayoutDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Grid bag layout example");
        
        GridBagLayout bagLayout = new GridBagLayout();
        frame.setLayout(bagLayout); //Note if we don't add the layout here then adding constraints below will throw an exception
        
        GridBagConstraints constraints = new GridBagConstraints();
        
        constraints.fill = GridBagConstraints.HORIZONTAL;
        
        constraints.gridx = 0;
        constraints.gridy = 0;
        frame.add(new JButton("First Button"), constraints);
        
        constraints.gridx = 1;
        constraints.gridy = 0;
        frame.add(new JButton("Second Button"), constraints);
        
        constraints.ipady = 10; //Gives padding vertical padding to the component
        constraints.gridx = 0;
        constraints.gridy = 1;
        frame.add(new JButton("Third Button"), constraints);
        
        constraints.gridx = 1;
        constraints.gridy = 1;
        frame.add(new JButton("Fourth Button"), constraints);
        
        constraints.ipady = 20;
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        frame.add(new JButton("Fifth Button"), constraints);
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 900);
    }
}

