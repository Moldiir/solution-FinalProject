package model;

public class PetBuilder {
    private String name;
    private String type;

    public PetBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PetBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public Pet build() {
        return new Pet(name, type);

    }
}
