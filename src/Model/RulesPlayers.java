package Model;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;

import static javax.swing.SwingConstants.*;

//project comments
//Peter Bachman



        //comments refactoring curently in progress post presentation to use MVC and
        //standardized naming conventions
        //Intial Page before game starts with buttons to start game and get Player names as an
        //example of JTextField and JButtons, In order to maintain the MVC design pattern, the App class will not have
        // GUI elements that can handled by the View class.
public class RulesPlayers {
            //private static Component JtextField= Computer;
            private static String JtextField1 = "Player1";
            private static String JtextField2 = "Player2";

            public static void main(String[] args) {
                //informational only changes in progress not production ready
                JFrame frame = new JFrame("Mancala"); //TEMPORARY
                JPanel panel = new JPanel();


                frame.setSize(1000, 700);


                int center = CENTER;
                int center1 = CENTER;

                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(800, 600);
                frame.setVisible(true);
                frame.setLayout(new BorderLayout());
                JTextArea textArea = new JTextArea(20, 30);
                textArea.setEditable(false);
                textArea.setLineWrap(true);
                textArea.setWrapStyleWord(true);
                textArea.setAlignmentX(CENTER);
                textArea.setAlignmentY(CENTER);
                textArea.setForeground(Color.WHITE);
                textArea.setBackground(Color.BLACK);
                textArea.setFont(new Font("Arial", Font.PLAIN, 20));
                textArea.setText("Welcome to Mancala! Presented by IST 242 GUI Group 4 Fall 2022" + "\n" + "\n" +
                        "This is a two player game. Each player has six pits and a store." + "\n" +
                        "The goal of the game is to capture more stones than your opponent." + "\n" +
                        "The game is played in turns. Each turn, a player selects one of their pits." + "\n" +
                        "The stones in that pit are then distributed counter-clockwise." + "\n" +
                        "If the last stone lands in your store, you get another turn." + "\n" +
                        "If the last stone lands in an empty pit on your side, you capture that stone and any stones in the opposite pit." + "\n" +
                        "The game ends when all six pits on one side of the Mancala board are empty." + "\n" +
                        "The player who still has stones on their side of the board when the game ends captures all of those stones." + "\n" +
                        "The player with the most stones in their store wins the game." + "\n" + "\n" +
                        "Good Luck!" + "\n" + "\n" +
                        "Please enter your names" + "\n" + "\n" +
                        "Player 2: defaults to an AI algorithm if no player name is selected - future version not in this release" + "\n" +
                        "Audio effects and music are optional. If you would like to turn them on, " +
                        "please click the audio button in lower left corner in maximized window." + "\n" + "\n");


                frame.add(textArea, BorderLayout.CENTER);
                //Component image= panel.getRootPane();

                //frame.add(panel, BorderLayout.SOUTH);
                frame.setVisible(true);


                frame.setIconImage(Toolkit.getDefaultToolkit().getImage("Imqges/middle.png"));
                JScrollPane scrollPane = new JScrollPane(textArea);
                frame.add(scrollPane, BorderLayout.CENTER);
                JButton button = new JButton("Play");
                frame.add(button, BorderLayout.EAST);


                frame.setVisible(true);
                button.setAlignmentX(CENTER);
                button.setAlignmentY(CENTER);
                frame.setVisible(true);
                JCheckBox checkBox = new JCheckBox("Play Audio") {
                    @Override
                    public void paint(Graphics g) {
                        super.paint(g);
                        g.setColor(Color.BLACK);
                        g.fillRect(20, 20, getWidth(), getHeight());
                    }
                };
                checkBox.setAlignmentX(CENTER);
                checkBox.setAlignmentY(CENTER);
                frame.add(checkBox, BorderLayout.SOUTH);


                {

                    JTextField playerName1 = new JTextField(20);
                    JTextField playerName2 = new JTextField(20);
                    playerName1.setText("Player 1");
                    playerName2.setText("Player 2");
                    playerName1.setEditable(true);
                    playerName2.setEditable(true);
                    playerName1.setBorder(BorderFactory.createLineBorder(Color.BLACK.brighter()));
                    playerName2.setBorder(BorderFactory.createLineBorder(Color.BLACK.brighter()));
                    playerName1.setHorizontalAlignment(LEFT);
                    playerName2.setHorizontalAlignment(RIGHT);
                    playerName1.setAlignmentX(LEFT);
                    playerName2.setAlignmentX(RIGHT);
                    playerName1.setAlignmentY(CENTER);
                    playerName2.setAlignmentY(CENTER);
                    playerName1.setFont(new Font("Arial", Font.PLAIN, 24));
                    playerName2.setFont(new Font("Arial", Font.PLAIN, 24));
                    playerName1.setForeground(Color.BLACK);
                    playerName2.setForeground(Color.BLACK);
                    playerName1.setBackground(Color.BLUE);
                    playerName2.setBackground(Color.BLUE);
                    playerName1.setCaretColor(Color.WHITE);
                    playerName2.setCaretColor(Color.WHITE);
                    playerName1.setOpaque(false);
                    playerName2.setOpaque(false);
                    playerName1.setVisible(true);
                    playerName2.setVisible(true);
                    frame.add(playerName1, BorderLayout.NORTH);
                    frame.add(playerName2, BorderLayout.NORTH);
                    frame.setVisible(true);
                }

                checkBox.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (checkBox.isSelected()) {
                            try {
                                SimpleAudioPlayer audioPlayer =
                                        new SimpleAudioPlayer();
                                Music.play();
                            } catch (UnsupportedAudioFileException unsupportedAudioFileException) {
                                unsupportedAudioFileException.printStackTrace();
                            } catch (IOException ioException) {
                                ioException.printStackTrace();
                            } catch (LineUnavailableException lineUnavailableException) {
                                lineUnavailableException.printStackTrace();
                            }
                        }
                    }
                });
            }
        }














