package main.java.model;

public class SleepingState extends PetState {

    public SleepingState(Pet pet) {
        super(pet);
    }

    @Override
    public void handle() {
        pet.setEnergy(pet.getEnergy() + 30);
        pet.setMood("Спит");
        System.out.println(pet.getName() + " спит и восстанавливает силы.");
    }

    @Override
    public void feed(Pet pet) {
        pet.setEnergy(pet.getEnergy() + 5);
        pet.setMood("Спит");
        System.out.println(pet.getName() + " немного поел, но продолжает спать.");
    }

    @Override
    public void play(Pet pet) {
        pet.setEnergy(pet.getEnergy() - 10);
        pet.setMood("Раздражен");
        System.out.println(pet.getName() + " не хочет играть, он спит.");
    }

    @Override
    public void sleep(Pet pet) {
        pet.setEnergy(pet.getEnergy() + 40);
        pet.setMood("Спит");
        System.out.println(pet.getName() + " спит и восстанавливает энергию.");
    }

    @Override
    public String getMood() {
        return "Спит";
    }
}
