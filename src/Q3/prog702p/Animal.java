package Q3.prog702p;

public class Animal implements Names {

private String fn;
private String ln;
private String what;


    public Animal(String fName, String lName){
        fn = fName;
        ln = lName;
    }

    public String getWord(String word){return what;   }
    public String getName(){return fn + ln;}

}
