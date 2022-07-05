/**
 * A test driver class for the contact object.
 *
 * @author Clayton Mays
 */
public class ContactTestDrive {
    /** Creates two contact objects, sets their variables, and displays.
     *
     * @param args
     */
    public static void main(String[] args) {
        Contact firstContact = new Contact();
        Contact secondContact = new Contact();
        
        firstContact.setFirstName("Clayton");
        firstContact.setLastName("Mays");
        firstContact.setAddress("105 N Butler st., Madison, Wisconsin");
        firstContact.setPhone("6083731938");
        firstContact.setEmail("acmays@madisoncollege.edu");
        
        firstContact.display();

        secondContact.setFirstName("Joseph");
        secondContact.setLastName("Biden");
        secondContact.setAddress("1600 Pennsylvania Avenue NW, Washington, DC 20500");
        secondContact.setPhone("202-456-1111");
        secondContact.setEmail("president@whitehouse.gov");

        secondContact.display();
    }
}
