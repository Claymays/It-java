package labs;

/**
 * Class for lab 1.2
 *
 * @author Clayton Mays
 */
public class LabOneSelection {

    /**
     * Main method for this class which will compare
     * a variable to the number 100 and output message
     * indicating whether or not the variable is bigger than 100.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        int benchMark = 100;
        int test = 42;
        String resultMessage = test > benchMark ?
                "It is bigger than 100" : "It's not bigger than 100";

        System.out.println(resultMessage);
    }
}
