package View;

import javax.swing.*;
import java.awt.*;

/**
 * File name: View.SplashPanel.java
 * Short description:
 * IST 242 Assignment:
 *
 * @author Peter Bachman
 * @version 1.01 11/4/2022
 */

public class SplashPanel extends JPanel {
    // Instance Variables -- define your private data
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();


// End of Instance Variables
    // Constructor -- initialize your data
public void paintComponent(Graphics g) {

    super.paintComponent(g);
    g.setColor(Color.BLACK);
    g.fillRect(0, 0, 2000, 1000);
    g.setColor(Color.WHITE);
    g.setFont(new Font("TimesRoman", Font.BOLD, 30));
    g.drawString("Welcome to Mancala", 100, 50);
    g.drawString("Created by GUI Group 4", 100, 150);
    g.drawString("By Peter Bachman", 100, 200);
    g.drawString("By Michael John", 100, 250);
    g.drawString("By WEB", 100, 300);
    g.setColor(Color.RED);
    g.drawString("Final Project", 100, 400);
    g.drawString("Fall 2022", 100, 450);
    g.drawString("IST 242", 100, 500);
    g.drawString("Penn State University, Brandywine", 100, 550);
    g.drawString("Professor D'Imperio", 100, 600);
    g.drawString("December 15, 2022", 100, 650);

}
    public void paint(Graphics g) {
        Toolkit t = Toolkit.getDefaultToolkit();

        Image i = t.getImage("Images/mancalasplashpage.png");
        g.drawImage(i, 600, 0, this);


        Toolkit m = Toolkit.getDefaultToolkit();

        Image w = m.getImage("Images/Nittany-Lion-No.-1@4x.png");
        //g.drawImage(w, 10, 10, this);
        g.drawImage(w, 615, 125, 130, 260, this);
        }   //

    // Constructors

    }

