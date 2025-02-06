package Q3.prog701g;

public class admin extends person{
    private String myFavw;

    public admin(String fn, String ln, String fav){
        super(fn, ln);
        myFavw = fav;
    }
    public String getFavw() { return myFavw; }
}
