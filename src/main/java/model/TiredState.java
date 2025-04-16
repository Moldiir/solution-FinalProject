package main.java.model;

public class TiredState implements PetState {
    @Override
    public void feed(Pet pet) {
        pet.setEnergy(pet.getEnergy() + 5);  // Restores a little energy
        pet.setMood("Устал");  // Pet remains tired
        System.out.println(pet.getName() + " чувствует себя " + pet.getMood() + " после кормления!");
    }

    @Override
    public void play(Pet pet) {
        pet.setEnergy(pet.getEnergy() - 20);  // Playing decreases energy
        pet.setMood("Сильно устал");  // Pet becomes even more tired
        System.out.println(pet.getName() + " совсем устал от игры!");
    }

    @Override
    public void sleep(Pet pet) {
        pet.setEnergy(pet.getEnergy() + 50);  // Sleeping restores energy
        pet.setMood("Отдохнувший");  // Pet feels more rested

        // If energy reaches max, transition to HappyState
        if (pet.getEnergy() >= 100) {
            pet.setState(new HappyState(pet));  // Transition to HappyState
        }

        System.out.println(pet.getName() + " отдыхает и восстанавливает силы!");
    }

    @Override
    public String getMood() {
        return "Устал";  // Tired mood
    }
}
