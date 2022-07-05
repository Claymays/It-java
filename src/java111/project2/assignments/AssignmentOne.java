package assignments;

public class AssignmentOne {
    int counter = 10;
    double additionValue = 12.76;
    double total = 0;

    public void runLoop() {
        total = 0;

        System.out.printf("Adding %f to a total %f %d times results in: ",
                            additionValue, total, counter);

        while (counter > 0) {
            total += additionValue;
            counter--;
        }
        System.out.println(total);
    }
}

/**
 * A test drive class for module 2 assignment 1.
 *
 * @author Clayton Mays
 */
class AssignmentOneTestDrive {
    /**
     * The main method of the test drive class.
     * Creates an instance of the AssignmentOne class, and calls its method.
     *
     * @param args
     */
    public static void main(String[] args) {
        AssignmentOne test = new AssignmentOne();

        test.runLoop();
    }
}
