import java.io.IOException;

/**
 * A class used to represent a student as a Java object
 *
 * @author Clayton Mays
 */
public class Student {
    private String name;
    private int id;
    private int creditedHours;
    private int grade;

    // An empty constructor for the class object
    public Student() {}

    /** A fully qualified constructor for the class object
     *
     * @param name Value for the name variable. Throws IOexception if empty
     * @param id Value for the id  instance variable
     * @param creditedHours Value for the creditedHours instance variable
     * @param grade Value for the grade instance variable
     * @throws IOException No default values are available for student names
     *
     */
    public Student(String name, int id, int creditedHours, int grade)
        throws IOException {
        if (name == null || name.equals("")) {
            throw new IOException("Student's name found to be empty!");
        }
        this.name = name;

        this.id = id == 0 ? 9999999 : id;

        this.creditedHours = creditedHours == 0 ? 36 : creditedHours;

        this.grade = grade == 0 ? 100 : grade;
    }

    // A method for accessing the private instance variable name
    public String getName() {
        return name;
    }

    /**
     * A method for setting the value of the instance variable name
     * @param name New value to be use for the instance variable name
     */
    public void setName(String name) {
        this.name = name;
    }

    // A method for accessing the private instance variable id
    public int getId() {
        return id;
    }

    /**
     * A method for setting the value of the instance variable id
     * @param id New value to be use for the instance variable id
     */
    public void setId(int id) {
        this.id = id;
    }

    // A method for accessing the private instance variable creditedHours
    public int getCreditedHours() {
        return creditedHours;
    }

    /**
     * A method for setting the value of the instance variable name
     * @param creditedHours:
     *              New value to be use for the instance variable creditedHours
     */
    public void setCreditedHours(int creditedHours) {
        this.creditedHours = creditedHours;
    }

    // A method for accessing the private instance variable grade
    public int getGrade() {
        return grade;
    }

    /**
     * A method for setting the value of the instance variable grade
     * @param grade New value to be use for the instance variable grade
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    // A method used to calculate a students grade point average
    public double gradePointAverage() {
        return (double) getGrade() / getCreditedHours();
    }

    // A method for formatting all the object's instance variables for printing
    public void display() {
        System.out.printf("Student %s with id of %d, has %d credit hours\n" +
                        "\t and %d grade points, resulting in a gpa of %f\n\n",
                        name, id, creditedHours, grade, gradePointAverage());
    }
}
