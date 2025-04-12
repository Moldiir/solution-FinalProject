package model;

public class Pet {
    private String name;
    private String mood;

    public Pet(String name, String mood) {
        this.name = name;
        this.mood = mood;
    }

    public String getName() {
        return name;
    }

    public String getMood() {
        return mood;
    }

    @Override
    public String toString() {
        return name + " (" + mood + ")";
    }
}
