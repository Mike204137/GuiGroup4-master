package View;

import javax.swing.*;
import java.awt.*;

public class InitialPanel extends JPanel {
    // Instance Variables -- define your private data
    private CenterPanel cp;


    // Constructors
    public InitialPanel() {
        // initialize default values
        super();
        setLayout(new BorderLayout());
        cp = new CenterPanel();
        add(cp, "Center");
    }

    // Get methods - one get method for each instance variable defined above
    //             - purpose is to return the value stored in the private variable

    public CenterPanel getCp() {
        return cp;
    }


}
