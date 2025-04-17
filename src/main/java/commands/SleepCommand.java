package main.java.commands;

public class SleepCommand implements Command {
    private Pet pet;

    public SleepCommand(Pet pet) {
        this.pet = pet;
    }

    @Override
    public void execute() {
        pet.sleep();
    }
}

