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