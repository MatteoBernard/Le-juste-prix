
package fr.univartois.butinfo.ihm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class JustePrixApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("juste-prix-view.fxml"));
        Parent viewContent = fxmlLoader.load();

		Scene scene = new Scene(viewContent, 355, 600);
        stage.setScene(scene);

        stage.setTitle("Bernard Matteo - Le juste prix");

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
