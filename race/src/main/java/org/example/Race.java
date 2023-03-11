package org.example;

public class Race {
    private String date;
    private int quantity;
    private boolean prize;

    public Race() {
    }

    public Race(String d, int q, boolean p) {
        date = d;
        quantity = q;
        prize = p;
    }

    public Race(String d, int q) {
        date = d;
        quantity = q;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean getPrize() {
        return prize;
    }

    public void setPrize(boolean prize) {
        this.prize = prize;
    }

    public void printDate() {
        System.out.println("Дата соревнования: " + date);
    }

    public void printQuantity() {
        System.out.println("Количество участников: " + quantity);
    }

    public void printPrize() {
        if (prize) {
            System.out.println("Есть приз.");
        } else {
            System.out.println("Нет приза.");
        }
    }

    /*public void Print() {
        System.out.println("Дата соревнования: " + date);
        System.out.println("Количество участников: " + quantity);
        if (prize) {
            System.out.println("Есть приз.");
        } else {
            System.out.println("Нет приза.");
        }
    }*/
}
