import java.util.Random;

/**
 * Write a description of interface IMarkovModel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public interface IMarkovModel {
    public void setRandom(int seed);

    public void setTraining(String text);
    
    public String getRandomText(int numChars);
    
}
