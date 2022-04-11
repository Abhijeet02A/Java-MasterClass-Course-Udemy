package Section7.Composition;

public class Ceiling {
    private int height;
    private int paintedColor;
    
    public Ceiling(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public int getPaintedColor() {
        return paintedColor;
    }
    
}
/**
 * Create a class with the name Ceiling. 
 * There are two member variables for this one, height, and paintedColor, both of type int.
 *  there should also be a constructor which accepts both member variables as parameters. 
 * there are also two additional methods which should be defined:
 *  getheight() shall return the value of height and getPaintedColor(0 should return the value of paintedColor.
 */