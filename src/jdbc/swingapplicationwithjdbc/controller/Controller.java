/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.swingapplicationwithjdbc.controller;


import jdbc.swingapplicationwithjdbc.model.Model;
import jdbc.swingapplicationwithjdbc.model.resources.UserInformation;
import jdbc.swingapplicationwithjdbc.view.FrameView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 * @author aakash
 */
public class Controller {
    private FrameView frameView;

    public Controller(FrameView frameView) {
        this.frameView = frameView;
    }

    public void submit() {
        frameView.submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Model model = new Model();
                try {
                    model.saveUserInformation(frameView.nameField.getText(),
                            frameView.addressField.getText(),
                            frameView.ageField.getText(),
                            frameView.contactNumberField.getText());
                } catch (Exception ex) {
                    System.out.println("Exception occurred: " + ex.getMessage());
                }
            }
        });
    }

    public void showRecords() {
        frameView.showRecordsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Model model = new Model();
                try {
                    List<UserInformation> allInformation = model.getAllInformation();
                    System.out.println(allInformation.toString());
                } catch (Exception ex) {
                    System.out.println("Exception occurred: " + ex.getMessage());
                }
            }
        });
    }
}
