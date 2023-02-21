package orq.example;

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

    public Race(Race obj) {
        this.date = obj.date;
        this.quantity = obj.quantity;
        this.prize = obj.prize;
    }

    public String getDate() {
        return date;
    }
    public int getQuantity() {
        return quantity;
    }
    public boolean getPrize() {
        return prize;
    }

    public static int Quantity(Race []race) {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            count += race[i].quantity;
        }
        return count;
    }

    public static int hasPrize(Race []race) {
        int count = 0;
        for (int i = 0; i < 5; i++)
            if (race[i].prize == true)
                count++;
        return count;
    }

    public void print() {
        System.out.println(this.getDate() + "\n" + this.getQuantity());
        if (this.getPrize())
            System.out.println("Есть приз.");
        if (!this.getPrize())
            System.out.println("Нет приза.");
    }
}
