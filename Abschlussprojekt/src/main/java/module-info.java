module ch.nicola.abschlussprojekt {
    requires javafx.controls;
    requires javafx.fxml;


    opens ch.nicola.abschlussprojekt to javafx.fxml;
    exports ch.nicola.abschlussprojekt;
}