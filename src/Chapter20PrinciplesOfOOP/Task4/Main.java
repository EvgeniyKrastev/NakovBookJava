package Chapter20PrinciplesOfOOP.Task4;

public class Main {
    /**4. Дефинирайте клас Shape със само един метод calculateSurface() и
     полета width и height.
     Дефинирайте два нови класа за триъгълник и
     правоъгълник, които имплементират споменатия виртуален метод.
     Този метод трябва да връща площта на правоъгълника (height*width) и
     триъгълника (height*width/2).
     Дефинирайте клас за кръг с подходящ
     конструктор, при когото при инициализация и двете полета (height и
     width) са с еднаква стойност (радиуса), и имплементирайте виртуалния
     метод за изчисляване на площта.
     Направете масив от различни фигури
     и сметнете площта на всичките в друг масив. */
   public static void main(String[] args) {
        Shape[] shapes = {
                new Rectangle(4, 5),  // Правоъгълник с width=4 и height=5
                new Triangle(4, 5),   // Триъгълник с width=4 и height=5
                new Circle(3)         // Кръг с радиус 3
        };

        double[] areas = new double[shapes.length];

        // Изчисляваме площите на фигурите и ги добавяме в масива
        for (int i = 0; i < shapes.length; i++) {
            areas[i] = shapes[i].calculateSurface();
        }

        // Извеждаме площите
        System.out.println("Площи на фигурите:");
        for (double area : areas) {
            System.out.println(area);
        }
    }
}
