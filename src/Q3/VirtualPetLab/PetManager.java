package Q3.VirtualPetLab;
import java.util.ArrayList;

public class PetManager {
    private ArrayList<Pet> pets = new ArrayList<>();

    public void addPet(Pet pet) {pets.add(pet);}

    public void removePet(Pet pet)
    {
        for (int i = 0; i < pets.size(); i++)
        {
            if (pets.get(i).equals(pet))
            {
                pets.remove(i);
            }
        }
    }

    public ArrayList<Pet> getPets()
    {
        return pets;
    }
    public ArrayList<String> getPetsNames()
    {
        ArrayList<String> petNameList = new ArrayList<>();
        for (int i = 0; i < pets.size(); i++){
            petNameList.add(pets.get(i).getName());
        }

        return petNameList;
    }

}
