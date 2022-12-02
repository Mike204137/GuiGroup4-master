package Model;

/**
 * File name: Player.java
 * Short description:
 * IST 242 Assignment: GUI4 Mancala Design Document
 *
 * @author Peter Bachman
 * @version 1.01 11/2/2022
 */

public class Player {
    // Instance Variables -- define your private data
    //player1
    //player2
    //AI player
    //Players take "turns"
    //Players "own" pits that are numbered 1-6 and 8/14 depending on which side of the board they are on
    //Players "own" a pit called a Mancala that is numbered 7 or 15 depending on which side of the board they are on
    //player1 goes first and moves stones from an owned pit 1-6 to the right sequentially adding one stone to each pit
    //player2 goes second and moves stones from an owned pit to the left sequentially adding one stone to each pit
    //player1 and player2 take turns until all pits are empty
    //player1 and player2 have 48 stones to start with 4 stones in each pit except the Mancala
    

    //player1 and player2 have 6 pits each, and a Mancala

    //player1's pits are gridbag south and  player2's pits are gridbag north
    //player1's mancala is gridbag east and player2's mancala is gridbag west


    // Constructors
    public Player() {
        // initialize default values
    }

    public Player(int data) // pass in data to initialize variables
    {
    }

    // Set methods - one set method for each instance variable defined above
    //             - purpose is to pass in a value stored in the private variable

    // Get methods - one get method for each instance variable defined above
    //             - purpose is to return the value stored in the private variable

    // Additional methods -- such as for calculation, display

    public String toString() {
        // return data as a String
        return "";
    }


}