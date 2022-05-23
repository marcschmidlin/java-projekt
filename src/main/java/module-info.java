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

    exports ui.login;
    opens ui.login to javafx.fxml;
    exports ui.main;
    opens ui.main to javafx.fxml;

}