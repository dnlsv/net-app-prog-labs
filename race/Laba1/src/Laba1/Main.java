package Laba1;

public class Main {
    public static void main(String[] args) {
        Race r = new Race("2020.09.01", 10, true);

        //r.setDate("2020.09.01");
        //r.setQuantity(10);
        //r.setPrize(true);

        //String s = r.getDate();
        //System.out.println("Информация о гонке " + s);
        //r.Print();

        WriterInfo wi = new WriterInfo();
        wi.Print(r);
    }
}
