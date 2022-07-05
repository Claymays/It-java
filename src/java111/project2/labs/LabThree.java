package labs;

/**
 * A class that prints greetings to names given as arguments
 *
 * @author Clayton Mays
 */

public class LabThree {

    // A method that prints a greeting to the given name in the terminal window
    public void sayHello(String name) {
        System.out.println("Hello there " + name);
    }

    // A method that prints a greeting to the given name as often as requested.
    public void sayHelloAgain(String name, int counter) {
        while (counter != 0) {
            System.out.println("Hello " + name);
            counter--;
        }
    }
}

/**
 * A testing class for LabThree
 *
 * @author Clayton Mays
 */
class LabThreeTestDrive {

    // A method for greeting meddling kids.
    public static void main(String[] args) {
        LabThree speaker = new LabThree();

        speaker.sayHello("Scooby");
        speaker.sayHello("Vilma");
        speaker.sayHello("Shaggy");
        speaker.sayHello("Fred");
        speaker.sayHello("Daphne");

        speaker.sayHelloAgain("Scrappy-Doo", 5);
    }
}
