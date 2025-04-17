package main.java.commands;

public class HealCommand implements Command {
    private Pet pet;

    public HealCommand(Pet pet) {
        this.pet = pet;
    }

    @Override
    public void execute() {
        pet.heal();
    }
}
