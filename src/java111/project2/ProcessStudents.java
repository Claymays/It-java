import java.io.IOException;

/**
 * A container class meant to process multiple student objects at once
 *
 * @author Clayton Mays
 */
public class ProcessStudents {
    private Student[] students;

    // A method for calling the other instance methods
    public void runStudentProcessing() throws IOException {
        createStudents();
        displayStudents();
    }

    // Creates student objects to populate the students instance variable
    public void createStudents() throws IOException {
        students = new Student[3];
        Student john = new Student("John Doe", 0, 0, 0);
        Student mary = new Student("Mary Sue", 9337424, 50, 85);
        Student clay = new Student("Clayton Mays", 8542855, 5, 75);

        students[0] = john;
        students[1] = mary;
        students[2] = clay;
    }

    // Loops through the students instance variable array
    // Calls each student's display method to print their info to the terminal
    public void displayStudents() {
        for (Student student : students) {
            student.display();
        }
    }
}
