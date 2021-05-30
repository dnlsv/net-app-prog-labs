package ExampleCircle;

public class Circle {
    // свойства класса private
    double x; // абсцисса центра private
    double y; // ордината центра private
    double r; // радиус
    // методы класса
    // выводит на экран параметры окружности
    public void printCircle() {
        System.out.println("Окружность с центром (" + x + ";" + y + ") и радиусом " + r);
    }
    // перемещает центр, движение окружности
    public void moveCircle(double a, double b) {
        x = x + a; y = y + b;
    }
    // масштабируем, выполняем преобразование подобия с коэффициентом k
    public void zoomCircle(double k) {
        r = r * k;
    }
    // конструктор по умолчанию, теперь сразу после создания объекта будем
    // получать окружность единичного радиуса с центром в начале координат
    public Circle() {
        x = 0.0;
        y = 0.0;
        r = 1.0;
    }
    public Circle(double a, double b, double s) {
        x = a;
        y = b;
        r = s;
    }
}