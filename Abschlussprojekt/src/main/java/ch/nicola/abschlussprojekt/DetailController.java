package ch.nicola.abschlussprojekt;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;

public class DetailController {

    @FXML
    private final ObjectProperty<Item> selectedClient = new SimpleObjectProperty<>(MainApp.selectedItem);

    public final Item getSelectedClient() {
        return this.selectedClient.get();
    }

    @FXML
    private Label labelName;
    @FXML
    private TextField textName;

    @FXML
    private Label labelZweck;
    @FXML
    private TextField textZweck;

    @FXML
    private Label labelPreis;
    @FXML
    private TextField textPreis;

    //Editmode setter and getter
    @FXML
    private final BooleanProperty editmode = new SimpleBooleanProperty();

    public boolean getEditmode() {
        return this.editmode.get();
    }
    public final void setEditmode(boolean b) {
        this.editmode.set(b);
    }

    public BooleanProperty editmodeProperty() {
        return editmode;
    }

    //Readmode only setter
    @FXML
    private final SimpleBooleanProperty readmode = new SimpleBooleanProperty(true);

    public final boolean getReadmode() {
        return this.readmode.get();
    }
    public final void setReadmode(boolean b) {
        this.readmode.set(b);
    }
    public BooleanProperty readmodeProperty() {
        return readmode;
    }

    //Image getter and setter
    @FXML
    private final ObjectProperty<Image> image = new SimpleObjectProperty<>();

    public ObjectProperty<Image> imageProperty() {
        return image;
    }
    public final Image getImage() {
        return imageProperty().get();
    }
    public final void setImage(Image image) {
        imageProperty().set(image);
    }


    public DetailController() {
    }

    @FXML
    public void initialize() {
        String name = selectedClient.getValue().getName();
        Image imageA = new Image(this.getClass().getResourceAsStream(name + ".jpg"));
        this.image.set(imageA);
    }
}
