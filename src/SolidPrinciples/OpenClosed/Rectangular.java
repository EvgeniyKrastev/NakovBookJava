package SolidPrinciples.OpenClosed;// Класовете Rectangle, Circle и Triangle имплементират интерфейса Shape.
// Класът AreaCalculator е затворен за модификация, защото не е нужно да
// добавяме нови методи за всеки нов тип фигура.
// Сега, ако добавим нова фигура (например, Triangle), не трябва да променяме
// класа AreaCalculator, защото той използва общия интерфейс Shape.

//Принципът Open/Closed не е свързан със специфицирането на видимостта
// на класовете (protected, public и т.н.), а с това как структурираме
// кодовата база така, че да можем да добавяме нови функционалности,
// без да променяме съществуващите класове. Това се постига чрез използване
// на абстракции (интерфейси или абстрактни класове) и разширяване на
// съществуващите класове чрез наследяване или композиция.


class Rectangular implements Shape {
    private double width;
    private double height;

    Rectangular(double width, double height){
        this.width = width;
        this.height = height;
    }

    @java.lang.Override
    public double calculateArea() {
        return width * height;
    }
}





