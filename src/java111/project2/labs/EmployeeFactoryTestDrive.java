package labs;

/**
 * A class for testing the EmployeeFactory class
 *
 * @author Clayton Mays
 */
public class EmployeeFactoryTestDrive {


    public static void main(String[] args) {
        EmployeeFactory factory = new EmployeeFactory();

        factory.setup();
        factory.runWhile();
        factory.runFor();
    }
}
