package labs;

/** This class represents a bookstore.
 *  It will be used to emphasize
 *  Unit 2 concepts and help you prepare
 *  for Project 2.
 *  @author Clayton Mays
 */

public class BookStore {

    private Book[] books;

    /**
     * A method for setting the array of Books, books
     *
     * @param books Array of Book to be set for the variable books.
     */
    public void setBooks(Book[] books) {
        this.books = books;
    }

    /**
     * Loops through the variable books.
     * Each book in the array has its calculation method called,
     * and added together for the total size of the array.
     *
     * @return A double representing the total width of the collection of books
     */
    public double totalBooksWidth() {
        double result = 0.0;
        for (Book book : books) {
            result += book.calculateTotalSize();
        }
        return result;
    }

    /**
     * Loops through the variable books.
     * Each book in the array has its display method called,
     * printing to the terminal window information on each book in the array.
     */
    public void displayBooks() {
        for (Book book : books) {
            System.out.print(book.display());
        }
    }
}
