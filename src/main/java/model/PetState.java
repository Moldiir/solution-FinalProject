package main.java.model;


public abstract class PetState {
    protected Pet pet;

    public PetState(Pet pet) {
        this.pet = pet;
    }

    public abstract void handle();
}
