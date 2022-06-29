package assignments;

/**
 * Class for Assignment 1.
 * Demonstrates a while loop.
 *
 * @author Clayton Mays
 */
public class Assignment1Part1 {
    /**
     * The Main method for the class.
     * creates a counter, and iterates over it
     *
     * @param args
     */
    public static void main(String[] args) {
        int counter = 0;

        while (counter < 7) {
            System.out.println("counter: " + counter);
            counter++;
        }
    }
}
