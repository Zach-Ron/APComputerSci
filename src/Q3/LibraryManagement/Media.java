package Q3.LibraryManagement;

public abstract class Media {
    private String title;
    private String isbn;
    private boolean isCheckedOut;

    // TODO: Implement constructor (title, isbn)
    public Media(String t, String nbsi)
    {
        title = t;
        isbn = nbsi;
    }

    // TODO: Implement getter methods
    public void setCheckedOut(boolean checkedOut) { isCheckedOut = checkedOut; }
}
