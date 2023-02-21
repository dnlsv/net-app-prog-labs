package org.example.controller;

import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.util.ResourceBundle;

import org.example.database.DatabaseConnection;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import org.example.model.Product;

public class ViewController {

    private Product product;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Product> productTable;

    @FXML
    private TableColumn<Product, String> productName;

    @FXML
    private TableColumn<Product, Integer> productQuantity;

    @FXML
    private TableColumn<Product, Integer> productCost;

    @FXML
    private TableColumn<Product, Integer> productID;

    @FXML
    private TableColumn<Product, Date> productYear;

    @FXML
    private Button editButton;

    @FXML
    private Button addButton;

    @FXML
    private Button deleteButton;

    @FXML
    void addButtonAction(ActionEvent event) {
        addButton.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/view/add.fxml"));

        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setOnCloseRequest(e -> initialize());
        stage.setOnHidden(e -> initialize());
        stage.setScene(new Scene(root));
        stage.showAndWait();
    }

    @FXML
    void tableAction(MouseEvent event) {
        product =  productTable.getSelectionModel().selectedItemProperty().get();
    }

    @FXML
    void editButtonAction(ActionEvent event) {
        if(product != null) {
            editButton.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/view/edit.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();

            EditController editController = loader.getController();
            editController.setProduct(product);

            Stage stage = new Stage();
            stage.setOnCloseRequest(e -> initialize());
            stage.setOnHidden(e -> initialize());
            stage.setScene(new Scene(root));
            stage.showAndWait();
        }
        else
            dialogWindow("Выберите товар!", "Information");
    }

    @FXML
    void deleteButtonAction(ActionEvent event) {
        if(product != null) {
            deleteButton.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/view/delete.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();

            DeleteController deleteController = loader.getController();
            deleteController.setProduct(product);

            Stage stage = new Stage();
            stage.setOnCloseRequest(e -> initialize());
            stage.setOnHidden(e -> initialize());
            stage.setScene(new Scene(root));
            stage.showAndWait();
        }
        else
            dialogWindow("Выберите товар!", "Information");
    }

    @FXML
    void initialize() {
        DatabaseConnection databaseConnection = new DatabaseConnection();
        productID.setCellValueFactory(new PropertyValueFactory<>("id"));
        productName.setCellValueFactory(new PropertyValueFactory<>("name"));
        productCost.setCellValueFactory(new PropertyValueFactory<>("cost"));
        productQuantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        productYear.setCellValueFactory(new PropertyValueFactory<>("date"));
        productTable.setItems(FXCollections.observableArrayList(databaseConnection.getProductList()));
    }

    public void dialogWindow(String message, String title){
        Alert alert = new Alert(Alert.AlertType.NONE, message, ButtonType.OK);
        alert.setTitle(title);
        alert.showAndWait();
    }

}
