package Chapter20PrinciplesOfOOP.Task4;

public class Rectangle extends Shape{

    public Rectangle(double width, double height) {
        super(width, height);
    }

    public double calculateSurface(){
        return (getHeight()*getWidth());
    }
}
