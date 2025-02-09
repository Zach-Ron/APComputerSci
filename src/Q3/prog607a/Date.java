package Q3.prog607a;

public class Date{
    private String myDate;
    private String[] parts;


public Date()
{
    myDate = "0/0/0";
}

public Date(String date)
{
    myDate = date;
    parts = date.split("/");
}




    public static void printMenu(){
        System.out.println();
        System.out.println("0) Exit: ");
        System.out.println("1) Encode: ");
        System.out.println("2) Decode: ");
        System.out.println("Choose an option: ");
}



    public String encode(){
        String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String encodedDate = "";
        int num = Integer.parseInt(parts[0]);
        if (num <= 12) {
            encodedDate += alphabet[num - 1];
        } else {
            encodedDate += " /";
        }
        num = Integer.parseInt(parts[1]);
        if (num < 32){
            
        }

            

        return encodedDate.toString();
    }




}
