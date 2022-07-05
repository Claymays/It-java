package assignments;

/**
 * A blueprint for representing a fruit object
 *
 * @author Clayton Mays
 */
public class Fruit {
    private String name;
    private int quantity;

    // A method that returns the instance variable name.
    public String getName() {
        return name;
    }

    // A method for setting the instance variable name
    public void setName(String name) {
        this.name = name;
    }
    // A method that returns the instance variable quantity
    public int getQuantity() {
        return quantity;
    }

    // A method for setting the instance variable quantity.
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
