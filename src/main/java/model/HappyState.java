package main.java.model;


public class HappyState extends PetState {

    public HappyState(Pet pet) {
        super(pet);
    }

    @Override
    public void handle() {
        pet.setEnergy(pet.getEnergy() + 20);  // Питомец восстанавливает энергию
        pet.setMood("Счастлив");               // Питомец чувствует себя счастливым
        System.out.println(pet.getName() + " счастлив и полон энергии!");
    }

    @Override
    public void feed(Pet pet) {
        pet.setEnergy(pet.getEnergy() + 10);  // Питомец восстанавливает немного энергии
        pet.setMood("Счастлив");
        System.out.println(pet.getName() + " снова счастлив и полон сил!");
    }

    @Override
    public void play(Pet pet) {
        pet.setEnergy(pet.getEnergy() - 10);  // Питомец тратит энергию
        pet.setMood("Веселый");
        System.out.println(pet.getName() + " веселится и играет!");
    }

    @Override
    public void sleep(Pet pet) {
        pet.setEnergy(pet.getEnergy() + 30);  // Питомец восстанавливает много энергии
        pet.setMood("Счастлив");
        System.out.println(pet.getName() + " отдыхает и восстанавливает силы!");
    }
}
