JavaMancalaApp
==============

A Mancala GUI application written in Java as a Java programming learning experience.

A two player board game that consists of pits and stones that is currently called Kalah.

We are creating an example of Mancala/Kalah for a GUI assignment at PSU IST 242 using
existing code and adding our refinements.

The objective of the game is to collect the most stones by clearing the pits at alternating turns. The rules specify a free
turn when the last stone is placed in an empty pit on the player's side of the board. The game ends when all pits on one side of the board are empty.

The implementation of the application is organized using the MVC software design pattern. However it is being refactored to fit the standardized
IST 242 MVC design pattern starting from App.java which follows Penn State's IST 242 MVC design pattern.

Code for the GUI side 
of the application uses standard Java Swing components.

The game logic maintains game states to keep
track of player actions and results.  Player input is accepted through mouse clicks done through the Java panels 
that are diplayed, the game states are updated, then the results update the display back to the user.
