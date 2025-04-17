package main.java.model;

public class TiredState extends PetState {

    public TiredState(Pet pet) {
        super(pet);
    }

    @Override
    public void handle() {
        pet.setEnergy(pet.getEnergy() - 10);
        pet.setMood("Устал");
        System.out.println(pet.getName() + " чувствует себя " + pet.getMood() + " после игры!");
    }

    @Override
    public void feed(Pet pet) {
        pet.setEnergy(pet.getEnergy() + 5);
        pet.setMood("Устал");
        System.out.println(pet.getName() + " продолжает чувствовать себя " + pet.getMood() + " после кормления!");
    }

    @Override
    public void play(Pet pet) {
        pet.setEnergy(pet.getEnergy() - 20);
        pet.setMood("Сильно устал");
        System.out.println(pet.getName() + " сильно устал от игры!");
    }

    @Override
    public void sleep(Pet pet) {
        pet.setEnergy(pet.getEnergy() + 50);
        pet.setMood("Отдохнувший");

        if (pet.getEnergy() >= 100) {
            pet.changeState(new HappyState(pet));
        }

        System.out.println(pet.getName() + " отдыхает и восстанавливает силы!");
    }

    @Override
    public String getMood() {
        return "Устал";
    }
}
