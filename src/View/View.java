package View;


import java.awt.event.ActionEvent;

public class View {


    /**
     * Constructs a new object.
     */
    // Instance Variables -- define your private data
    private MainFrame mf;
    private InitialPanel iPanel;
    private CenterPanel cPanel;

    // Constructors
    public View() {
        // initialize default values
        mf = new MainFrame();
        // initialize our view panels
        iPanel = mf.getIp();
        cPanel = mf.getIp().getCp();

    }


    public InitialPanel getiPanel() {
        return iPanel;
    }

    public CenterPanel getcPanel() {
        return cPanel;
    }


    // --Commented out by Inspection START (12/12/2022 6:55 PM):
//    public void actionPerformed(ActionEvent e) {
//        // TODO Auto-generated method stub
//
//    }
// --Commented out by Inspection STOP (12/12/2022 6:55 PM)
}