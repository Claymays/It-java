package labs;

/**
 * A class for collecting employee objects into a single object
 * Has different methods for displaying the employees.
 *
 * @author Clayton
 */
public class EmployeeFactory {
    Employee[] employees;

    // Instantiate the employees array
    public void setup() {
        employees = new Employee[3];
        employees[0] = new Employee();
        employees[1] = new Employee();
        employees[2] = new Employee();

        employees[0].setFirstName("employees[0]");
        employees[0].setLastName("Smith");
        employees[0].setId(8542);
        employees[0].setSalary(54000);

        employees[1].setFirstName("employees[1]");
        employees[1].setLastName("Wagner");
        employees[1].setId(4290);
        employees[1].setSalary(46000);

        employees[2].setFirstName("employees[2]");
        employees[2].setLastName("Mohr");
        employees[2].setId(368);
        employees[2].setSalary(98000);
    }

    // displays each object in the employees array with a while loop
    public void runWhile() {
        int counter = 0;

        System.out.println("Displaying employees using a while loop:\n");

        while (counter < 3) {
            employees[counter].display();
            counter++;
        }
        System.out.println();
    }

    // displays each object in the employees array with a for loop
    public void runFor() {
        System.out.println("Displaying employees using a for loop:\n");

        for (Employee employee : employees) {
            employee.display();
        }
        System.out.println();
    }
}
