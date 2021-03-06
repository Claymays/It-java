package labs;

/**
 * A class for testing DogLabTwo.
 *
 * @author Clayton Mays
 */
public class TestDogs {
    /**
     * A method for demonstrating reference in Java objects.
     *
     * @param args
     */
    public static void main(String[] args) {
        DogLabTwo dog1 = new DogLabTwo();
        dog1.name = "Fido";

        DogLabTwo dog2 = new DogLabTwo();
        dog2.name = "Spot";

        dog1.bark();
        dog2.bark();

        dog2 = dog1;

        dog1.bark();
        dog2.bark();
    }
}
