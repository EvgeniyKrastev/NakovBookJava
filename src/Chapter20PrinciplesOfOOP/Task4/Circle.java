package Chapter20PrinciplesOfOOP.Task4;

public class Circle extends Shape{
    public Circle(double radius) {
        super(radius, radius);
    }

    @Override
    public double calculateSurface(){
        return Math.PI * getWidth() * getWidth(); // Площ на кръга (π * r^2)
    }
}
