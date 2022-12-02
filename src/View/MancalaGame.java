package View;

import Model.MancalaModel;
import Model.RectangleFormat;

/**
   COPYRIGHT (C). All Rights Reserved.
   @author Jonathan Sagabaen
   @version 1.00

   Main class for Mancala Game.
*/

import javax.swing.*;

public class MancalaGame extends JFrame
{
	private MancalaModel model;
	private GameBoard board;
	private CenterPanel cPanel;
	
	public static void main(String [] args)
	{
		MancalaGame m = new MancalaGame();
	}
	
	/**
	 * Constructor for MancalaGame.
	 */
	public MancalaGame()
	{
		initGame();
	}
	
	/**
	 * Initializes the game by creating the model and views and attaching
	 * them.
	 */
	public void initGame()
	{
		if (board != null)
		{
			board.dispose();
		}

		cPanel = new CenterPanel();
		add(cPanel);

		String initPits = JOptionPane.showInputDialog("Welcome to Mancala Group 4: Please Enter your Name", "Player 1");
		// model = new MancalaModel(Integer.parseInt(initPits));
		// int opt = JOptionPane.showOptionDialog(null, "Board Style is by Default Rectangular:", "Board Style", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[] { "Rectangle", "Elliptical" }, 0);

		//int opt = JOptionPane.showOptionDialog(null, "Board Style is by Default Rectangular:", "Board Style", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[] { "Rectangle" }, 0);

		int opt = 0;

		switch (opt)
		{
		case 0:
			board = new GameBoard(this, model, new RectangleFormat());
			break;
		case 1:
			board = new GameBoard(this, model, new EllipseFormat());
			break;
		default:
			board = new GameBoard(this, model, new RectangleFormat());
		}
	}
	
	/**
	 * Handles the end of the game and asks the player if they want to play
	 * again.
	 * @param winner the winner of the game, 'a' or 'b'
	 */
	public void endGame(char winner)
	{
		int option = JOptionPane.showConfirmDialog(board, "Player " + Character.toUpperCase(winner) + " wins!\nDo you wish to play again?", "Congratulations!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (option == JOptionPane.NO_OPTION)
		{
			board.dispose();
			System.exit(0);
		}
		else
		{
			initGame();
		}		
	}
}
