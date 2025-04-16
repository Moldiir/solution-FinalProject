package main.java.model;

public class HungryState extends PetState {

    public HungryState(Pet pet) {
        super(pet);
    }

    @Override
    public void handle() {
        pet.setEnergy(pet.getEnergy() - 5);  // Питомец теряет немного энергии из-за голода
        pet.setMood("Голоден");               // Питомец голоден
        System.out.println(pet.getName() + " голоден и нуждается в кормлении.");
    }

    @Override
    public void feed(Pet pet) {
        pet.setEnergy(pet.getEnergy() + 20);  // Кормление восстанавливает много энергии
        pet.setMood("Насытился");              // Настроение меняется на сытость
        System.out.println(pet.getName() + " сыт и полон сил!");
    }

    @Override
    public void play(Pet pet) {
        pet.setEnergy(pet.getEnergy() - 10);  // Питомец теряет еще больше энергии
        pet.setMood("Голоден");
        System.out.println(pet.getName() + " не может играть, потому что голоден.");
    }

    @Override
    public void sleep(Pet pet) {
        pet.setEnergy(pet.getEnergy() + 10);  // Питомец восстанавливает немного энергии
        pet.setMood("Голоден");
        System.out.println(pet.getName() + " продолжает чувствовать голод.");
    }
}
