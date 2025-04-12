package ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainScreen extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Создаем главную панель
        StackPane root = new StackPane();

        // Кнопка для выбора питомца
        Button btnSelectPet = new Button("Выберите питомца");
        btnSelectPet.setOnAction(event -> {
            PetSelectionScreen petSelectionScreen = new PetSelectionScreen(primaryStage);
            petSelectionScreen.show();  // Переход на экран выбора питомца
        });

        root.getChildren().add(btnSelectPet);

        // Настроим сцену и показ
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Tamagotchi");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
