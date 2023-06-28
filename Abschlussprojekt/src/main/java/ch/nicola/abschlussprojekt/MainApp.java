package ch.nicola.abschlussprojekt;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {
    //scene Variable
    private static Stage primaryStage;
    public static Item selectedItem;

    private static ObservableList<Item> itemlist = FXCollections.observableArrayList();

    public MainApp() {
        itemlist.add(new Item("1", "Bouldermatte", "150-300Fr", "Schützt beim Fallem wärend dem Bouldern."));
        itemlist.add(new Item("2", "Expressen", "50-100Fr", "Wird für das Sichern mit Seil verwendet."));
        itemlist.add(new Item("3", "Friends", "50-100Fr", "Kann in einen Riss in der Wand gesetzt werden."));
        itemlist.add(new Item("4", "Helm", "80-200Fr", "Schützt vor fallenden Gegenständen."));
        itemlist.add(new Item("5", "Klettergurt", "100-200Fr", "Wird verwendet um sich beim Klettern mit dem Seil zu sichern."));
        itemlist.add(new Item("6", "Kletterschuhe", "100-250Fr", "Für Halt und Beweglichkeit."));
        itemlist.add(new Item("7", "Kletterseil", "100-300Fr", "Wird zur Absturtzsicherund verwendet."));
        itemlist.add(new Item("8", "Sicherungsgerät", "30-60Fr", "Wird für das Sichern mit Seil verwendet."));
    }

    public static ObservableList<Item> getItemList() {
        return itemlist;
    }

    //Start the App
    public static void main(String[] args) {
        launch();
    }

    //Main Scene definition and setter
    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("mainView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 920, 620);
        stage.setTitle("Kletteritems");
        stage.setScene(scene);
        stage.show();
    }

    static void setSceneRoot(String fxml) throws IOException {
        primaryStage.setScene(new Scene(loadFXML(fxml), primaryStage.getWidth(), primaryStage.getHeight()));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void setSelectedItem(String id) {
        for (Item item : itemlist) {
            if (item.getId().equals(id)) {
                selectedItem = item;
                break;
            }

        }
    }
}