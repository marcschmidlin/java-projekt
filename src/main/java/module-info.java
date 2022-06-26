module com.example.javaprojekt226b {
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

    exports fem.ui.login;
    opens fem.ui.login to javafx.fxml;
    exports fem.ui.main;
    opens fem.ui.main to javafx.fxml;

}