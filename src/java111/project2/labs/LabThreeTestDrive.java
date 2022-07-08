package labs;


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
