package assignments;

/**
 * Second part of the first assignment.
 *
 * @author Clayton Mays
 */
public class Assignment1Part2 {
    /**
     * The main method for the class.
     * Checks progress through a while loop, and prints updates.
     *
     * @param args
     */
    public static void main(String[] args) {
        int counter = 0;
        int max = 20;

        while (counter < max) {
            if (counter == 0) {
                System.out.println(counter + " First time!");
            } else if (counter == max / 2) {
                System.out.println(counter + " Half-way there!");
            } else if (counter == max - 1) {
                System.out.println(counter + " All done!");
            } else {
                System.out.println(counter);
            }
            counter++;
        }
    }
}
