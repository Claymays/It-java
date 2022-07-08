package labs;

/**
 * A testing class for the class LabFiveVariables
 *
 * @author Clayton Mays
 */
public class LabFiveVariablesTestDrive {

    /**
     * Instantiates an object of the LabFiveVariables class
     * Calls its run method, and prints its instance variables to the terminal
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        LabFiveVariables builder = new LabFiveVariables();

        builder.run();
        System.out.printf("The instance variable named count is: %d " +
                "(printed from the 'main()' method\n", builder.getCount());
    }
}
