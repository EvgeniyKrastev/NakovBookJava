package SolidPrinciples.Tasks.Task1;
class Circle extends BaseShape {

    private final double PI = 3.14159;

    private int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    int getRadius() {
        return radius;
    }

    void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    void displayInfo() {
        System.out.println("Circle details: " +
                " Radius: " + radius);
    }

    public double calculatePerimeter() {
        return 2 * PI * radius;
    }

    public double calculateArea() {
        return PI * (radius * radius);
    }

    @Override
    public String toString() {
        return "Circle area: " + calculateArea();
    }

}
