package model;

import java.sql.Date;

public class Product {
    private int id;
    private String name;
    private int cost;
    private int quantity;
    private Date date;

    public Product(int _id, String _name, int _cost, int _quantity, Date _date) {
        super();
        this.id = _id;
        this.name = _name;
        this.cost = _cost;
        this.quantity = _quantity;
        this.date = _date;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public Date getDate() {
        return date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
