package Controller;

import Model.MancalaModel;

import javax.swing.text.View;

/**
 * File name: Controller.java
 * Short description:
 * IST 242 Assignment:
 *
 * @author GUI Group 4 Peter Bachman, Michael John
 * @version 1.01 11/03/2022
 */

public class Controller {
    // Instance Variables -- define your private data
    MancalaModel model;
    View view;

    // Constructors
    public Controller(View v, MancalaModel m) {
        // initialize default values
        model = m;
        view = v;


    }
}