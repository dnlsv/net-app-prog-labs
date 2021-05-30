package controller;

import java.net.URL;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ResourceBundle;

import database.DatabaseConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.stage.Stage;
import model.Product;

public class EditController {

    private Product product;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField nameField;

    @FXML
    private DatePicker dateField;

    @FXML
    private TextField quantityField;

    @FXML
    private Button returnButton;

    @FXML
    private TextField costField;

    @FXML
    private Button editProductButton;

    @FXML
    void editProductButtonAction(ActionEvent event) {
        product.setName(nameField.getText());
        product.setCost(Integer.parseInt(costField.getText()));
        product.setQuantity(Integer.parseInt(quantityField.getText()));
        product.setDate(Date.valueOf(dateField.getValue()));
        DatabaseConnection databaseConnection = new DatabaseConnection();
        databaseConnection.editFromDatabase(product);
        dialogWindow("Товар отредактирован!", "Information");
        Stage stage = (Stage) editProductButton.getScene().getWindow();
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

    public void setProduct(Product _product){
        product = _product;
        nameField.setText(product.getName());
        costField.setText(Integer.toString(product.getCost()));
        quantityField.setText(Integer.toString(product.getQuantity()));
        dateField.setValue(LocalDate.parse(String.valueOf(product.getDate())));
    }

    public void dialogWindow(String message, String title){
        Alert alert = new Alert(Alert.AlertType.NONE, message, ButtonType.OK);
        alert.setTitle(title);
        alert.showAndWait();
    }
}
