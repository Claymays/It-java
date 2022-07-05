package labs;

/**
 * A class for representing an employee as a java object.
 *
 * @author Clayton Mays
 */
public class Employee {
    private String firstName;
    private String lastName;
    private int id;
    private double salary;

    // A method that returns the private instance variable firstName
    public String getFirstName() {
        return firstName;
    }

    // Method for setting the value of the private instance variable firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // A method that returns the private instance variable lastName
    public String getLastName() {
        return lastName;
    }

    // Method for setting the value of the private instance variable lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // A method that returns the private instance variable id
    public int getId() {
        return id;
    }

    // Method for setting the value of the private instance variable id
    public void setId(int id) {
        this.id = id;
    }

    // A method that returns the private instance variable salary
    public double getSalary() {
        return salary;
    }

    // Method for setting the value of the private instance variable salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // prints a formatted snippet about the employee instance
    public void display() {
        System.out.format(
                "%s %s has employee id number %d, and earns $%s per year\n",
                getFirstName(), getLastName(), getId(), String.format("%,.2f", getSalary()));
    }
}

/**
 * A testing class for the Employee object
 *
 * @author Clayton Mays
 */
class EmployeeTestDrive {
    // a method that instantiates three separate Employee objects,
    // and prints their information.
    public static void main(String[] args) {
        Employee janice = new Employee();
        Employee ted = new Employee();
        Employee monica = new Employee();

        janice.setFirstName("Janice");
        janice.setLastName("Smith");
        janice.setId(8542);
        janice.setSalary(54000);
        janice.display();

        ted.setFirstName("Ted");
        ted.setLastName("Wagner");
        ted.setId(4290);
        ted.setSalary(46000);
        ted.display();

        monica.setFirstName("Monica");
        monica.setLastName("Mohr");
        monica.setId(368);
        monica.setSalary(98000);
        monica.display();
    }
}
