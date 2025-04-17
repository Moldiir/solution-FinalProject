package main.java.commands;

public class CleanCommand implements Command {
    private Pet pet;

    public CleanCommand(Pet pet) {
        this.pet = pet;
    }

    @Override
    public void execute() {
        pet.clean();
    }
}
