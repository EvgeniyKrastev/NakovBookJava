package Chapter10RecursionFibonachiLabirinth;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Chapter10RecursionFibonachiLabirinth {
    //-------------------------------------------------- fibonachi
    static long unnEffectiveFib(int n) {
        // neefektiven variant i mnogo vreme za presmqtane
        // zadavame koe po red 4islo na fibona4i iskame da vurne primerno 8toto i vra6ta 21
        if (n <= 2)
            return 1;
        return unnEffectiveFib(n - 1) + unnEffectiveFib(n - 2);
    }
    //--------------------------------------------------

    static long[] numbers;

    static long effectiveFib(int n) {
        //efektiven fibonachi
        if (0 == numbers[n]) {
            numbers[n] = effectiveFib(n - 1) + effectiveFib(n - 2);
        }
        return numbers[n];
    }

    static void primerFibonachiEffective() {
        Scanner input = new Scanner(System.in);
        System.out.print("n = ");
        int n = input.nextInt();

        numbers = new long[n + 2];
        numbers[1] = 1;
        numbers[2] = 1;

        long result = effectiveFib(n);
        System.out.printf("F%d = %d%n", n, result);
        input.close();
    }

    private static char[][] lab = {
            {' ', ' ', ' ', '*', ' ', ' ', ' '},
            {'*', '*', ' ', '*', ' ', '*', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', '*', '*', '*', '*', '*', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', 'е'},
    };
    private static char[] path =
            new char[lab[0].length * lab.length];
    private static int position = 0;

    // primer
    private static void findPath(int row, int col, char direction) {
        if ((col < 0) || (row < 0) ||
                (col >= lab[0].length) || (row >= lab.length)) {
            // We are out of the labyrinth
            return;
        }

        // Append the direction to the path
        path[position] = direction;
        position++;

        // Check if we have found the exit
        if (lab[row][col] == 'е') {
            printPath(path, 1, position - 1);
        }

        if (lab[row][col] == ' ') {
            // The current cell is free. Mark it as visited
            lab[row][col] = 's';

            // Invoke recursion the explore all possible directions
            findPath(row, col - 1, 'L'); // left
            findPath(row - 1, col, 'U'); // up
            findPath(row, col + 1, 'R'); // right
            findPath(row + 1, col, 'D'); // down

            // Mark back the current cell as free
            //lab[row][col] = ' '; // maham tozi red.
//            Задачата има решение, ако бъде формулирана по друг начин: да се намери
//            поне един изход от лабиринта. Тази задача е далеч по-лесна и може да се
//            реши с една много малка промяна в примерния код: при връщане от
//            рекурсията текущата позиция да не се маркира обратно като свободна.
//            Това означава да изтрием следните редове код:
//            Можем да се убедим, че след тази промяна, програмата много бързо
//            установява, ако в лабиринта няма път до изхода, а ако има много бързо
//            намира един от пътищата (произволен).
        }

        // Remove the direction from the path
        position--;
    }

    private static void printPath(
            char[] path, int startPos, int endPos) {
        System.out.print("Found path to the exit: ");
        for (int pos = startPos; pos <= endPos; pos++) {
            System.out.print(path[pos]);
        }
        System.out.println();
    }
    //------------------------------------zad1--------------------------------------------------------------------
    //        (1 1), (1 2), (1 3), (2 2), (2 3), (3 3)

    static void zad1CombinationWithKElements() {
//        1. Напишете програма, която генерира и отпечатва всички комбинации с
//        повторение на k елемента над n-елементно множество.
//                Примерен вход: n = 3
//                               к = 2
//                Примерен изход:
//        (1 1), (1 2), (1 3), (2 2), (2 3), (3 3)
//        1. Използвайте имитация на вложени цикли.
        Scanner input = new Scanner(System.in);
        System.out.println("Insert number: ");
        int number = input.nextInt();
        for (int n = 1; n <= number; n++) {
            for (int m = 1; m <= number; m++) {
                System.out.print("(" + n + ", " + m + ")");
            }
        }
    }
//------------------------------------zad2--------------------------------------------------------------------

    static void generateVariations(int n, int k, int[] current, int index) {
        // Ако дължината на текущата комбинация е k, отпечатваме я
        if (index == k) {
            printVariation(current);
            return;
        }

        // Рекурсивно добавяме елементи от 1 до n и генерираме комбинации
        for (int i = 1; i <= n; i++) {
            current[index] = i;
            generateVariations(n, k, current, index + 1);
        }
    }

    // Функция за отпечатване на вариациите в правилен формат

    static void printVariation(int[] variation) {
        System.out.print("(");
        for (int i = 0; i < variation.length; i++) {
            System.out.print(variation[i]);
            if (i < variation.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println(")");
    }

    static void zad2MnojestvoOtChisla() {
//        2. Напишете програма, която генерира всички вариации с повторение на n
//        елемента от k-ти клас.
//                Примерен вход:
//        n = 3
//        к = 2
//        Примерен изход:
//        (1 1), (1 2), (1 3), (2 1), (2 2), (2 3), (3 1), (3 2), (3 3)

        int n = 3; // Брой елементи
        int k = 2; // Клас на вариациите

        // Масив за съхранение на текущата вариация
        int[] current = new int[k];

        // Извикваме функцията за генериране на вариации
        generateVariations(n, k, current, 0);
    }

    //----------------------------------------zad3------------------------------------------------------

    static void generateCombinations(String[] strings, int k, int start, List<String> current) {
        // Ако сме избрали k елемента, отпечатваме текущото подмножество
        if (current.size() == k) {
            printCombination(current);
            return;
        }

        // Обхождаме всички елементи и рекурсивно добавяме към текущото подмножество
        for (int i = start; i < strings.length; i++) {
            current.add(strings[i]);
            generateCombinations(strings, k, i + 1, current);
            current.remove(current.size() - 1); // Премахваме последния добавен елемент
        }
    }

    // Функция за отпечатване на текущата комбинация
    private static void printCombination(List<String> combination) {
        System.out.print("(");
        for (int i = 0; i < combination.size(); i++) {
            System.out.print(combination.get(i));
            if (i < combination.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println(")");
    }

    // mnojestvo ot znakovi nizowe

    static void zad3MultitudeOfChars() {
//        Нека е дадено множество от символни низове. Да се напише програма,
//        която генерира всички подмножества съставено от k на брой символни
//        низа, избрани измежду елементите на това множество.
//                Примерен вход:
//        strings = {'test', 'rock', 'fun'}
//        k = 2
//        Примерен изход:
//        (test rock), (test fun), (rock fun)

        // Примерни входни данни
        String[] strings = {"test", "rock", "fun"};
        int k = 2; // Дължина на подмножествата

        // Генериране на комбинации
        generateCombinations(strings, k, 0, new ArrayList<>());

    }

    //----------------------------------------zad4------------------------------------------------------

    static void generateSubsets(String[] words, int index, List<String> current) {
        // Отпечатваме текущото подмножество
        printSubset(current);

        // Обхождаме всеки елемент и рекурсивно добавяме към текущото подмножество
        for (int i = index; i < words.length; i++) {
            current.add(words[i]);                  // Добавяме елемента към текущото подмножество
            generateSubsets(words, i + 1, current); // Рекурсивно генерираме подмножества с добавения елемент
            current.remove(current.size() - 1);     // Премахваме последния добавен елемент за следващата итерация
        }
    }

    // Функция за отпечатване на текущото подмножество във форматиран вид
    private static void printSubset(List<String> subset) {
        System.out.print("(");
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i));
            if (i < subset.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println(")");
    }

    static void zad4() {
//        Напишете програма, която отпечатва всички подмножества на дадено
//        множество от думи.
//                Примерен вход:
//        words = {'test', 'rock', 'fun'}
//        Примерен изход:
//        (), (test), (rock), (fun), (test rock), (test fun),
//        (rock fun), (test rock fun)
        // Примерен вход
        String[] words = {"test", "rock", "fun"};

        // Извикване на функцията за генериране на подмножества
        generateSubsets(words, 0, new ArrayList<>());
    }

    static void zad5() {
//        Реализирайте алгоритъма "сортиране чрез сливане" (merge-sort). При
//        него началният масив се разделя на две равни по големина части, които
//        се сортират (чрез merge-sort) и след това двете сортирани части се
//        сливат, за да се получи целият масив в сортиран вид.
//        Applications of Merge Sort:
//        Sorting large datasets
//        External sorting (when the dataset is too large to fit in memory)
//        Inversion counting
//        Merge Sort and its variations are used in library methods of programming languages. For example its variation TimSort is used in Python, Java Android and Swift. The main reason why it is preferred to sort non-primitive types is stability which is not there in QuickSort. For example Arrays.sort in Java uses QuickSort while Collections.sort uses MergeSort.
//        It is a preferred algorithm for sorting Linked lists.
//        It can be easily parallelized as we can independently sort subarrays and then merge.
//        The merge function of merge sort to efficiently solve the problems like union and
//        https://www.geeksforgeeks.org/merge-sort/
    }

//    7. Даден е масив с цели числа и число N. Напишете програма, която
//    намира всички подмножества от числа от масива, които имат сума N.
//    8. Даден е масив с цели числа. Напишете програма, която проверява дали
//    в масива съществуват едно или повече числа, чиято сума е N.
//    9. Реализирайте BFS алгоритъма за търсене на най-кратък път в лабиринт.

    static void main(String[] args) {

    }
}
