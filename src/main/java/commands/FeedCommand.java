package main.java.commands;

public class FeedCommand implements Command {
    private Pet pet;

    public FeedCommand(Pet pet) {
        this.pet = pet;
    }

    @Override
    public void execute() {
        pet.feed();
    }
}
