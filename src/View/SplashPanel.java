package View;

import javax.swing.*;
import java.awt.*;

/**
 * File name: View.SplashPanel.java
 * Short description:
 * IST 242 Assignment:
 *
 * @author Peter Bachman GUI Group 4
 * @version 1.02 12/15/2022
 */

public class SplashPanel extends JPanel {
    // Instance Variables -- define your private data
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    JButton button = new JButton("Start Game");

    // Constructors
    public SplashPanel() {

        // initialize default values
//        super();
//        setLayout(new BorderLayout());
//        JPanel right = new JPanel(new GridBagLayout());
//        JLabel imageLabel = new JLabel(new ImageIcon("images/NittanyLion.png"));
//        right.add(imageLabel, new GridBagConstraints());
//        JLabel textLabel = new JLabel("Mancala");
//
//        right.add(textLabel, new GridBagConstraints());
//        add(right, BorderLayout.EAST);
//        add(button, BorderLayout.SOUTH);
//        button.addActionListener(e -> {
//                    frame.dispose();
//                }
//        );
//
//        right.add(textLabel, new GridBagConstraints());
//        add(right, BorderLayout.EAST);
//        add(button, BorderLayout.SOUTH);
//        button.addActionListener(e -> {
//            frame.dispose();
//            new CenterPanel();
//        });
//        frame.add(this);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setPreferredSize(new Dimension(600, 400));
//        frame.pack();
//        frame.setVisible(true);
//        add(right, BorderLayout.EAST);
//
//        add(button, BorderLayout.SOUTH);
//        button.addActionListener(e -> {
//            frame.dispose();
//            new CenterPanel();
//        });

        frame.add(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(600, 400));
        frame.pack();
        frame.setVisible(true);
        frame.setBackground(Color.BLACK);
        frame.setIconImage(new ImageIcon("images/NittanyLion.png").getImage());
        frame.setResizable(false);
        add(panel);
        add(button);
        Graphics g;
        button.addActionListener(e -> {
            frame.dispose();
            new CenterPanel();
            (new CenterPanel()).setVisible(true);



            Graphics g1 = null;
            super.paintComponent(g1);
                g1.setColor(Color.BLACK);
                g1.fillRect(0, 0, 110, 200);
                g1.setColor(Color.RED);
                g1.setFont(new Font("TimesRoman", Font.BOLD, 30));
                g1.drawString("Welcome to Mancala", 100, 50);
                g1.drawString("Created by GUI Group 4", 100, 150);
                g1.drawString("By Peter Bachman", 100, 200);
                g1.drawString("By Michael John", 100, 250);
                g1.drawString("By WEB", 100, 300);
                g1.setColor(Color.RED);
                g1.drawString("Final Project", 100, 400);
                g1.drawString("Fall 2022", 100, 450);
                g1.drawString("IST 242", 100, 500);
                g1.drawString("Penn State University, Brandywine", 100, 550);
                g1.drawString("Professor D'Imperio", 100, 600);
                g1.drawString("December 15, 2022", 100, 650);

        });



        /*JPanel left = new JPanel(new GridBagLayout());
        JLabel imageLabel1 = new JLabel(new ImageIcon("Images/mancalasplashpage.png"));

        right.add(imageLabel1, new GridBagConstraints());
        JLabel textLabel1 = new JLabel("Mancala");

        left.add(textLabel1, new GridBagConstraints());
        add(left, BorderLayout.WEST);
        add(button, BorderLayout.SOUTH);
        button.addActionListener(e -> {
                    frame.dispose();
                }
        );

        right.add(textLabel, new GridBagConstraints());
        add(right, BorderLayout.WEST);
        add(button, BorderLayout.SOUTH);
        button.addActionListener(e -> {
            frame.dispose();
            new CenterPanel();
        });
        frame.add(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(600, 400));
        frame.pack();
        frame.setVisible(true);
        add(left, BorderLayout.WEST);
        frame.setLayout(new BorderLayout());
        panel.setLayout(new BorderLayout());


    }
*/

        // Get methods - one get method for each instance variable defined above
        //             - purpose is to return the value stored in the private variable

        //public JPanel getPanel () {
           // return panel;
        //}

        //public JFrame getFrame () {
         //   return frame;
        }

// End of Instance Variables
        // Constructor -- initialize your data

        public void paint (Graphics g){


            Toolkit t = Toolkit.getDefaultToolkit();
            Image i = t.getImage("Images/preview.png");
            //g.drawImage(i, 0, 0, this);
            g.drawImage(i, -100, 0, 1000, 667, this);

            Toolkit m = Toolkit.getDefaultToolkit();
            Image w = m.getImage("Images/Nittany-Lion-No.-1@4x.png");
            //g.drawImage(w, 10, 10, this);
            g.drawImage(w, 10, 500, 130, 260, this);

            Toolkit n = Toolkit.getDefaultToolkit();
            Image k = n.getImage("Images/credits.png");
            //g.drawImage(k, 10, 10, this);
            g.drawImage(k, 900, 0, 600, 850, this);


        }

        @Override
        public void repaint (Rectangle r){
            super.repaint(r);
        }

        public void setPanel (JPanel panel){
            this.panel = panel;
        }

        // Constructors

        }




