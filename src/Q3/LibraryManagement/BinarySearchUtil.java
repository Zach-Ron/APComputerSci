package Q3.LibraryManagement;

import java.util.ArrayList;

public class BinarySearchUtil {

    public ArrayList sortByTitle(ArrayList<String> original)
    {
        ArrayList<String> copyOG = original;
        ArrayList sortedTitle = new ArrayList<String>();
        String current = original.get(0); //current is current largest string value
        String smallest = original.get(0);//smallest string val
        sortedTitle.add(current);
        while (sortedTitle.size() > original.size())
        {
             byte loop = 1;
            for (int lcv = 1; lcv < copyOG.size(); lcv++)
            {
                if (current.compareToIgnoreCase(copyOG.get(lcv)) == -loop)
                {
                    current = copyOG.get(lcv);
                    copyOG.remove(lcv);
                    sortedTitle.add(0, current);

                }
                else if (smallest.compareToIgnoreCase(copyOG.get(lcv)) == loop)
                {
                    smallest = copyOG.get(lcv);
                    copyOG.remove(lcv);
                    sortedTitle.add(smallest);
                    lcv--;
                }
            }
            loop++;
        }
        return sortedTitle;

    }


    public
    //Note: if .compareToIgnoreCase returns num < 0 then the parameter sent in comes first and vice versa.
    //Check for numbers of 1, -1, or 0.





    // TODO: complete sorting method based on alphabetical order of author names
    public ArrayList sortByAuthor(ArrayList<Book> original){
        ArrayList<Book> copyOG = original;
        ArrayList sortedAuthor = new ArrayList<String>();
        //String current = original.get(0);

        return sortedAuthor;
    }

}
