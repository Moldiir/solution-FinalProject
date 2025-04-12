module com.example.finalproject {
    requires javafx.controls;
    requires javafx.fxml;

    opens ui to javafx.graphics;
    exports ui;
}
