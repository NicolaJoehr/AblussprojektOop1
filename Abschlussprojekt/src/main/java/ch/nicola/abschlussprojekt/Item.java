package ch.nicola.abschlussprojekt;

import javafx.beans.property.SimpleStringProperty;


public class Item {
    private SimpleStringProperty id = new SimpleStringProperty();
    private SimpleStringProperty name = new SimpleStringProperty();
    private SimpleStringProperty preis = new SimpleStringProperty();
    private SimpleStringProperty zweck = new SimpleStringProperty();

    //Constructor
    public Item(String id, String name, String preis, String zweck) {
        this.setId(id);
        this.setName(name);
        this.setPreis(String.valueOf(preis));
        this.setZweck(String.valueOf(zweck));
    }

    //Id getter and setter
    public SimpleStringProperty idProperty() {
        return this.id;
    }
    public String getId() {
        return id.get();
    }
    public void setId(String id) {
        this.id.set(id);
    }

    //Name getter and setter
    public SimpleStringProperty nameProperty() {
        return this.name;
    }
    public String getName() {
        return name.get();
    }
    public void setName(String name) {
        this.name.set(name);
    }

    //Preis getter and setter
    public SimpleStringProperty preisProperty() {
        return this.preis;
    }
    public String getPreis() {
        return preis.get();
    }
    public void setPreis(String preis) {
        this.preis.set(preis);
    }

    //Zweck getter and setter
    public SimpleStringProperty zweckProperty() {
        return this.zweck;
    }
    public String getZweck() {
        return zweck.get();
    }
    public void setZweck(String zweck) {
        this.zweck.set(zweck);
    }

}
