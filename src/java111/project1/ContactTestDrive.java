public class ContactTestDrive {
    public static void main(String[] args) {
        Contact firstContact = new Contact();
        Contact secondContact = new Contact();
        
        firstContact.setFirstName("Clayton");
        firstContact.setLastName("Mays");
        firstContact.setAddress("105 N Butler st., Madison, Wisconsin");
        firstContact.setPhone("6083731938");
        firstContact.setEmail("acmays@madisoncollege.edu");
        
        firstContact.display();

        secondContact.setFirstName("");
        secondContact.setLastName("Mays");
        secondContact.setAddress("105 N Butler st., Madison, Wisconsin");
        secondContact.setPhone("6083731938");
        secondContact.setEmail("acmays@madisoncollege.edu");

        secondContact.display();
    }
}
