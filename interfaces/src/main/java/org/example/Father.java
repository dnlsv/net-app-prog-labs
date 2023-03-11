package org.example;

public class Father extends Parent {
    public Father(int _kids, String _work) {
        super(_kids, _work);
    }

    public String Name() {
        String name = "";
        //for (int i = 0; i < FIO.length(); i++){
        //    name = name + FIO.charAt(i);
        //    if (FIO.charAt(i) == ' ')
        //        break;
        //}
        name = "Отец";
        return name;
    }


    public void printInfo() {
        System.out.println("\nКоличество детей: " + getKids() + "\nМесто работы: " + getWork() + "\nИмя отца: " + Name());
    }

    public String getWork() {
        return work;
    }
}
