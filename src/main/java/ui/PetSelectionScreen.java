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
import main.java.model.SickState;
import main.java.model.SleepingState;

import java.util.ArrayList;
import java.util.List;

public class PetSelectionScreen {
    private Stage stage;
    private List<Pet> pets;

    public PetSelectionScreen(Stage stage) {
        this.stage = stage;
        this.pets = new ArrayList<>();

        // Добавляем питомцев с разными состояниями
        pets.add(new Pet("Котик", new HappyState(null)));
        pets.add(new Pet("Песик", new TiredState(null)));
        pets.add(new Pet("Попугай", new HungryState(null)));
        pets.add(new Pet("Слон", new SickState(null)));  // Добавляем питомца с болезнью
        pets.add(new Pet("Медведь", new SleepingState(null)));  // Добавляем питомца, который спит
    }

    public void show() {
        StackPane root = new StackPane();

        // Создаем список питомцев с состояниями
        ListView<Pet> petListView = new ListView<>();
        petListView.getItems().addAll(pets);

        // Кнопка для выбора питомца
        Button btnSelectPet = new Button("Выбрать питомца");
        btnSelectPet.setOnAction(event -> {
            Pet selectedPet = petListView.getSelectionModel().getSelectedItem();
            if (selectedPet != null) {
                System.out.println("Вы выбрали питомца: " + selectedPet.getName());
                System.out.println("Энергия питомца: " + selectedPet.getEnergy());
                System.out.println("Настроение питомца: " + selectedPet.getMood());
                selectedPet.handleState();  // Выполняем действие в зависимости от состояния питомца
            } else {
                System.out.println("Выберите питомца!");
            }
        });

        root.getChildren().addAll(petListView, btnSelectPet);

        // Применение стилей через CSS
        Scene scene = new Scene(root, 300, 250);
        scene.getStylesheets().add(getClass().getResource("/styles/styles.css").toExternalForm());

        // Настроим сцену и покажем
        stage.setTitle("Выбор питомца");
        stage.setScene(scene);
        stage.show();
    }
}
