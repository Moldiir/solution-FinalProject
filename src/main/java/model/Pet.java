package main.java.model;

public class Pet {
    private String name; // pet name
    private int energy; // pet energy level
    private PetState state; // state object for PetState
    private String mood; // pet mood level

    // Pet class construtor
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
        state.handle();
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
