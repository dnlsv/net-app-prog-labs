package lab;

import lab2.Race;
public class Main {
    public static void main(String[] args) {
        Race []r = new Race [5];
        r[0] = new Race("2020.09.01", 10, true);
        r[1] = new Race("2020.09.01", 10);
        r[2] = new Race(r[0]);
        r[3] = new Race();
        r[4] = new Race("2020.09.14", 20, false);

        for (int i = 0; i < 5; i++) {
            r[i].print();
        }

        System.out.println("Общее количетсво участников = " + Race.Quantity(r));
        System.out.println("Количетсво соревнований с призом = " + Race.hasPrize(r));
    }
}
