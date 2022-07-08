/**
 * A container class meant to process multiple Item objects at once
 *
 * @author Clayton Mays
 */
public class Invoice {
    private Item[] items;
    private double invoiceTotal = 0.0;

    // An empty constructor for the class
    public Invoice() {}

    /**
     * A fully qualified constructor for the class
     * @param items Array of Item to instantiate the instance variable items
     * @param invoiceTotal Initial value for instance variable invoiceTotal
     */
    public Invoice(Item[] items, double invoiceTotal) {
        this.items = items;
        this.invoiceTotal = invoiceTotal;
    }

    // A method for accessing the private instance variable items
    public Item[] getItems() {
        return items;
    }

    /**
     * A method for setting the value of the instance variable 'items'
     * @param items New value to be use for the instance variable 'items'
     */
    public void setItems(Item[] items) {
        this.items = items;
    }

    // A method for accessing the private instance variable invoiceTotal
    public double getInvoiceTotal() {
        return invoiceTotal;
    }

    /**
     * A method for setting the value of the instance variable 'invoiceTotal'
     * @param invoiceTotal New value to be use for the instance variable 'invoiceTotal'
     */
    public void setInvoiceTotal(double invoiceTotal) {
        this.invoiceTotal = invoiceTotal;
    }

    // Loops through the items array, and calculates the product of each item
    // Sets the value of invoiceTotal to the sum of all items
    public void calculateInvoice() {
        for (Item item : items) {
            this.invoiceTotal += item.calculateItemTotal();
        }
    }

    // A method for formatting all the object's instance variables for printing
    public void displayInvoice() {
        for (Item item : items) {
            System.out.printf("%s \n\n", item.display());
        }
        System.out.printf("Invoice Total: $%.2f", getInvoiceTotal());
    }
}
