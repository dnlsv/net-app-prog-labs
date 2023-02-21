package org.example;

public class Kid implements Object,Human {
    private int kindergarten;

    public Kid(int _kindergarten) {
        this.kindergarten = _kindergarten;
    }

    private int getKindergarten() {
        return kindergarten;
    }

    public String Name() {
        String name = "";
        //for (int i = 0; i < FIO.length(); i++) {
        //    name = name + FIO.charAt(i);
        //    if (FIO.charAt(i) == ' ')
        //        break;
        //
        name = "Ребенок";
        return name;
    }

    public void printInfo() {
        System.out.println("\nНомер детского сада: " + getKindergarten() + "\nИмя ребенка: " + Name()          );
    }
}

