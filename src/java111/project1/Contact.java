/**
 * A blueprint for a contact card object.
 *
 * @author Clayton Mays
 */
public class Contact {
    private String firstName;
    private String lastName;
    private String address;
    private String phone;
    private String email;

    // A method that prints all instance variables to the terminal window.
    public void display() {
        System.out.println(firstName + " " + lastName);
        System.out.println(address);
        System.out.println(phone);
        System.out.println(email);
    }

    // An empty constructor.
    public Contact() {}

    // A fully qualified constructor.
    public Contact(String firstName, String lastName, String address, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    // A getter method for retrieving the instance variable firstName.
    public String getFirstName() {
        return firstName;
    }

    // A setter method for setting the instance variable firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // A getter method for retrieving the instance variable lastName
    public String getLastName() {
        return lastName;
    }

    // A setter method for setting the instance variable lastname
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // A getter method for retrieving the instance variable address
    public String getAddress() {
        return address;
    }

    // A setter method for setting the instance variable phone
    public void setAddress(String address) {
        this.address = address;
    }

    // A getter method for retrieving the instance variable phone
    public String getPhone() {
        return phone;
    }

    // A setter method for setting the instance variable phone
    public void setPhone(String phone) {
        this.phone = phone;
    }

    // A getter method for retrieving the instance variable email
    public String getEmail() {
        return email;
    }

    // A setter method for setting the instance variable email
    public void setEmail(String email) {
        this.email = email;
    }
}
