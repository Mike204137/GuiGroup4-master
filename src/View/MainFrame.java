package View;

import javax.swing.*;



public class MainFrame extends JFrame {

    private InitialPanel ip;

    public MainFrame() {
        //Constructors
        //InitialPanel ip;
        //cPanel = new CenterPanel();
        //add(cPanel);

        // initialize default values
        //super("Gui Group 4 Mancala Project");

        // create our panel and add it to the frame
        ip = new InitialPanel();
        add(ip);

        // finalize settings for frame
        setSize(1000, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public InitialPanel getIp() {
        return ip;
    }
}
