package Q3.LibraryManagement;

import java.util.ArrayList;

public class BinarySearchUtil {

    public ArrayList sortByTitle(ArrayList<String> original)
    {
        ArrayList<String> copyOG = original;
        ArrayList sortedTitle = new ArrayList<String>();
        String current = original.get(0); //current is current largest string value
        sortedTitle.add(current);
        while (sortedTitle.size() > original.size())
        {
             byte loop = 0;
            for (int lcv = 1; lcv < copyOG.size(); lcv++)
            {
                if (current.compareToIgnoreCase(copyOG.get(lcv)) == -1 && current.compareToIgnoreCase(copyOG.get(lcv)) !=)
                {
                    current = copyOG.get(lcv);
                    copyOG.remove(lcv);
                    sortedTitle.add(0, current);
                    lcv--;
                }
                else if (loop > 0 && current.compareToIgnoreCase(copyOG.get(lcv)) == 1)
                {

                }
            }
            loop++;
        }
        return sortedTitle;
    }
    //Note: if .compareToIgnoreCase returns num < 0 then the parameter sent in comes first and vice versa.
    //Check for numbers of 1, -1, or 0.





    // TODO: complete sorting method based on alphabetical order of author names
    public ArrayList sortByAuthor(ArrayList<String> original){
        ArrayList<String> copyOG = original;
        ArrayList sortedAuthor = new ArrayList<String>();
        String current = original.get(0);

        return sortedAuthor;
    }

}
