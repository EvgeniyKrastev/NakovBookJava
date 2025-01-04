package SolidPrinciples.OpenClosed;

import java.awt.*;

class Triangle implements Shape {
    private double base;
    private double height;

    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @java.lang.Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
