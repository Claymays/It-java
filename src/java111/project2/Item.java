/**
 * An object meant to represent an item sold at retail
 *
 * @author Clayton Mays
 */
public class Item {
    private int id;
    private int quantity;
    private double price;
    private String description;

    // An empty class constructor
    public Item() {}

    /**
     * A fully qualified constructor
     * @param id Value used to instantiate the instance variable "id"
     * @param quantity Value used to instantiate the instance variable "quantity"
     * @param price Value used to instantiate the instance variable "price"
     * @param description:
     *            Value used to instantiate the instance variable "description"
     */
    public Item(int id, int quantity, double price, String description) {
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.description = description;
    }

    // A method for accessing the private instance variable 'id'
    public int getId() {
        return id;
    }

    /**
     * A method for setting the value of the instance variable 'id'
     * @param id New value to be use for the instance variable 'id'
     */
    public void setId(int id) {
        this.id = id;
    }

    // A method for accessing the private instance variable 'quantity'
    public int getQuantity() {
        return quantity;
    }

    /**
     * A method for setting the value of the instance variable 'quantity'
     * @param quantity New value to be use for the instance variable 'quantity'
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // A method for accessing the private instance variable 'price'
    public double getPrice() {
        return price;
    }

    /**
     * A method for setting the value of the instance variable 'price'
     * @param price New value to be use for the instance variable 'price'
     */
    public void setPrice(double price) {
        this.price = price;
    }

    // A method for accessing the private instance variable 'description'
    public String getDescription() {
        return description;
    }

    /**
     * A method for setting the value of the instance variable 'description'
     * @param description New value to be use for the instance variable 'description'
     */
    public void setDescription(String description) {
        this.description = description;
    }

    // Returns the sum of quantity multiplied by the price
    public double calculateItemTotal() {
        return getQuantity() * getPrice();
    }

    // A method for formatting all the object's instance variables for printing
    public String display() {
        return String.format("Item ID: %d, Quantity: %d, Price: $%.2f," +
                            " Description: %s, Total Cost: %.2f",
                            getId(), getQuantity(), getPrice(),
                            getDescription(), calculateItemTotal());
    }
}
