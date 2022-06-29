package labs;

/**
 * Class for module 1 lab 2.
 * Demonstrates looping.
 *
 * @author Clayton Mays
 */
public class Lab2Looping {
    /**
     * This is the main method for this class
     * which will loop 13 times outputting the counter and its square
     *
     * @param args
     */
    public static void main(String[] args) {
        int counter = 0;

        while (counter < 13) {
            System.out.println(counter + " " + counter * counter);
            counter++;
        }

    }
}
