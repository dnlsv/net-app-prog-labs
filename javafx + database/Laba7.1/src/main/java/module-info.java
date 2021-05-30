module controller {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.java;

    opens controller to javafx.fxml;
    opens model to javafx.base;
    exports controller;
    exports model;
}