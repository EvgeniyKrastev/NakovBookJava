package SolidPrinciples.Tasks.Task1;

class Triangle extends BaseShape {

    private int leftSide;
    private int rightSide;
    private int bottomSide;

    Triangle(int leftSide, int rightSide, int bottomSide) {
        this.leftSide = leftSide;
        this.rightSide = rightSide;
        this.bottomSide = bottomSide;
    }

    int getLeftSide() {
        return leftSide;
    }

    void setLeftSide(int leftSide) {
        this.leftSide = leftSide;
    }

    int getRightSide() {
        return rightSide;
    }

    int getBottomSide() {
        return bottomSide;
    }

    void setBottomSide(int bottomSide) {
        this.bottomSide = bottomSide;
    }

    void setRightSide(int rightSide) {
        this.rightSide = rightSide;
    }

    @Override
    void displayInfo() {
        System.out.println("Triangle details: " +
                " LeftSide: " + leftSide +
                ", RightSide: " + rightSide +
                ", BottomSide: " + bottomSide);
    }

    @Override
    public double calculatePerimeter() {
        return leftSide + rightSide + bottomSide; // Периметър на триъгълник
    }

    @Override
    public double calculateArea() {
        // Площ по формулата на Херон:
        double s = (leftSide + rightSide + bottomSide) / 2.0;
        return Math.sqrt(s * (s - leftSide) * (s - rightSide) * (s - bottomSide)); // Правилна площ
    }

    @Override
    public String toString() {
        return "Triangle area: " + calculateArea();
    }
}
