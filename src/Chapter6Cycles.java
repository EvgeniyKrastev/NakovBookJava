import java.util.Random;
import java.util.Scanner;

class Chapter6Cycles {

    static void whileLoop() {
        int counter = 0;
        while (counter < 5) {
            System.out.printf("Number %d%n", counter);
            counter++;
            int a = (counter);
        }
    }

    /**
     * Променливата divider, използваме за стойността на евентуалния делител
     * на числото, я инициализираме в началото с 2. maxDivider е максималният
     * възможен делител, който е равен на корен квадратен от числото (ако имаме
     * делител, по-голям от √num, то би трябвало num да има и друг делител, който
     * е обаче по-малък от √num и затова няма смисъл да проверяваме числата,
     * по-големи от √num).
     */
    static void ifNumberIsSimple() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive Number: ");
        int num = input.nextInt();
        int divider = 2;
        int maxDivider = (int) Math.sqrt(num);
        boolean prime = true;
        while (prime && (divider <= maxDivider)) {
            if (num % divider == 0) {
                prime = false;
            }
            divider++;
        }
        System.out.println("Prime? " + prime);
    }

    static void forLoopWithTwoVariables() {
        for (int a = 0, b = 10; a < b; a++, b--) {
            System.out.printf(" a = %d, b= %d\n", a, b);
        }
    }

    static void allNumbersNotDividableOfSeven() {
        //181 primer
        Scanner input = new Scanner(System.in);
        System.out.println("Insert Number: ");
        int n = input.nextInt();

        int sum = 0;
        for (int i = 1; i < n; i += 2) {
            if (i % 7 == 0) {
                continue;
            }
            sum += i;
        }
        System.out.println("sum = " + sum);
    }

    static void forEachTest() {
        int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9};
        for (int i : numbers) {
            System.out.printf("%d", i);
        }

        System.out.println();

        String[] towns = {"Sofia", "Plovdiv", "Stara Zagora", "Vidin"};

        for (String town : towns) {
            System.out.printf("%s", town);
        }

    }

    static void printTriangle() {
        //str 182 primer
        System.out.print("Insert number for Triangle: ");
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        for (int row = 1; row <= number; row++) {
            System.out.println();
            for (int col = 1; col <= row; col++) {
                System.out.printf("%d ", col);
            }
        }
    }

    //not ready
    static void printPiramid() {
        //str 182 primer
        System.out.print("Insert number for Triangle: ");
        Scanner input = new Scanner(System.in);

        //int number = input.nextInt();

        for (int row = 5; row >= 1; row--) {
            System.out.println("*");
            for (int col = row; col >= 1; col--) {
                System.out.printf("%d ", col);
            }

        }
    }

    static void primeNumber() {
        //str 184 прости числа в интервала [N, M]
        Scanner input = new Scanner(System.in);
        System.out.println(" n= ");
        int n = input.nextInt();
        System.out.println(" m= ");
        int m = input.nextInt();

        for (int num = n; num <= m; num++) {
            boolean prime = true;
            int divider = 2;
            int maxDivider = (int) Math.sqrt(num);
            while (divider <= maxDivider) {
                if (num % divider == 0) {
                    prime = false;
                    break;
                }
                divider++;
            }
            if (prime) {
                System.out.printf("%d ", num);
            }
        }
    }

    static void totoNumbers() {
        //str184
        for (int i1 = 1; i1 <= 44; i1++)
            for (int i2 = i1 + 1; i2 <= 45; i2++)
                for (int i3 = i2 + 1; i3 <= 46; i3++)
                    for (int i4 = i3 + 1; i4 <= 47; i4++)
                        for (int i5 = i4 + 1; i5 <= 48; i5++)
                            for (int i6 = i5 + 1; i6 <= 45; i6++) {
                                System.out.printf("%d %d %d %d %d %d",
                                        i1, i2, i3, i4, i5, i6);
                            }

    }

    static void nonDividableOfTreeAndSeven() {
        //str186 zad 2
        //Напишете програма, която отпечатва на конзолата числата от 1 до N,
        //които не се делят на 3 и 7. Числото N се чете от стандартния вход.
        Scanner input = new Scanner(System.in);
        System.out.println("insert number");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            if (!(i % 3 == 0) & !(i % 7 == 0)) {
                System.out.printf(" %d\n ", i);
            }
        }
    }

    static void biggestAndSmallestFromInsertedInt() {
        //str186 zad 2
        //        Напишете програма, която чете от конзолата поредица от цели числа и
        //        отпечатва най-малкото и най-голямото от тях.
        Scanner input = new Scanner(System.in);
        System.out.println();

        System.out.println("how many numbers you want to insert: ");
        int numbers = input.nextInt();

        int smallest = Integer.MAX_VALUE;
        int biggest = 0;
        int[] arr = new int[numbers];

        for (int i = 0; i < numbers; i++) {
            System.out.printf("insert number %d: ", i + 1);
            arr[i] = input.nextInt();
            if (arr[i] > biggest) {
                biggest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.printf("smallest number is %d and the biggest is %d . ", smallest, biggest);
    }

    /**
     * 4. Напишете програма, която отпечатва всички възможни карти от
     * стандартно тесте без джокери (имаме 52 карти: 4 бои по 13 карти).
     * Номерирайте картите от 2 до 14 (тези числа ще съответстват на картите
     * от 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A). Номерирайте боите от 1 до 4 (1 -
     * спатия, 2 – каро, 3 – купа, 4 – пика). Сега вече можете да завъртите 2
     * вложени цикъла и да отпечатате всяка от картите.
     */
    static void allCardsWihtoutJoker() {

        for (int color = 1; color <= 4; color++) {
            for (int cardNumber = 2; cardNumber <= 14; cardNumber++) {
                //System.out.printf("karta s boq %d  i nomer %d \n",color, cardNumber);
                switch (color) {
                    case 1: {
                        switch (cardNumber) {
                            case 2, 3, 4, 5, 6, 7, 8, 9, 10: {
                                System.out.printf(" (%d Spatiq) \n", cardNumber);
                            }
                            break;

                            case 11: {
                                System.out.println("Vale Spatiq");
                            }
                            break;

                            case 12: {
                                System.out.println("Dama Spatiq");
                            }
                            break;

                            case 13: {
                                System.out.println("Pop Spatiq ");
                            }
                            break;

                            case 14: {
                                System.out.println("Aso Spatiq");
                            }
                            break;
                        }
                    }
                    break;
                    case 2: {
                        switch (cardNumber) {
                            case 2, 3, 4, 5, 6, 7, 8, 9, 10: {
                                System.out.printf(" (%d Karo )\n", cardNumber);
                            }
                            break;

                            case 11: {
                                System.out.println("Vale Karo");
                            }
                            break;

                            case 12: {
                                System.out.println("Dama Karo");
                            }
                            break;

                            case 13: {
                                System.out.println("Pop Karo ");
                            }
                            break;

                            case 14: {
                                System.out.println("Aso Karo");
                            }
                            break;
                        }
                    }
                    break;
                    case 3: {
                        switch (cardNumber) {
                            case 2, 3, 4, 5, 6, 7, 8, 9, 10: {
                                System.out.printf(" (%d Kupa) \n", cardNumber);
                            }
                            break;

                            case 11: {
                                System.out.println("Vale Kupa");
                            }
                            break;

                            case 12: {
                                System.out.println("Dama Kupa");
                            }
                            break;

                            case 13: {
                                System.out.println("Pop Kupa ");
                            }
                            break;

                            case 14: {
                                System.out.println("Aso Kupa");
                            }
                            break;
                        }
                    }
                    break;
                    case 4: {
                        switch (cardNumber) {
                            case 2, 3, 4, 5, 6, 7, 8, 9, 10: {
                                System.out.printf(" (%d Pika) \n", cardNumber);
                            }
                            break;

                            case 11: {
                                System.out.println("Vale Pika");
                            }
                            break;

                            case 12: {
                                System.out.println("Dama Pika");
                            }
                            break;

                            case 13: {
                                System.out.println("Pop Pika ");
                            }
                            break;

                            case 14: {
                                System.out.println("Aso Pika");
                            }
                            break;
                        }
                    }
                    break;
                }
            }
        }
    }

    /**
     * Принтира на екрана N брой числа от редицата на фибоначи.
     */
    static void fibonachi() {
        //        Напишете програма, която чете от конзолата числото N и отпечатва
        //        сумата на първите N члена от редицата на Фибоначи: 0, 1, 1, 2, 3, 5, 8,
        //                13, 21, 34, 55, 89, 144, 233, 377, ...
        int n1 = 0, n2 = 1, n3, i, count = 10;
        System.out.print(n1 + " " + n2);//printing 0 and 1

        //loop starts from 2 because 0 and 1 are already printed
        for (i = 2; i < count; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }

    /**
     * 6. Напишете програма, която пресмята N!/K! за дадени N и K (1<K<N).
     * Умножете числата от K+1 до N.
     */
    static void factoriel() {

        Scanner inp = new Scanner(System.in);
        System.out.println("Insert 2 numbers : ");
        System.out.println("First number: ");
        int first = 0;
        do {
            first = inp.nextInt();
        } while (first <= 1);

        System.out.println("Second number: ");
        int second = 0;
        do {
            second = inp.nextInt();
        } while (second < 1 & second != first);

        if (first > second) {
            int temp = first;
            first = second;
            second = temp;
        }

        int number = 1;
        for (int count = first; count <= second; count++) {
            number *= count;
            System.out.println(number);
        }
    }

    /**
     * 10. Напишете програма, която чете от конзолата положително цяло число N
     * (N < 20) и отпечатва матрица с числа като на фигурата по-долу:
     */
    static void printMatrix() {

        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf(" %d ", i + j);
            }
            System.out.println();
        }
    }

    /**
     * Въвеждаме едно число и го преобразува от 10тична в 2ична бройна система и принтира на екрана.
     * <p>
     * 12. Напишете програма, която преобразува дадено число от десетична в
     * двоична бройна система.
     */
    static void decimalToBinary() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Insert number : ");
        int temp = 0, temp2 = 0, n = inp.nextInt();

        do {
            System.out.println(n % 2);
            n = n / 2;
        } while (n > 0);
    }

    /**
     * 13. Напишете програма, която преобразува дадено число от двоична в
     * десетична бройна система.
     * Преобразуване на двоично число в десетично използвайки Integer.parseInt()
     */
    static int binaryToDecimal(String binary) {

        int decimal = Integer.parseInt(binary, 2);
        return decimal;

        //            String binaryNumber = "1011"; // Примерно двоично число
        //            int decimalNumber = binaryToDecimal(binaryNumber);
        //            System.out.println("Десетичното число е: " + decimalNumber);
    }

    /**14. Напишете програма, която преобразува дадено число от десетична в
     шестнайсетична бройна система.
     15. Напишете програма, която преобразува дадено число от шестнайсе
     тична в десетична бройна система.*/


    /**
     * Извежда на екрана 5 рандом числа в интервал от 0 до колкото въведем.
     */
    static void printRandomNumbers() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Insert number : ");
        int n = inp.nextInt();
        Random rand = new Random();
        for (int i = 1; i <= 5; i++) {
            int number = rand.nextInt(n);
            System.out.println(number);
        }
    }

    //16. Напишете програма, която по дадено число N отпечатва случайно число
    //    между 1 и N.
    public static void main(String[] args) {
        printRandomNumbers();
    }
}
