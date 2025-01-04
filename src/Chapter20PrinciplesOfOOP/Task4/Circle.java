package Chapter20PrinciplesOfOOP.Task4;

class Circle extends Shape {
    Circle(double radius) {
        super(radius, radius);
    }

    @Override
    double calculateSurface() {
        return Math.PI * getWidth() * getWidth(); // Площ на кръга (π * r^2)
    }
}
