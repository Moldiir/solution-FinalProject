package main.java.model;

import main.java.utils.TimerUtil;

public class TiredState extends PetState {

    public TiredState(Pet pet) {
        super(pet);
        TimerUtil.startPetTimer(pet); // Запуск таймера при переходе в состояние "Устал"
    }

    @Override
    public void handle() {
        pet.setEnergy(pet.getEnergy() + 10); // Восстановление энергии
        pet.setMood("Устал");
        System.out.println(pet.getName() + " отдыхает и восстанавливает силы.");
    }

    @Override
    public void feed(Pet pet) {
        pet.setEnergy(pet.getEnergy() + 5); // Небольшое восстановление энергии
        pet.setMood("Устал");
        System.out.println(pet.getName() + " поел и немного восстановил силы.");
    }

    @Override
    public void play(Pet pet) {
        pet.setEnergy(pet.getEnergy() - 15); // Потеря энергии из-за игры
        pet.setMood("Устал");
        System.out.println(pet.getName() + " играет, но быстро утомляется.");
    }

    @Override
    public void sleep(Pet pet) {
        pet.setEnergy(pet.getEnergy() + 30); // Значительное восстановление энергии
        pet.setMood("Счастлив");
        System.out.println(pet.getName() + " спит и восстанавливает силы.");
    }

    @Override
    public String getMood() {
        return "Устал";
    }
}
