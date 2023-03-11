package org.example;

public class Parent extends Human {
    String work;
    private final int kids;

    public Parent() {
        super();
        kids = 0;
        work = "";
    }

    public Parent(String _FIO, String _gender, int _age, int _kids, String _work) {
        super(_FIO, _gender, _age);
        kids = _kids;
        work = _work;
    }

    public int getKids() {
        return kids;
    }

    public String getWork() {
        return work;
    }

    public void Name() {
        String name = "";
        for (int i = 0; i < FIO.length(); i++) {
            name = name + FIO.charAt(i);
            if (FIO.charAt(i) == ' ')
                break;
        }
        System.out.println("Имя родитля: " + name);
    }
}
