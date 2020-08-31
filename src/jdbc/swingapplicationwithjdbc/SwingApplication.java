/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.swingapplicationwithjdbc;

import jdbc.swingapplicationwithjdbc.controller.Controller;
import jdbc.swingapplicationwithjdbc.view.FrameView;

/**
 * @author aakash
 */
public class SwingApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FrameView frame = new FrameView();
        Controller controller = new Controller(frame);
        controller.submit();
        controller.showRecords();
    }

}
