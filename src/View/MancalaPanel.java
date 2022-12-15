package View;

import Model.BoardFormatter;
import Model.MancalaModel;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

/**
	COPYRIGHT (C). All Rights Reserved.
	@author Jonathan Sagabaen modified by Peter Bachman
	@version 1.01
	Class representing a mancala display.
*/

public class MancalaPanel extends JPanel implements ChangeListener
{
   private int stoneAmount;   
   private char playerMancala;   
   private MancalaModel mancalaModel;
   private BoardFormatter format;


   /**
    * Constructor.
    * @param mancalaModel mancalaModel this panel is tied to
    * @param playerMancala player this mancala represents
    */
   public MancalaPanel(MancalaModel mancalaModel, char playerMancala)
   {
      this.mancalaModel = mancalaModel;
      this.playerMancala = playerMancala;
      
      stoneAmount = mancalaModel.getMancalaValue(playerMancala);
      //stoneAmount = 4;
      stoneAmount =0; //for testing to see if works to remove stones appearing in mancala pits initially


   }

   /**
    * Set display format for this panel.
    * @param format format to use
    */
   public void setFormat(BoardFormatter format)
   {
      this.format = format;
   }
   
   /**
    * Paint this panel.
    */
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      Graphics2D g2 = (Graphics2D) g;
      g2.setColor(format.getColor());
      g2.draw(format.getMancalaShape());
      g2.setColor(format.getFillColor());
      for (Shape s : format.getMancalaStoneShapes(stoneAmount))
      	g2.fill(s);
      g2.setColor(Color.BLACK);
      g2.drawString("Player " + Character.toUpperCase(playerMancala), 50, GameBoard.MANCALA_HEIGHT + 20);
   }
   
   /**
    * Update panel based on mancalaModel.
    */
   public void stateChanged(ChangeEvent e)
   {
      stoneAmount = mancalaModel.getMancalaValue(playerMancala);
   }
}
