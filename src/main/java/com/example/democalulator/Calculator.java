package com.example.democalulator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Calculator extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent p1= FXMLLoader.load(this.getClass().getResource("cal.fxml"));
        Scene scene=new Scene(p1);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculator");
        primaryStage.centerOnScreen();
        primaryStage.show();
    }
}
