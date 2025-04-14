package Q3.LibraryManagement;

import java.util.ArrayList;

public class Patron {
    private String name;
    private String patronId;
    private ArrayList<Book> checkedOutBooks;

    // TODO: Implement constructor (name, patronId)
    public Patron(String someName, String someID)
    {
        name = someName;
        patronId = someID;
    }

    // Basic getters
    public String getName() { return name; }
    public String getPatronId() { return patronId; }

    // TODO: Implement checkInBook(Book book) and checkOutBook(Book book) methods (remove/add book from checkedOutBooks)
    // Don't forget to set the book's checkedOut field to true/false

    public void checkInBook(Book book)
    {
        for (int i = 0; i < checkedOutBooks.size(); i++)
        {
            if (checkedOutBooks.get(i).equals(book))
                checkedOutBooks.remove(i);
        }
        book.setCheckedOut(false);
    }

    public void checkOutBook(Book book)
    {
        checkedOutBooks.add(book);
        book.setCheckedOut(true);
    }
}
