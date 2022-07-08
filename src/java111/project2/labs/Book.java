package labs;

/** Represents a book.
 *  Used emphasize Unit 2 concepts and help you prepare
 *  for Project 2.
 *  @author Clayton Mays
 */
public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private int numberOfCopies;
    private double size;

    /**
     * A method for accessing the instance variable size.
     *
     * @return the value of size.
     */
    public double getSize() {
        return size;
    }

    /**
     * A method for setting the value of the instance variable size.
     *
     * @param size the value to be used for the variable size.
     */
    public void setSize(double size) {
        this.size = size;
    }

    /**
     * A method for accessing the instance variable title.
     *
     * @return The value of title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * A method for setting the value of the instance variable title.
     *
     * @param title the value to be used for the variable title.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * A method for accessing the instance variable author.
     *
     * @return The value of author.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * A method for setting the value of the instance variable author.
     *
     * @param author the value to be used for the variable author.
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * A method for accessing the instance variable publicationYear.
     *
     * @return the value of publicationYear
     */
    public int getPublicationYear() {
        return publicationYear;
    }

    /**
     * A method for setting the value of the instance variable publicationYear
     *
     * @param publicationYear Value to be used for the variable publicationYear
     */
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    /**
     * A method for accessing the instance variable numberOfCopies.
     *
     * @return The value of numberOfCopies.
     */
    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    /**
     * A method for setting the value of the instance variable numberOfCopies.
     *
     * @param numberOfCopies Value to be used for the variable numberOfCopies.
     */
    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    /**
     * A method used to calculate the total space of a collection of books
     * @return
     */
    public double calculateTotalSize() {
        return getNumberOfCopies() * getSize();
    }

    /**
     * A method for displaying each attribute of a book object.
     *
     * @return A formatted string containing details of the book object.
     */
    public String display() {
        return String.format("Title: %s \nAuthor: %s \nPublication Year: %s " +
                    "Number of Copies: %d \nSize of Book in centimeters: %f \n" +
                        "Total space taken up by copies of %s: %.2f \n\n",
                    getTitle(), getAuthor(), getPublicationYear(),
                    getNumberOfCopies(), getSize(), getTitle(), calculateTotalSize());
    }
}
