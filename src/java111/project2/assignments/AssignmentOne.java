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
