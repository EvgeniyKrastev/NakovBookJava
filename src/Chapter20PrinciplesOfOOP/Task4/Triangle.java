package Chapter20PrinciplesOfOOP.Task4;

class Triangle extends Shape{

    Triangle(double width, double height) {
        super(width, height);
    }

    double calculateSurface(){
        return (getHeight()*getWidth()/2);
    }
}