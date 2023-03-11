package org.example;

public class InterfaceDemo {
    public static void main(String[] args) {
        Kid k1 = new Kid(10);
        k1.printInfo();
        Teenager t1 = new Teenager(4, 9.5);
        t1.printInfo();
        Mother m1 = new Mother(2, "ОАО Веселье");
        m1.printInfo();
        Father f1 = new Father(3, "БГУИР");
        f1.printInfo();
    }
}
