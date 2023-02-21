package client.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import server.model.Product;

public class AdminMenuController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?, ?> productDateColumn;

    @FXML
    private TableColumn<?, ?> orderListColumn;

    @FXML
    private Button searchProductButton;

    @FXML
    private TableColumn<?, ?> supplyNameEmployeeColumn;

    @FXML
    private Button searchSupplyButton;

    @FXML
    private TableView<Product> productTable;

    @FXML
    private TableColumn<?, ?> productProducerColumn;

    @FXML
    private Button editSupplyButton;

    @FXML
    private Tab supplyTab;

    @FXML
    private Button deleteProductButton;

    @FXML
    private Button editProductButton;

    @FXML
    private TableView<?> orderTable;

    @FXML
    private TableColumn<?, ?> supplyListColumn;

    @FXML
    private TableColumn<?, ?> supplyNumberColumn;

    @FXML
    private TableColumn<?, ?> supplyDateColumn;

    @FXML
    private Button searchOrderButton;

    @FXML
    private TableColumn<?, ?> supplyPriceColumn;

    @FXML
    private Button deleteSupplyButton;

    @FXML
    private Button addProductButton;

    @FXML
    private Tab productTab;

    @FXML
    private TableColumn<?, ?> productQuantityColumn;

    @FXML
    private TableColumn<?, ?> productCharacteristicColumn;

    @FXML
    private Button deleteOrderButton;

    @FXML
    private Button editOrderButton;

    @FXML
    private TableColumn<?, ?> orderNumberColumn;

    @FXML
    private TableColumn<?, ?> orderDateColumn;

    @FXML
    private TableColumn<?, ?> productPriceColumn;

    @FXML
    private TableColumn<?, ?> orderClientNameColumn;

    @FXML
    private TableColumn<?, ?> orderNameEmployeeColumn;

    @FXML
    private TableColumn<?, ?> orderCostColumn;

    @FXML
    private Tab orderTab;

    @FXML
    private TableView<?> supplyTable;

    @FXML
    private TableColumn<?, ?> productNameColumn;

    @FXML
    private Button addOrderButton;

    @FXML
    private TableColumn<?, ?> supplyQuantityColumn;

    @FXML
    private Button addSupplyButton;

    @FXML
    void addProductButtonAction(ActionEvent event) {

    }

    @FXML
    void editProductButtonAction(ActionEvent event) {

    }

    @FXML
    void deleteProductButtonAction(ActionEvent event) {

    }

    @FXML
    void searchProductButtonAction(ActionEvent event) {

    }

    @FXML
    void searchOrderButtonAction(ActionEvent event) {

    }

    @FXML
    void deleteOrderButtonAction(ActionEvent event) {

    }

    @FXML
    void editOrderButtonAction(ActionEvent event) {

    }

    @FXML
    void addOrderButtonAction(ActionEvent event) {

    }

    @FXML
    void addSupplyButtonAction(ActionEvent event) {

    }

    @FXML
    void editSupplyButtonAction(ActionEvent event) {

    }

    @FXML
    void deleteSupplyButtonAction(ActionEvent event) {

    }

    @FXML
    void searchSupplyButtonAction(ActionEvent event) {

    }

    @FXML
    void initialize() {
        ArrayList<Product> arrayList = null;
        /*try {
            Client.outputStream.writeObject(str);
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        /*try {
            arrayList = (ArrayList<Product>) Client.inputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/

        productNameColumn.setCellValueFactory(new PropertyValueFactory<>("productName"));
        productProducerColumn.setCellValueFactory(new PropertyValueFactory<>("productProducer"));
        productCharacteristicColumn.setCellValueFactory(new PropertyValueFactory<>("productCharacteristic"));
        productQuantityColumn.setCellValueFactory(new PropertyValueFactory<>("productQuantity"));
        productDateColumn.setCellValueFactory(new PropertyValueFactory<>("productDate"));
        productPriceColumn.setCellValueFactory(new PropertyValueFactory<>("productPrice"));
        //productTable.setItems(FXCollections.observableArrayList(arrayList));

        //Client.os.writeObject(clm);
    }
}
