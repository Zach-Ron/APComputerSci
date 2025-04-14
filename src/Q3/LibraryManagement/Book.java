package Q3.LibraryManagement;

public class Book extends Media{
    private String author;

    // TODO: Implement constructor (title, isbn, author); call super constructor
    public Book(String t, String nbsi, String aut)
    {
        super(t, nbsi);
        author = aut;
    }

    public String getAuthor() { return author; }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + getTitle() + '\'' +
                ", isbn='" + getIsbn() + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
