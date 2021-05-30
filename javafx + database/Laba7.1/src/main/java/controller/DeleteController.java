package controller;

import database.DatabaseConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import model.Product;

import java.net.URL;
import java.util.ResourceBundle;

public class DeleteController {

    private Product product;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button noButton;

    @FXML
    private Button yesButton;

    @FXML
    void yesButtonAction(ActionEvent event) {
        DatabaseConnection databaseConnection = new DatabaseConnection();
        databaseConnection.deleteFromDatabase(product.getId());
        dialogWindow("Товар удален!", "Information");
        Stage stage = (Stage) yesButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    void noButtonAction(ActionEvent event) {
        Stage stage = (Stage) noButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    void initialize() {

    }

    public void setProduct(Product _product){
        product = _product;
    }

    public void dialogWindow(String message, String title){
        Alert alert = new Alert(Alert.AlertType.NONE, message, ButtonType.OK);
        alert.setTitle(title);
        alert.showAndWait();
    }
}
