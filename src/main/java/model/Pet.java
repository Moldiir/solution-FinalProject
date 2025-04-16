package main.java.model;

public class Pet {
    private String name;
    private String mood;
    private int energy;
    private PetState state;
    // Конструктор
    public Pet(String name, PetState state) {
        this.name = name;
        this.state = state;
        this.energy = 100;
        this.mood = state.getMood();
    }


    public void changeState(PetState newState) {
        this.state = newState;
        this.mood = newState.getMood();
    }

    public void handleState() {
        state.handle(this);
    }


    public String getName() {
        return name;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    @Override
    public String toString() {
        return name + " (" + mood + ")";
    }
}
