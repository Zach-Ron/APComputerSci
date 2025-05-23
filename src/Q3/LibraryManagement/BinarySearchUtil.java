package Q3.LibraryManagement;

import java.util.ArrayList;

public class BinarySearchUtil {

    private ArrayList<Book> sortedTitle = new ArrayList<>();
    private ArrayList <Book> classOG;

    public BinarySearchUtil(ArrayList<Book> original){
        classOG = original;
    }

    public ArrayList<Book> sortByTitle()
    {
        ArrayList <Book> copyOG = classOG;
        String current = classOG.get(0).getTitle(); //current is current largest string value
        String smallest = classOG.get(0).getTitle();//smallest string value
        sortedTitle.add(classOG.get(0));
        while (sortedTitle.size() > classOG.size())
        {
             byte loop = 1;
            for (int lcv = 1; lcv < copyOG.size(); lcv++)
            {
                if (current.compareToIgnoreCase(copyOG.get(lcv).getTitle()) == -loop)
                {
                    current = copyOG.get(lcv).getTitle();
                    sortedTitle.add(0, copyOG.get(lcv));
                    copyOG.remove(lcv);

                }
                else if (smallest.compareToIgnoreCase(copyOG.get(lcv).getTitle()) == loop)
                {
                    smallest = copyOG.get(lcv).getTitle();
                    sortedTitle.add(copyOG.get(lcv));
                    copyOG.remove(lcv);
                    lcv--;
                }
            }
            loop++;
        }
        return sortedTitle;

    }


    public String searchByName(String searched, ArrayList<String> bookList)
    {
        int loc = 0;
        int difference = Integer.MAX_VALUE;
        String title = "";
        for (int i = 0; i < bookList.size(); i++) {
            if (Math.abs(bookList.get(i).compareToIgnoreCase(searched)) < difference) {
                difference = Math.abs(bookList.get(i).compareToIgnoreCase(searched));
                loc = i;
            }
        }
        title = bookList.get(loc);
        return title;
    }
    //Note: if .compareToIgnoreCase returns num < 0 then the parameter sent in comes first and vice versa.
    //Check for numbers of 1, -1, or 0.





    // TODO: complete sorting method based on alphabetical order of author names
    public ArrayList sortByAuthor(ArrayList<Book> original){
        ArrayList<Book> copyOG = original;
        ArrayList sortedAuthor = new ArrayList<String>();
        //String current = original.get(0);

        return sortedAuthor;
    }


    public String searchByAuthor()
    {
        return "";
    }
}
