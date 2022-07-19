package org.alandelacruz.system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Alan Eduardo De La Cruz Najera
 * @date 20 abr. 2021
 * @time 22:55:35
 * Carnet:2020390
 * Codigo Tecnico: IN5BV
 */

public class Principal extends Application{
    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../view/FXMLCalculadoraView.fxml"));
        Scene Scene = new Scene(root);
        stage.setScene(Scene);
        stage.show();
    }

}
