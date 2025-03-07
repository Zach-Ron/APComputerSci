package Q3.prog505t;

public class math {
    private static int cornNeeded = 0;
    private static int hayNeeded = 0;
    private static int cornNeededCows = 0;
    private static int hayNeededCows = 0;
    private static int cornNeededHorses = 0;
    private static int hayNeededHorses = 0;

    public static void findTotCorn(int var){
        cornNeeded += var;
    }

    public static void findTotHay(int var){
        hayNeeded += var;
    }

    public static int getTotHay(){
        return hayNeeded;
    }

    public static int getTotCorn(){
        return cornNeeded;
    }

    public static void findCowCorn(int var){
        cornNeededCows += var;
    }

    public static void findCowHay(int var){
        hayNeededCows += var;
    }
    public static int getCowHay(){
        return hayNeededCows;
    }

    public static int getCowCorn(){
        return cornNeededCows;
    }

    public static void findHorsesCorn(int var){
        cornNeededHorses += var;
    }

    public static void findHorsesHay(int var){
        hayNeededCows += var;
    }
    public static int getHorsesHay(){
        return hayNeededHorses;
    }

    public static int getHorsesCorn(){
        return cornNeededHorses;
    }
}
