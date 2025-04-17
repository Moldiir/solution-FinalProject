package main.java.utils;


import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;
import main.java.model.Pet;
import main.java.model.TiredState;

public class TimerUtil {
    public static void startPetTimer(Pet pet) {
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(10), event -> {

            if (pet.getEnergy() > 0) {
                pet.setEnergy(pet.getEnergy() - 10);
            } else {

                pet.changeState(new TiredState(pet));
                System.out.println(pet.getName() + " теперь в состоянии: " + pet.getMood());
            }


            System.out.println(pet.getName() + " энергия: " + pet.getEnergy());
        }));


        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }
}
