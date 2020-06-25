/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingwithoutmvc;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author aakash
 */
public class CardLayoutButtonExample {

    public static void main(String[] args) {
        final CardLayout cardLayout = new CardLayout(40, 30);
        JFrame frame = new JFrame();

        final Container container = frame.getContentPane();
        container.setLayout(cardLayout);

        JButton firstButton = new JButton("First button");
        JButton secondButton = new JButton("Second button");
        
        container.add(secondButton);
        container.add(firstButton);

        firstButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.next(container);
            }
        });
        
        secondButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.next(container);
            }
        });

        frame.setSize(500, 500);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
