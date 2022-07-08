package labs;

/**
 * A class for demonstrating ways to access an instance's variables
 *
 * @author Clayton Mays
 */
public class LabFiveVariables {
    private int count = 1;

    // A method for accessing the instance variable 'count'
    public int getCount() {
        return count;
    }

    /**
     * A method for setting the value of the instance variable 'count'
     * @param count New value to be use for the instance variable 'count'
     */
    public void setCount(int count) {
        this.count = count;
    }

    // Demonstrates multiple ways of accessing the instance variable 'count'
    public void run() {
        int count = 15;

        System.out.printf("The local variable named count is: %d\n", count);

        System.out.printf("The instance variable named count is: %d " +
                "(printed with the 'this.' method)\n",
                this.count);

        System.out.printf("The instance variable named count is: %d " +
                "(printed with the 'getCount() method')\n",
                getCount());
    }
}
