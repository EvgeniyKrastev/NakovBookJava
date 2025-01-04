package Chapter20PrinciplesOfOOP.Task4;

class Rectangle extends Shape {

    Rectangle(double width, double height) {
        super(width, height);
    }

    double calculateSurface() {
        return (getHeight() * getWidth());
    }
}
