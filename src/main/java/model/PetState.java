package main.java.model;



public abstract class PetState {
    protected Pet pet;

    // Конструктор для получения объекта питомца
    public PetState(Pet pet) {
        this.pet = pet;
    }

    // Абстрактные методы для управления действиями питомца
    public abstract void feed(Pet pet);   // Метод для кормления питомца
    public abstract void play(Pet pet);   // Метод для игры с питомцем
    public abstract void sleep(Pet pet);  // Метод для сна питомца

    // Абстрактный метод handle для изменения состояния питомца
    public abstract void handle();
}
