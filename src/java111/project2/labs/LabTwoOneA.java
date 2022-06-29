package src.java111.project2.labs;

/**
 * A class for demonstrating multiplication of different primitives
 *
 * @author Clayton Mays
 */
public class LabTwoOneA {
    int x = 5;
    long y = 78;
    double z = 2.7;

    /**
     * A method for displaying a product of different primitives.
     */
    public void printProduct() {
        System.out.println(x + " " + y + " " + z + " = " + (x * y * z) +
                            ".   This is the expected result");
    }

    /**
     * A method for testing the limits of long and int primitives.
     */
    public void printQuotient() {
        System.out.println(y + "/" + x + " = " + (y/x) +
                            ".   This is not the expected result. " +
                            "Long and int cannot handle fractions");
    }
}

/**
 * A test drive class for lab two one a
 *
 * @author Clayton Mays
 */
class PrimitivesTestDrive {

    /**
     * Method that creates an instance of LabTwoOneA for testing purposes.
     * The main method of the class.
     *
     * @param args
     */
    public static void main(String[] args) {
        LabTwoOneA test = new LabTwoOneA();

        test.printProduct();
    }
}