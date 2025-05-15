package Q3.VirtualPetLab;

public class Dog extends Pet {
    public Dog(String name) {
        super(name);
        super.setImage(ImageHelper.getRandomDogImg());
    }

    @Override
    public void feed() {
        // TODO: Implement feeding behavior for Dog
        super.setHunger((int) (super.getHunger() - ((Math.random() * 8) + 9)));
        super.setEnergy((int) (super.getEnergy() + ((Math.random() * 15) + 10)));
        super.setHappiness((int) (super.getHappiness() + ((Math.random() * 5) + 10)));
        super.clampAttributes();
    }

    @Override
    public void play() {
        // TODO: Implement playing behavior for Dog
        super.setEnergy((int) (super.getEnergy() - ((Math.random() * 10) + 5)));
        super.setHunger((int) (super.getHunger() + ((Math.random() * 7) + 5)));
        super.setHappiness((int) (super.getHappiness() + ((Math.random() * 5) + 10)));
        super.clampAttributes();
    }

    @Override
    public void sleep() {
        // TODO: Implement sleeping behavior for Dog
        super.setEnergy((int) (super.getEnergy() + ((Math.random() * 10) + 5)));
        super.setHunger((int) (super.getHunger() + ((Math.random() * 7) + 5)));
        super.setHappiness((int) (super.getHappiness() + ((Math.random() * 5) + 10)));
        super.clampAttributes();
    }
}
