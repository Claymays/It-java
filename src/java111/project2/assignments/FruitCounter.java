package assignments;

/**
 * A class for collecting Fruit objects, and counting them.
 *
 * @author Clayton Mays
 */
public class FruitCounter {
    Fruit[] basket;
    int total = 0;


    /**
     * Instantiates the basket instance variable, fills it,
     * and prints to the terminal window the total number of fruits.
     */
    public void run() {
        basket = new Fruit[6];
        Fruit avocado = new Fruit();
        Fruit melon = new Fruit();
        Fruit grape = new Fruit();
        Fruit banana = new Fruit();
        Fruit apple = new Fruit();
        Fruit strawberry = new Fruit();

        basket[0] = avocado;
        basket[1] = melon;
        basket[2] = strawberry;
        basket[3] = banana;
        basket[4] = apple;
        basket[5] = grape;

        basket[0].setName("avocado");
        basket[0].setQuantity(5);

        basket[1].setName("melon");
        basket[1].setQuantity(2);

        basket[2].setName("strawberry");
        basket[2].setQuantity(20);

        basket[3].setName("banana");
        basket[3].setQuantity(6);

        basket[4].setName("apple");
        basket[4].setQuantity(12);


        basket[5].setName("grape");
        basket[5].setQuantity(60);

        for (int i = 0; i < basket.length; i++) {
            total += basket[i].getQuantity();
        }
        System.out.println("Total pieces of fruit: " + total);
    }
}

/**
 * A class for testing the FruitCounter class
 *
 * @author Clayton Mays
 */
class FruitCounterTestDrive {
    /**
     * Main method of the class meant for testing purposes.
     *
     * @param args
     */
    public static void main(String[] args) {
        FruitCounter basket = new FruitCounter();

        basket.run();
    }
}