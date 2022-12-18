package Model;

import View.CenterPanel;
import View.GameBoard;
import View.SplashPanel;

import javax.swing.*;

/**
 * File name: Model.java
 * Short description:
 * IST 242 Assignment:
 *
 * @author Peter Bachman
 * @version 1.01 12/15/2022
 */

public class Model extends JFrame {
    // Instance Variables -- define your private data
    private MancalaModel mancalaModel;
    private GameBoard board;


    // Constructors
    public Model() {
      SplashPanel();
        // Create the model
        SplashPanel SplashPanel = new SplashPanel();

        // Create the view
        SplashPanel();
        // Add the view to the frame
        add(SplashPanel);
        // Set the frame properties
        setTitle("Mancala Gui Group4");
        setSize(800, 600);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        // Start the game

        Music player = new Music();
        player.play("Audio/Majestic-Middle-Eastern-Desert-splash16.wav");

        



    }

    private void SplashPanel() {
    }

    private void ShowSplashScreen() {
    }


    public Model(MancalaModel mancalaModel, GameBoard board, CenterPanel cPanel) {
        this.mancalaModel = mancalaModel;
        this.board = board;


    }
}