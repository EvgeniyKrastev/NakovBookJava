package SolidPrinciples.Tasks.Task1;

abstract class BaseShape implements Shape {
//Съдържай общи полета и методи за всички фигури (например име на фигурата).

    protected static int counterShape = 0;

    abstract void displayInfo();

    BaseShape() {
        counterShape++;
    }

    public abstract  double calculatePerimeter();

    public abstract double calculateArea();
}
