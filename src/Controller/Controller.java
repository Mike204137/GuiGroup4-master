package Controller;

import Model.MancalaModel;
import Model.Model;

import javax.swing.text.View;

/**
 * File name: Controller.java
 * Short description:
 * IST 242 Assignment:
 *
 * @author GUI Group 4 Peter Bachman, Michael John
 * @version 1.03 12/15/2022
 */

public class Controller {
    // Instance Variables -- define your private data


    Model model;
    View view;


    // Constructors

    public Controller(View v, Model m) {
        this.model = m;
        this.view = v;



    }


    public Controller(View view, MancalaModel mancalaModel) {
    }



    public Controller(Object view, Model model) {

    }
}


