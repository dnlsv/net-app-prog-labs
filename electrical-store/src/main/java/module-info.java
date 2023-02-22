module store {
    requires javafx.base;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    requires java.sql;
    requires mysql.connector.java;

    opens org.example.controller to javafx.fxml;
    opens org.example.model to javafx.base;

    exports org.example.controller;
}