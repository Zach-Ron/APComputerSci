package Q3.LibraryManagement;

import java.util.ArrayList;

public class BinarySearchUtil {
    // TODO: Implement binary search method (takes in ArrayList) using recursion for searching books by title
    //  (required) or author
    public ArrayList sortByTitle(ArrayList<String> original)
    {
        ArrayList<String> OG = original;
        ArrayList sortedTitle = new ArrayList<String>();
        String current = original.get(0);
        while (sortedTitle.size() > original.size())
        {
            for (int lcv = 1; lcv < OG.size(); lcv++)
            {
                lcv--;
                if (current.compareToIgnoreCase(OG.get(lcv)) >= 0)
                current = OG.get(lcv);
                OG.remove(lcv);
                sortedTitle.add(0, current);
            }
        }
        return sortedTitle;
    }


}
