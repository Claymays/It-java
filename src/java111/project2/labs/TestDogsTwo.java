package labs;

 /** A class for testing DogLabTwo.
        *
        * @author Clayton Mays
        */
public class TestDogsTwo {
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

        DogLabTwo dog3 = new DogLabTwo();
        dog3.name = "Azuka";

        dog1.bark();
        dog2.bark();
        dog3.bark();

        dog2 = dog1;
        dog3 = null;

        dog1.bark();
        dog2.bark();
        dog3.bark();
    }
}