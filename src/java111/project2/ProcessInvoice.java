/**
 * A processing class for the invoice object
 *
 * @author Clayton Mays
 */
public class ProcessInvoice {
    private Invoice invoice;

    // Creates item objects to populate the invoice object
    private void createItems() {
        Item[] items = new Item[3];
        Item widget = new Item(123, 2, 9.99, "widgets");
        Item doodads = new Item(4444, 1, 15.46, "doodads");
        Item thingies = new Item(99, 20, 2.00, "thingies");

        items[0] = widget;
        items[1] = doodads;
        items[2] = thingies;

        invoice.setItems(items);
    }

    // Instantiates the instance variable 'invoice'
    // Calls createItems class method to populate the 'invoice' variable
    // Calls the class methods of the invoice object to print its information
    public void runProcess() {
        this.invoice = new Invoice();

        createItems();

        invoice.calculateInvoice();
        invoice.displayInvoice();
    }
}
