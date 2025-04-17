package main.java.model;


public class SickState extends PetState {

    public SickState(Pet pet) {
        super(pet);
    }

    @Override
    public void handle() {
        pet.setEnergy(pet.getEnergy() - 5);
        pet.setMood("Болен");
        System.out.println(pet.getName() + " чувствует себя " + pet.getMood() + " и теряет немного энергии.");
    }

    @Override
    public void feed(Pet pet) {
        pet.setEnergy(pet.getEnergy() + 10);
        pet.setMood("Чувствует себя лучше");
        System.out.println(pet.getName() + " чувствует себя лучше после еды!");
    }

    @Override
    public void play(Pet pet) {
        pet.setEnergy(pet.getEnergy() - 15);
        pet.setMood("Болен");
        System.out.println(pet.getName() + " не может играть, потому что болен.");
    }

    @Override
    public void sleep(Pet pet) {
        pet.setEnergy(pet.getEnergy() + 10);
        pet.setMood("Болен");
        System.out.println(pet.getName() + " отдыхает, но все еще чувствует себя больным.");
    }

    @Override
    public String getMood() {
        return "Болен";
    }
}
