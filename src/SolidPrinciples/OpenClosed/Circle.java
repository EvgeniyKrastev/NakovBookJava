package SolidPrinciples.OpenClosed;

class Circle implements Shape {
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @java.lang.Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
