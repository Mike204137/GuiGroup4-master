package View;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CenterPanel extends JPanel {

    // Instance Variables -- define your private data

    public void paint(Graphics g) {
        Toolkit t = Toolkit.getDefaultToolkit();

        Image i = t.getImage("Images/mancalasplashpage.png");
        g.drawImage(i, 10, 10, this);
    }

    // Constructors
    public CenterPanel() {
        // initialize default values

        //setBackground(Color.LIGHT_GRAY);
    }



}



