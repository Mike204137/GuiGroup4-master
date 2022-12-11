
package View;

import org.w3c.dom.ls.LSOutput;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class CenterPanel extends JPanel implements ActionListener {

    // Instance Variables -- define your private data
    JButton b1;
    JLabel message;

    public void paint(Graphics g) {
        Toolkit t = Toolkit.getDefaultToolkit();

        Image i = t.getImage("Images/mancalaspashpage.png");
        g.drawImage(i, 0, 0, this);


        Toolkit m = Toolkit.getDefaultToolkit();

        Image w = m.getImage("Images/Nittany-Lion-No.-1@4x.png");
        //g.drawImage(w, 10, 10, this);
        g.drawImage(w, 400, 100, 130, 260, this);

    }


    public CenterPanel() {
        b1 = new JButton("Play Music");
        b1.addActionListener(this);
        add(b1);
        //System.out.println("Mancala Button");
        message = new JLabel("Mancala Game Music");
        add(message);
    }

    public void actionPerformed(ActionEvent event) {
        System.out.println("Mancala");
        Object obj = event.getSource();
        if (event.getSource() == b1) {
            message.setText("-" + b1.getText() + "- was clicked");
        }
        System.out.println("Mancla1");

    }

    /*
    //SimpleAudioPlayer clip;

    // Method to play the audio
    public void play(String status) {
        start the clip
        Clip clip;

        clip = new Clip("Audio/Majestic-Middle-Eastern-Desert-splash16.wav");


        status = "play";

        AudioFormat format = audioStream.getFormat();
        DataLine.Info info = new DataLine.Info(Clip.class, format);
        this.clip = (Clip) AudioSystem.getLine(info);
    }
    */

}
/*
    public class PlayAudio {

    //public static void main(String[] args) {

            // specify the path to the audio file
        AudioInputStream audioInputStream;
        Clip clip;
        static String filePath;
        filePath = "Audio/Majestic-Middle-Eastern-Desert-splash16.wav";

        try {
           // create an AudioInputStream object
           //AudioInputStream audioStream = AudioSystem.getAudioInputStream(new File(filePath));
            File audioFile = new File(filePath);
            //AudioInputStream audioStream = (AudioInputStream) AudioSystem.getClip(audioFile);
            // create clip reference

            audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());

            // create a Clip object
           clip = AudioSystem.getClip();

        // open audioInputStream to the clip
        clip.open(audioInputStream);

        clip.loop(Clip.LOOP_CONTINUOUSLY);

        } catch (Exception e) {
            System.out.println("Error with playing sound.");
            e.printStackTrace();
            }
        }
    }
}
*/





