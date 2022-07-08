package labs;

/**
 * A class for Module 2 Lab 6.
 *
 * Tests conversion of int into double.
 *
 * @author Clayton Mays
 */
public class FunWithNumbers {
    private int five = 5;
    private int ten = 10;
    private int three = 3;
    private int twentyFive = 25;
    private int intResults = 0;
    private double doubleResults = 0.0;

    // A method for printing calculations to the terminal window
    public void run() {
        intResults = five + ten + twentyFive + three;
        doubleResults = (double) five * ten * twentyFive / three;

        System.out.printf("%d + %d + %d + %d = %d \n",
                five, twentyFive, ten, three, intResults);

        System.out.printf("%d + %d + %d / %d = %f",
                five, ten, twentyFive, three, doubleResults, "\n");
    }
}
