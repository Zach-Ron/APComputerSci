package Q3.LibraryManagement;

    import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

    public class Library implements LibrarySystem {
        private ArrayList<Book> books;
        private ArrayList<Patron> patrons;
        private ArrayList<Transaction> transactions;
        private BinarySearchUtil sorts;

        // TODO: Implement the constructor

        public Library(ArrayList<Book> catalog){
            books = catalog;
            sorts = new BinarySearchUtil(books);
        }

        // Implement interface methods
        @Override
        public void addBook(Book book)
        {
            books.add(book);
            sorts = new BinarySearchUtil(books);
            sorts.sortByTitle();
        }

        @Override
        public void removeBook(String isbn)
        {
            for (int i = 0; i < books.size(); i++)
                if (books.get(i).getIsbn().equals(isbn)){
                    books.remove(i);
                    sorts = new BinarySearchUtil(books);
                    sorts.sortByTitle();
                    break;
                }
        }
        // Other methods...

        @Override
        public void viewMostRecentTransaction(String isbn) {
            // Hint: Use a backward loop to find the most recent transaction
            // If no transaction is found, print "No transactions found for ISBN: <isbn>"
        }

        @Override
        public boolean checkoutBook(String isbn, String patronId) {
            return false;
        }

        @Override
        public boolean checkinBook(String isbn, String patronId) {
            return false;
        }

        // TODO: Complete the implementation of LibrarySystem methods
        // TODO: Implement searchBookByTitle and searchBookByAuthor using binary search

        @Override
        public Book findClosestBook(String title) {
            // TODO: Search for the closest book title using .toLowerCase() and .contains(); return the closest book or null
      return null;
        }

        @Override
        public Book searchBookByTitle(String title) {
            Book closest = null;
            // TODO: Binary search for book; if not found, return the closest book
            return closest;
        }

        @Override
        public Book searchBookByAuthor(String author) {
            return null;
        }

        public void addPatron(Patron l)
        {
            return;
        }

        public void removePatron(String name)
        {
            return;
        }

        public void createTransaction(String a, String g, String h)
        {
            return;
        }

        @Override
        public void updateTransaction(String isbn, String patronId, String returnDate) {

        }

        // You might want to add some helper methods here like getBookByIsbn, getPatronById, etc.

        /* ========== DO NOT MODIFY ========== */
        public static String getDateToday() {
            return Instant.now().atZone(ZoneOffset.UTC).format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
}
