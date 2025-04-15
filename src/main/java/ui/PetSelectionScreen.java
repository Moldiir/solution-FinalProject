package ui;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import model.Pet;

import java.util.ArrayList;
import java.util.List;

public class PetSelectionScreen {
    private Stage stage;
    private List<Pet> pets;

    public PetSelectionScreen(Stage stage) {
        this.stage = stage;
        this.pets = new ArrayList<>();

        // Добавляем несколько питомцев в список с именем и настроением
        pets.add(new Pet("Котик", "Счастливый"));
        pets.add(new Pet("Собака", "Сонливый"));
        pets.add(new Pet("Попугай", "Веселый"));

    }

    public void show() {
        StackPane root = new StackPane();

        // Создаем список питомцев
        ListView<Pet> petListView = new ListView<>();
        petListView.getItems().addAll(pets);  // Убедитесь, что передаете список pets в ListView

        // Кнопка для выбора питомца
        Button btnSelectPet = new Button("Выбрать питомца");
        btnSelectPet.setOnAction(event -> {
            Pet selectedPet = petListView.getSelectionModel().getSelectedItem();
            if (selectedPet != null) {
                System.out.println("Вы выбрали питомца: " + selectedPet.getName());
                // Можно добавить логику для перехода на следующий экран
            } else {
                System.out.println("Выберите питомца!");
            }
        });

        root.getChildren().addAll(petListView, btnSelectPet);

        // Применяем CSS для стилей
        Scene scene = new Scene(root, 300, 250);
        scene.getStylesheets().add(getClass().getResource("/styles/styles.css").toExternalForm());

        // Настроим сцену и покажем
        stage.setTitle("Выбор питомца");
        stage.setScene(scene);
        stage.show();
    }
}
