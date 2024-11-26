package Chapter20PrinciplesOfOOP.Task4;

public class Triangle extends Shape{

    public Triangle(double width, double height) {
        super(width, height);
    }

    public double calculateSurface(){
        return (getHeight()*getWidth()/2);
    }
}