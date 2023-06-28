package ch.nicola.abschlussprojekt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;

import java.io.IOException;


public class Controller {

    @FXML
    private void switchToList(ActionEvent event) throws IOException {
        MainApp.setSceneRoot("listView");

    }

}