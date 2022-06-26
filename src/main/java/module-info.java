module main.java {

    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires javafx.graphics;
    requires java.sql;

    opens fem to javafx.fxml, javafx.graphics;
    opens fem.ui to javafx.fxml,fem.logic;

    opens fem.data to fem.logic;
    opens fem.dto to fem.ui, fem.logic;


}