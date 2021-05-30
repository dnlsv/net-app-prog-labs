package database;

import model.Product;

import java.sql.*;
import java.util.ArrayList;

public class DatabaseConnection {

    private final String URL = "jdbc:mysql://localhost:3306/electricalstore?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private final String USERNAME = "root";
    private final String PASSWORD = "CrastyCrabs43";

    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    ArrayList<Product> arrayList;

    public DatabaseConnection(){
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            statement = connection.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public ArrayList<Product> getProductList(){
        arrayList = new ArrayList<Product>();
        try {
            resultSet = statement.executeQuery("SELECT * FROM electricalstore.product;");

            while(resultSet.next()){
                Product product = new Product(resultSet.getInt(1), resultSet.getString(2),
                        resultSet.getInt(3), resultSet.getInt(4), resultSet.getDate(5));
                arrayList.add(product);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return arrayList;
    }

    public void addToDatabase(Product product){
        String query = "insert into product (name, cost, quantity, date) values ('"
                + product.getName() +"','" + product.getCost() + "','"
                + product.getQuantity() + "','" + product.getDate() + "');";
        try {
            statement.execute(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void deleteFromDatabase(int id){
        String query = "delete from product where id = " + id + ";";
        try {
            statement.execute(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void editFromDatabase(Product product){
        String query = "update product set name = '" + product.getName()
                + "', cost = '" + product.getCost()
                + "', quantity = '"+ product.getQuantity()
                +"', date = '" + product.getDate() + "' where id = " + product.getId() + ";";

        try {
            statement.execute(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
