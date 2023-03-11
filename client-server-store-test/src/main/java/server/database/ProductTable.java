package server.database;

import server.model.Product;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ProductTable {

    private final Connection connection;
    private Statement statement;
    private ArrayList<Product> arrayList;
    private ResultSet resultSet;

    public ProductTable(Connection connection) {
        this.connection = connection;
        try {
            statement = connection.createStatement();
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
    }

    public ArrayList<Product> getProductTable() {
        arrayList = new ArrayList<Product>();
        try {
            resultSet = statement.executeQuery("SELECT * FROM store.product;");

            while (resultSet.next()) {
                Product product = new Product(resultSet.getInt(1), resultSet.getString(2),
                        resultSet.getString(3), resultSet.getString(4),
                        resultSet.getInt(5), resultSet.getDate(6),
                        resultSet.getInt(7));
                arrayList.add(product);
            }

        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return arrayList;
    }
}
