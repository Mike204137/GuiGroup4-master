package View;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


//public class View<MainFrame> {
public class View extends JPanel {

    private JLabel label;
    private JPanel panel;

    public View() {


        this.panel = new JPanel();
        panel.add(label);
        add(panel);
        setPreferredSize(new Dimension(600, 400));
    }
}

