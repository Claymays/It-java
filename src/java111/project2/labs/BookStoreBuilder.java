package labs;

/** This class creates a bookstore and then fills it with books.
 *  It will be used to emphasize
 *  Unit 2 concepts and help you prepare
 *  for Project 2.
 *  @author Clayton Mays
 */

public class BookStoreBuilder {
    private BookStore bookStore;

    /**
     * Creates a local Book array, and fills it with predetermined book objects.
     * Then sets the variable bookStore's array using the created local array.
     */
    public void createBooks() {
        Book[] tempBooks = new Book[4];
        Book mobyDick = new Book();
        Book frankenstein = new Book();
        Book prideAndPrejudice = new Book();
        Book theWretchedOfTheEarth = new Book();

        mobyDick.setAuthor("Herman Melville");
        mobyDick.setTitle("Moby Dick");
        mobyDick.setPublicationYear(1851);
        mobyDick.setNumberOfCopies(210);
        mobyDick.setSize(7.21);

        frankenstein.setAuthor("Mary Shelley");
        frankenstein.setTitle("Frankenstein");
        frankenstein.setPublicationYear(1818);
        frankenstein.setNumberOfCopies(25);
        frankenstein.setSize(4.97);

        prideAndPrejudice.setAuthor("Jane Austen");
        prideAndPrejudice.setTitle("Pride and Prejudice");
        prideAndPrejudice.setPublicationYear(1813);
        prideAndPrejudice.setNumberOfCopies(548);
        prideAndPrejudice.setSize(9.13);

        theWretchedOfTheEarth.setAuthor("Frantz Fanon");
        theWretchedOfTheEarth.setTitle("The Wretched of the Earth");
        theWretchedOfTheEarth.setPublicationYear(1961);
        theWretchedOfTheEarth.setNumberOfCopies(9);
        theWretchedOfTheEarth.setSize(2.46);

        tempBooks[0] = mobyDick;
        tempBooks[1] = frankenstein;
        tempBooks[2] = prideAndPrejudice;
        tempBooks[3] = theWretchedOfTheEarth;

        bookStore.setBooks(tempBooks);
    }

    /**
     * Instantiates the instance variable bookStore
     * Populates the array of books inside the bookStore variable
     * Prints to the terminal window the total space taken up by Books in array
     * Calls the display method for each book in the bookStore array
     */
     public void run() {
         this.bookStore = new BookStore();

         createBooks();

         System.out.printf("Total space allotted for collection: %.2f\n\n",
                            bookStore.totalBooksWidth());

         bookStore.displayBooks();
     }
}
