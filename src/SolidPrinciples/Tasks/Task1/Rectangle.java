package SolidPrinciples.Tasks.Task1;

class Rectangle extends BaseShape {
    private int width;
    private int heigth;

    Rectangle(int width, int heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    int getWidth() {
        return width;
    }

    void setWidth(int width) {
        this.width = width;
    }

    int getHeigth() {
        return heigth;
    }

    void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    @Override
    void displayInfo() {
        System.out.println("Rectangle details." +
                " Heigth" + heigth +
                " Width" + width);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + heigth);
    }

    // Периметърът на правоъгълник
    @Override
    public double calculateArea() {
        return heigth * width;
    }

    @Override
    public String toString() {
        return "Rectangle: " + calculateArea();
    }

}
