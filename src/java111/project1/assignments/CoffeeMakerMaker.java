package assignments;

/**
 * Class for module 1 assignment 2
 *
 * @author Clayton Mays
 */
public class CoffeeMakerMaker {
    /**
     * Create an instance of CoffeeMaker, and brew coffee using its methods.
     * Main method for the class.
     *
     * @param args
     */
    public static void main(String[] args) {
        CoffeeMaker coffeePot = new CoffeeMaker();

        coffeePot.makeStrongCoffee();
        coffeePot.makeWeakCoffee();
    }
}
