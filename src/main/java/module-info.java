module com.example.democalulator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.democalulator to javafx.fxml;
    exports com.example.democalulator;
}