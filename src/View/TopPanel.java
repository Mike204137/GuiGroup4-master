package View;

import Model.MancalaModel;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
	COPYRIGHT (C). All Rights Reserved.
	@author Jonathan Sagabaen original, Gui Group 4 modified
	@version 1.00
	
	Class representing the top display panel.
*/

public class TopPanel extends JPanel implements ChangeListener
{
	private JTextField statusText;
	private JButton undoButton;
	private JButton resetButton;
	private MancalaModel mancalaModel;
	private MancalaGame game;
	
	/**
	 * Constructor.
	 * @param g the game this panel is for
	 * @param m the mancalaModel this panel is attached to
	 */
	public TopPanel(MancalaGame g, MancalaModel m)
	{
		mancalaModel = m;
		game = g;
		statusText = new JTextField(55);
		statusText.setEditable(false);
		undoButton = new JButton("Undo");
		JButton musicButton = new JButton("Music");
		resetButton = new JButton("Reset");
		this.setLayout(new FlowLayout());
		undoButton.addMouseListener(new MouseAdapter()
				{
					public void mousePressed(MouseEvent e)
					{
						mancalaModel.undo();
					}
				});
		musicButton.addMouseListener(new MouseAdapter()
				{
					public void mousePressed(MouseEvent e)
					{
						mancalaModel.music();
					}
				});
		undoButton.setEnabled(false);
		resetButton.addMouseListener(new MouseAdapter()
				{
					public void mousePressed(MouseEvent e)
					{
						int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to reset the game?", "Reset", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
						if (option == JOptionPane.YES_OPTION)
						{
							game.initGame();
						}		
					}
				});
		add(statusText);
		add(undoButton);
		add(resetButton);
		add(musicButton);;
	}
	
	/**
	 * Update the panel state.
	 */
	public void stateChanged(ChangeEvent arg0) 
	{
		if (mancalaModel.canUndo())
			this.undoButton.setEnabled(true);
		else
			this.undoButton.setEnabled(false);
		
		String text = "Player " + Character.toUpperCase(mancalaModel.getCurrPlayer()) + "'s Turn | " + mancalaModel.getUndoCount() + " Undos Remain";
		statusText.setText(text);
	}
}
