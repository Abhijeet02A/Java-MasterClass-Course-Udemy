package Section4;

public class PlayingCat {
/**
 * The cats spend most of the day playing. In particular, they play if the temperature is 
 * between 25 and 35 (inclusive). Unless it is summer, then the upper limit is 45 (inclusive) 
 * instead of 35.
 * Write a method isCatPlaying that has 2 parameters. 
 * Method needs to return true if the cat is playing, otherwise return false
 * 1st parameter should be of type boolean and be named summer it represents if it is summer.
 * 2nd parameter represents the temperature and is of type int with the name temperature.
 */
    public static boolean isCatPlaying(final boolean summer, final int temperature) {
        if (temperature >= 25 && temperature <= 35 && summer == false) {
            return true;
        } else if (temperature >= 25 && temperature <= 45 && summer == true) {
            return true;
        }
        return false;
    }
}
