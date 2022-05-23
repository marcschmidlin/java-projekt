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

    opens com.example.javaprojekt226b to javafx.fxml;
    exports com.example.javaprojekt226b;
    exports ui.login;
    opens ui.login to javafx.fxml;
    exports start;
    opens start to javafx.fxml;
    exports ui.main;
    opens ui.main to javafx.fxml;
}