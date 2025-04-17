package main.java.model;

public class PetBuilder {
    private String name;
    private PetState state;


    public PetBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PetBuilder setState(PetState state) {
        this.state = state;
        return this;
    }


    public Pet build() {
        return new Pet(name, state);
    }
}
