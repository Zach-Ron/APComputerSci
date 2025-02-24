package Q3.prog505w;

import Q3.prog702p.Animal;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class farm {
    public static void main(String[] args) {
        try{
            Scanner file = new Scanner(new File("Langdat/FILENAME"));
            List<Animal> animals = new ArrayList<>();

            //TODO: read in animals;

        } catch(IOException e)
        {
            System.out.println("Error: " + e);
        }
    }
}
