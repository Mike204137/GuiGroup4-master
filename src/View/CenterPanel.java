
package View;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.awt.image.ImagingOpException;
import java.io.File;
import java.io.IOException;
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


        setBackground(Color.LIGHT_GRAY);

        /*
        BufferedImage img = null;
        try {
            img = ImageID.read(new File("mancalasplashpage.png"));
        } catch (IOException)
        static BufferedImage read(File "Images/mancalasplashpage.png") throws IOException;
        static BufferedImage read(
        }
        */

    }



}


/*
public class CenterPanel extends Component {

    BufferedImage img;

    public void paint(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }

    public CenterPanel() {
        try {
            img = ImageIO.read(new File("Images/mancalasplashpage.png"));
        } catch (IOException e) {
        }

    }

    public Dimension getPreferredSize() {
        if (img == null) {
            return new Dimension(100,100);
        } else {
            return new Dimension(img.getWidth(null), img.getHeight(null));
        }
    }

    //public static void main(String[] args)

    {

        JFrame f = new JFrame("Load Image Sample");

        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        f.add(new CenterPanel());
        f.pack();
        f.setVisible(true);
    }

    public BufferedImage getImg() {
        return img;
    }
}
*/





