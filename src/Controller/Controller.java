package Controller;

import Model.Model;

import javax.swing.*;
import javax.swing.text.View;
import java.awt.*;

/**
 * File name: Controller.java
 * Short description:
 * IST 242 Assignment:
 *
 * @author GUI Group 4 Peter Bachman, Michael John
 * @version 1.03 12/15/2022
 */

public class Controller {
    Model model;
    View view;

    public void Controller(View v, Model m) {
        this.model = m;
        this.view = v;


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(600, 400));
        frame.pack();
        frame.setVisible(true);
    }







    public void setModel(Model model) {
        this.model = model;
        this.view = view;

    }

}






