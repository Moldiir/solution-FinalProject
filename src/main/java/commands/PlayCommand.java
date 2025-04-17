package main.java.commands;

public class PlayCommand implements Command {
    private Pet pet;

    public PlayCommand(Pet pet) {
        this.pet = pet;
    }

    @Override
    public void execute() {
        pet.play();
    }
}
