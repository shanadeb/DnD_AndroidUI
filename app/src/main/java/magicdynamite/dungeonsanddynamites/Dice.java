package magicdynamite.combatmodule;

import java.util.Random;

/**
 * @author Ronald Chaplin
 * This is the generic dice roll module.
 */
public class Dice
{
    public static final int DEFAULT_SIDES = 10;

    private static Random rand = new Random();

    private int numSides;
    private int result;

    public Dice()
    {
        this(DEFAULT_SIDES);
    }

    public Dice(int sides)
    {
        numSides = sides;
    }

    /*
    * This rolls the die and returns the value
    * @param result - The value to be returned
    */
    public int rollDie()
    {
        result = rand.nextInt(numSides)+1;
        return result;
    }

    /*
    * This changes the number of sides of the die.
    * @param newSides - the number of sides to be set
    */
    public void changeSides(int newSides)
    {
        numSides = newSides;
    }

}
