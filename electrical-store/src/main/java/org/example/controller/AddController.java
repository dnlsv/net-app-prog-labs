package org.example.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import org.example.database.DatabaseConnection;
import org.example.model.Product;

import java.net.URL;
import java.sql.Date;
import java.util.ResourceBundle;

public class AddController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField nameField;

    @FXML
    private DatePicker dateField;

    @FXML
    private Button addProductButton;

    @FXML
    private TextField quantityField;

    @FXML
    private Button returnButton;

    @FXML
    private TextField costField;

    @FXML
    void addProductButtonAction(ActionEvent event) {
        String name = nameField.getText();
        int cost = Integer.parseInt(costField.getText());
        int quantity = Integer.parseInt(quantityField.getText());
        Date date = Date.valueOf(dateField.getValue());
        DatabaseConnection databaseConnection = new DatabaseConnection();
        Product product = new Product(0, name, cost, quantity, date);
        databaseConnection.addToDatabase(product);
        dialogWindow("Товар добавлен!", "Information");
        Stage stage = (Stage) addProductButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    void returnButtonAction(ActionEvent event) {
        Stage stage = (Stage) returnButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    void initialize() {

    }

    public void dialogWindow(String message, String title) {
        Alert alert = new Alert(Alert.AlertType.NONE, message, ButtonType.OK);
        alert.setTitle(title);
        alert.showAndWait();
    }
}
