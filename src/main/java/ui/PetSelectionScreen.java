package main.java.ui;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import main.java.model.Pet;
import main.java.model.HappyState;
import main.java.model.TiredState;
import main.java.model.HungryState;
import java.util.ArrayList;
import java.util.List;

public class PetSelectionScreen {
    private Stage stage;
    private List<Pet> pets;

    public PetSelectionScreen(Stage stage) {
        this.stage = stage;
        this.pets = new ArrayList<>();

        Pet pet1 = new Pet("Котик", new HappyState(null));
        Pet pet2 = new Pet("Песик", new TiredState());
        Pet pet3 = new Pet("Попугай", new HungryState(null));


        pets.add(pet1);
        pets.add(pet2);
        pets.add(pet3);
    }

    public void show() {
        StackPane root = new StackPane();

        ListView<Pet> petListView = new ListView<>();
        petListView.getItems().addAll(pets);


        Button btnSelectPet = new Button("Выбрать питомца");
        btnSelectPet.setOnAction(event -> {
            Pet selectedPet = petListView.getSelectionModel().getSelectedItem();
            if (selectedPet != null) {
                System.out.println("Вы выбрали питомца: " + selectedPet.getName());
                System.out.println("Энергия питомца: " + selectedPet.getEnergy());
                System.out.println("Настроение питомца: " + selectedPet.getMood());
                selectedPet.handleState();
            } else {
                System.out.println("Выберите питомца!");
            }
        });

        root.getChildren().addAll(petListView, btnSelectPet);

        Scene scene = new Scene(root, 300, 250);
        scene.getStylesheets().add(getClass().getResource("/styles/styles.css").toExternalForm());


        stage.setTitle("Выбор питомца");
        stage.setScene(scene);
        stage.show();
    }
}
