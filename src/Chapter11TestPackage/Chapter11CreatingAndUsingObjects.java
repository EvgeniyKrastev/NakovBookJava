package Chapter11TestPackage;

import java.util.Random;
import java.util.Scanner;

class Chapter11CreatingAndUsingObjects {

    static void exampleOfTimePassing() {
        int sum = 0;
        long startTime = System.currentTimeMillis();
        // The code fragment to be tested
        for (int i = 0; i < 10000000; i++) {
            sum++;
        }
        long endTime = System.currentTimeMillis();
        System.out.printf("The time elapsed is %f sec",
                (endTime - startTime) / 1000.0);
    }

    static void exampleFaceOfTriangle() {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Length of the first side:");
        double a = input.nextDouble();
        System.out.println("Length of the second side:");
        double b = input.nextDouble();
        System.out.println("Size of the angle in degrees:");
        int angle = input.nextInt();
        System.out.printf("Face of the triangle: %f%n",
                0.5 * a * b * Math.sin(Math.toRadians(angle)));

        System.out.println(Math.PI);
        System.out.println(Math.E);
    }

    static void toto6ot49() {
        Random rand = new Random();
        for (int number = 1; number <= 6; number++) {
            int randomNumber = rand.nextInt(49) + 1;
            System.out.printf("%d ", randomNumber);
        }
    }

    static void zad1Timefrom1970toNow() {
//        1. Напишете програма, която извежда на стандартния изход броя на дните,
//                часовете и минутите, които са изтекли от 1 януари 1970 година до
//        момента на изпълнението на програмата. За реализацията използвайте
//        класа System.
//        1. Използвайте метода System.currentTimeMillis(), за да получите броя на
//        изтеклите милисекунди. Използвайте факта, че в една секунда има 1000
//        милисекунди и пресметнете минутите, часовете и дните.
        long millis = System.currentTimeMillis(); // Получаване на текущото време в милисекунди

        // Преобразуване на милисекунди в секунди, минути, часове, дни, седмици, години
        long seconds = millis / 1000; // 1 секунда = 1000 милисекунди
        long minutes = seconds / 60; // 1 минута = 60 секунди
        long hours = minutes / 60; // 1 час = 60 минути
        long days = hours / 24; // 1 ден = 24 часа
        long weeks = days / 7; // 1 седмица = 7 дни
        long years = days / 365; // 1 година = 365 дни (без да се вземат предвид високосните години)

        // Извеждане на резултатите на конзолата
        System.out.println("Милисекунди: " + millis);
        System.out.println("Секунди: " + seconds);
        System.out.println("Минути: " + minutes);
        System.out.println("Часове: " + hours);
        System.out.println("Дни: " + days);
        System.out.println("Седмици: " + weeks);
        System.out.println("Години: " + years);
    }

    static void zad2Apow2plusBpow2() {
//        2. Напишете програма, която по дадени два катета намира хипотенузата
//        на правоъгълен триъгълник. Реализирайте въвеждане на дължините на
//        катетите от стандартния вход, а за пресмятането на хипотенузата
//        използвайте методи на класа Math.
//        2. Хипотенузата на правоъгълен триъгълник се намира с помощта на
//        известната теорема на Питагор: a2 + b2 = c2, където a и b са двата катета,
//        а c е хипотенузата. Коренувайте двете страни, за да получите формула
//        за дължината на хипотенузата. За реализацията на коренуването
//        използвайте метода sqrt(…) на класа Math.

        Scanner input = new Scanner(System.in);

        System.out.print(" a = ");
        int a = input.nextInt();

        System.out.print(" b = ");
        int b = input.nextInt();

        System.out.println("a\u00B2 + b\u00B2 = " + Math.sqrt(a) + Math.sqrt(b));
    }

    static void zad3PackageWithCatAndSequence() {
//        3. Дефинирайте свой собствен пакет chapter10 и поставете в него двата
//        класа Cat и Sequence, които използвахме в примерите на текущата тема.
//        Направете още един собствен пакет с име chapter10.examples и в него
//        направете клас, който извиква класовете Cat и Sequence.
//        3. Създайте нов проект в Eclipse, щракнете с десния бутон върху папката
//        src и изберете от контекстното меню New -> Package. След като въве
//        дете име на пакета и натиснете [Finish], щракнете с десния бутон върху
//        папката на новосъздадения пакет и изберете New -> Class. За име на
//        новия клас въведете Cat и натиснете [Finish]. Подменете дефиницията
//        на новосъздадения клас с дефиницията, която дадохме в тази тема.
//        Направете същото за класа Sequence.

        // chapter11TestPackage.examples.ToUseCanAndSequence(); ot tuk se startira
    }

    static void zad4ArrayTenCats() {
//        4. Напишете програма, която създава 10 обекта от тип Cat, дава им имена
//        от вида CatN, където N e уникален пореден номер на обекта, и накрая
//        извиква метода sayMiau() на всеки от тях. За реализацията използвайте
//        вече дефинирания пакет chapter10.
//        4. Създайте масив с 10 елемента от тип Cat. Създайте в цикъл 10 обекта
//        от тип Cat (използвайте конструктор с параметри), като ги присвоявате
//        на съответните елементи от масива. За поредния номер на обектите
//        използвайте метода nextValue() на класа Sequence. Накрая отново в
//        цикъл изпълнете метода sayMiau() на всеки от елементите на масива.
        Cat[] listofCats = new Cat[10];

        for (int i = 0; i < 10; i++) {
            listofCats[i] = new Cat();
            listofCats[i].setName("Cat " + Sequence.nextValue());
            listofCats[i].sayMiau();
        }

    }

    static void zad5RandomMessage() {
//        5. Напишете програма, която генерира случайно рекламно съобщение за
//        някакъв продукт. Съобщенията трябва да се състоят от хвалебствена
//        фраза, следвани от хвалебствена случка, следвани от автор (първо и
//        второ име) и град, които се избират от предварително подготвени
//        списъци. Например, нека имаме следните списъци:
//        - Хвалебствени фрази: {"Продуктът е отличен.", "Това е страхотен
//        продукт.", "Постоянно ползвам този продукт.", "Това е най-добрият
//        продукт от тази категория."}.
//        Глава 11. Създаване и използване на обекти 339
//                - Хвалебствени случки: {"Вече се чувствам добре.", "Успях да се
//            променя.", "Той направи чудо.", "Не мога да повярвам, но вече се
//            чувствам страхотно.", "Опитайте и вие. Аз съм много доволна."}.
//                    - Първо име на автор: {"Диана", "Петя", "Стела", "Елена", "Катя"}.
//            - Второ име на автор: {"Иванова", "Петрова", "Кирова"}.
//            - Градове: {"София", "Пловдив", "Варна", "Русе", "Бургас"}.
//            Тогава програма би могла да изведе следното случайно-генерирано
//            рекламно съобщение:
//            Постоянно ползвам този продукт. Опитайте и вие. Аз съм доволна. -
//        – Елена Петрова, Варна
//        5. Използвайте класа java.util.Random и неговия метод nextInt().
        Random rnd = new Random();
        String[] theGoodPhrases = {"Продуктът е отличен.",
                "Това е страхотен продукт.",
                "Постоянно ползвам този продукт.",
                "Това е най-добрият продукт от тази категория."};

        String[] theGoodExperiences = {"Вече се чувствам добре.",
                "Успях да се променя.",
                "Той направи чудо.",
                "Не мога да повярвам, но вече се чувствам страхотно.",
                "Опитайте и вие. Аз съм много доволна."};

        String[] firstName = {"Диана", "Петя", "Стела", "Елена", "Катя"};
        String[] secondName = {"Иванова", "Петрова", "Кирова"};
        String[] city = {"София", "Пловдив", "Варна", "Русе", "Бургас"};

        for (int i = 0; i < 10; i++) {
            System.out.printf("%s %s %s %s %s \n\n",
                    theGoodPhrases[rnd.nextInt(4)],
                    theGoodExperiences[rnd.nextInt(5)],
                    firstName[rnd.nextInt(5)],
                    secondName[rnd.nextInt(3)],
                    city[rnd.nextInt(5)]
            );
        }
    }

    public static void main(String[] args) {

    }
}
