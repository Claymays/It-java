import java.io.IOException;

/**
 * A class for test running the ProcessStudent class
 *
 * @author Clayton Mays
 */
public class StudentTestDrive {
    /**
     * Instantiates a ProcessStudents object, and calls its run method
     * @param args Command line arguments
     * @throws IOException Throws exception if given student name is blank
     */
    public static void main(String[] args) throws IOException {
        ProcessStudents students = new ProcessStudents();

        students.runStudentProcessing();
    }
}
