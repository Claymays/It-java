package labs;
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
