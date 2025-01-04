package SolidPrinciples.Tasks.Task1;

import java.util.ArrayList;
import java.util.List;

class ShapeManager {
    //static List<BaseShape> shapeList = new ArrayList<>();

    static List<BaseShape> shapeList = new ArrayList<>();

    static void printCounter() {
        System.out.println("Number of objects created: "
                + BaseShape.counterShape);
    }

    public static void main(String[] args) {
        // Създаване на обекти
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4, 5);
        Circle circle = new Circle(4);

        // Добавяне на фигурите в списъка

        shapeList.add(rectangle);
        shapeList.add(triangle);
        shapeList.add(circle);

        // Извеждане на информация за фигурите

        for (BaseShape shape : shapeList) {
            System.out.println(shape.toString());
        }

        // Извеждане на броя създадени обекти
        printCounter();

    }

}
