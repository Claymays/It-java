/**
 * A class for project 1
 * Writes my full name to the terminal window 7 times
 *
 * @author Clayton Mays
 */
public class NameLoop {
    String fullName = "Anthony Clayton Eugene Mays";
    int counter = 7;

    // Prints the fullName variable to the terminal window.
    public void writeMyName() {
        while (counter > 0) {
            System.out.println(fullName);
            counter--;
        }
    }
}

/**
 * A testing class for the NameLoop class.
 *
 * @author Clayton Mays
 */
class NameLoopTestDrive {
    /**
     * Instantiates an object of the NameLoop class, and calls its method
     *
     * @param args
     */
    public static void main(String[] args) {
        NameLoop nameLoopObject = new NameLoop();

        nameLoopObject.writeMyName();
    }
}
