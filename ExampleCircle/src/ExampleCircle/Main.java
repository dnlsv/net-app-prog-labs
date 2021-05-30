package ExampleCircle;

public class Main {
    public static void main(String[] args) {
        Circle o1 = new Circle();
        o1.printCircle(); // Окружность с центром (0.0;0.0) и радиусом 1.0
        Circle o2 = new Circle(1,-1,14);
        o2.printCircle(); // Окружность с центром (1.0;-1.0) и радиусом 14.0
    }
}
