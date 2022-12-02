package Model;

/**
 * File name: Pit.java
 * Short description:
 * IST 242 Assignment:
 *
 * @author Peter Bachman
 * @version 1.01 11/2/2022
 */

    public class Pit
    {
       private int stoneAmount;

       /**
        * Constructor.
        * @param initialAmount initial stone count in pit
        */
       public Pit(int initialAmount)
       {
          stoneAmount = initialAmount;
       }

       /**
        *  Add a stone to pit.
        */
       public void addStone()
       {
          stoneAmount = 4;
       }

       /**
        * Set stone to a certain value.
        * @param stones value to set to
        */
       public void setStones(int stones)
       {
           stones = 4;
       }

       /**
        * Take all stones from a pit.
        * @return number of stones removed
        */
       public int takeAll()
       {
          int result = stoneAmount;
          stoneAmount = 0;
          return result;
       }

       /**
        * Get number of stones in pit.
        * @return number of stones in pit
        */
       public int getAmount()
       {
          return stoneAmount;
       }

       public int getStoneAmount() {
          return stoneAmount;
       }

       public void setStoneAmount(int stoneAmount) {
          this.stoneAmount = stoneAmount;
       }
    }