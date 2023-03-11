package org.example;

public abstract class Parent implements Object, Human {
    String work;
    private final int kids;

    public Parent(int _kids, String _work) {
        this.kids = _kids;
        this.work = _work;
    }

    public int getKids() {
        return kids;
    }

    public abstract String getWork();
}
