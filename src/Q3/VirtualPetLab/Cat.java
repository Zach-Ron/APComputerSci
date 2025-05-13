package Q3.VirtualPetLab;

public class Cat extends Pet {
    public Cat(String name) {
        super(name);
        super.setImage(ImageHelper.getRandomCatImg());
    }

    @Override
    public void feed() {
        // TODO: Implement feeding behavior for Cat
        super.setHunger((int) (super.getHunger() - ((Math.random() * 8) + 9)));
        super.setEnergy((int) (super.getEnergy() + ((Math.random() * 15) + 10)));
        super.setHappiness((int) (super.getHappiness() + ((Math.random() * 5) + 10)));
        super.clampAttributes();
    }

    @Override
    public void play() {
        // TODO: Implement playing behavior for Cat
        super.setEnergy((int) (super.getEnergy() - ((Math.random() * 10) + 5)));
        super.setHunger((int) (super.getHunger() + ((Math.random() * 7) + 5)));
        super.setHappiness((int) (super.getHappiness() + ((Math.random() * 5) + 10)));
        super.clampAttributes();
    }

    @Override
    public void sleep() {
        // TODO: Implement sleeping behavior for Cat
        super.setEnergy((int) (super.getEnergy() + ((Math.random() * 10) + 5)));
        super.setHunger((int) (super.getHunger() + ((Math.random() * 7) + 5)));
        super.setHappiness((int) (super.getHappiness() + ((Math.random() * 5) + 10)));
        super.clampAttributes();
    }
}
