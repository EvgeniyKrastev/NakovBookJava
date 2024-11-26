package Chapter7Arrays;

import Algorithms.Sorting.MergeSort;
import Algorithms.Sorting.QuickSort;
import Algorithms.Sorting.SelectionSort;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Chapter7Arrays {

    static void reverseArrayExample() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        // int[] arraySecond = {5,6,7,8,9,1};// prosto po sukrateno izpiswane
        int[] reversed = new int[array.length];

        for (int index = 0; index < array.length; index++) {
            reversed[array.length - index - 1] = array[index];
        }
        System.out.println(Arrays.toString(reversed));
    }

    static void isArraySimetric() {
        int[] arrayNonSimetric = new int[]{1, 2, 3, 4, 5, 6};
        int[] arraySimetric = new int[]{1, 2, 3, 3, 2, 1};
        boolean symmetric = true;

        for (int i = 0; i < ((arraySimetric.length + 1) / 2); i++) {
            if (arraySimetric[i] != arraySimetric[arraySimetric.length - i - 1]) {
                symmetric = false;
            }
        }

        System.out.printf("Symetric ? %s", symmetric);
    }

    static void printArray(int[] arr) {
        int[] arrayNonSimetric = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(arrayNonSimetric));
    }

    static void mnogomerenArrayPrint() {
        int[][] mnogomeren = {
                {1, 2, 3, 4}, // row 0 values
                {5, 6, 7, 8}, // row 1 values
        };
        System.out.println(mnogomeren.length);//2 length of the ednomeren masiv

        for (int row = 0; row < mnogomeren.length; row++) {
            for (int col = 0; col < mnogomeren[0].length; col++) {
                System.out.printf("%d ", mnogomeren[row][col]);
            }
            System.out.println();
        }
    }

    static void maxPlatformTheSmallerMatrix() {
        int[][] matrix = {
                {0, 2, 4, 0, 9, 5},
                {7, 1, 3, 3, 2, 1},
                {1, 3, 9, 8, 5, 6},
                {4, 6, 7, 9, 1, 0}
        };

        int bestSum = Integer.MIN_VALUE;
        int bestRow = 0;
        int bestCol = 0;

        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[0].length - 1; col++) {
                int sum = matrix[row][col] + matrix[row][col + 1]
                        + matrix[row + 1][col] + matrix[row + 1][col + 1];
                if (sum > bestSum) {
                    bestSum = sum;
                    bestRow = row;
                    bestCol = col;
                }
            }
        }
        System.out.println("best platform is:");
        System.out.printf("%d %d \n", matrix[bestRow][bestCol],
                matrix[bestRow][bestCol + 1]);
        System.out.printf("%d %d \n", matrix[bestRow + 1][bestCol],
                matrix[bestRow + 1][bestCol + 1]);
        System.out.printf("The maximal sum is: %d%n", bestSum);

    }

    //---------------------- zadachi ot glavata

    static void zad1ArrayEveryIndexMultipliedBy5() {
//        1. Да се напише програма, която създава масив с 20 елемента от
//        целочислен тип и инициализира всеки от елементите със стойност равна
//        на индекса на елемента умножен по 5. Елементите на масива да се
//        изведат на конзолата.

        System.out.println("Insert length of the array: ");
        Scanner input = new Scanner(System.in);
        int arrLength = input.nextInt();

        int[] array = new int[arrLength];

        for (int i = 0; i < array.length; i++) {
            array[i] = i * 5;
        }

        for (int element : array) {
            System.out.printf(" %d,", element);
        }

    }

    static void zad2AreTwoArraysEqual() {
//        2. Да се напише програма, която чете два масива от конзолата и проверява
//        дали са еднакви.
        System.out.println("Insert length of the array: ");
        Scanner input = new Scanner(System.in);
        boolean isEqual = true;

        System.out.println("Insert size of array 1: ");
        int lengthOne = input.nextInt();
        int[] arrOne = new int[lengthOne];
        for (int count = 0; count < lengthOne; count++) {
            System.out.printf("Insert %d element ", count + 1);
            arrOne[count] = input.nextInt();
        }

        System.out.println("Insert size of array 2: ");
        int lengthTwo = input.nextInt();
        int[] arrTwo = new int[lengthOne];

        for (int count = 0; count < lengthTwo; count++) {
            System.out.printf("Insert %d element ", count + 1);
            arrTwo[count] = input.nextInt();
        }

        if (arrOne.length != arrTwo.length) {
            isEqual = false;
        }

        for (int count = 0; count < lengthTwo; count++) {
            if (arrOne[count] != arrTwo[count]) {
                isEqual = false;
            }
        }

        if (isEqual) {
            System.out.println("Arrays are equal! \n");
        } else {
            System.out.println("Arrays are not equal size or content! \n");
        }

    }

    // ne e re6ena
    static void zad3CompareTwoCharArrays() {
//        3. Да се напише програма, която сравнява два масива от тип char
//        лексикографски (буква по буква) и проверява кой от двата е по-рано в
//        лексикографската подредба.

//        При лексикографската наредба символите се сравняват един по един
//        като се започне от най-левия. При несъвпадащи символи по-рано е
//        масивът, чийто текущ символ е по-рано в азбуката. При съвпадение се
//        продължава със следващия символ вдясно. Ако се стигне до края на
//        единия масив, по-краткият е лексикографски по-рано.
//                Реализирайте цикъл, който сравнява буквите в масивите на позиции от
//        0 до дължината на по-късия масив -1, една по една докато намери
//        разлика. Ако бъде намерена разлика, е ясно кой масив е по-рано
//        лексикографски. Ако разлика не бъде намерена, по-късият масив е по
//        рано лексикографски. Ако масивите съвпадат, никой не от тях е лекси
//        кографски по-рано.


        char[] array1 = {'a', 'b', 'c'};
        char[] array2 = {'a', 'b', 'd'};

//        System.out.println( Arrays.toString(array1)  +" "+ array1[2] + " "+ array1[1] + " "+ array1[0]); //[a, b, c] c b a
//        System.out.println(array1); // abc

        int minLength = Math.min(array1.length, array2.length);

        // Цикъл за сравнение на символите един по един
        for (int i = 0; i < minLength; i++) {
            if (array1[i] < array2[i]) {
                System.out.println("Масивът array1 е по-рано в лексикографската подредба.");
                return;
            } else if (array1[i] > array2[i]) {
                System.out.println("Масивът array2 е по-рано в лексикографската подредба.");
                return;
            }
        }

        // Ако символите съвпадат до дължината на по-краткия масив, проверяваме дължините
        if (array1.length < array2.length) {
            System.out.println("Масивът array1 е по-рано в лексикографската подредба.");
        } else if (array1.length > array2.length) {
            System.out.println("Масивът array2 е по-рано в лексикографската подредба.");
        } else {
            System.out.println("Двата масива са равни лексикографски.");
        }

    }

    static void zad3v2() {
        char[] array1 = {'a', 'b', 'c'};
        char[] array2 = {'a', 'b', 'd'};

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > array2[i]) {
                System.out.println("Arrays are lexical to equal.");
            }
        }
    }

    static void zad4BestColumnFromSameElements() {
//        4. Напишете програма, която намира максималната редица от еднакви
//        елементи в масив. Пример: {2, 1, 1, 2, 3, 3, 2, 2, 2, 1}  {2, 2, 2}.
//        4. Сканирайте масива отляво надясно и във всеки един момент пазете в
//        една променлива последните колко позиции (до текущата включително)
//        има еднакви стойности. Пазете най-добрия старт и най-добрата
//        дължина за момента в отделни две променливи.

        int[] arr = {2, 1, 1, 2, 3, 3, 2, 2, 2, 1};

        // Променливи за най-добра редица
        int bestStart = 0;
        int bestLength = 1;

        // Променливи за текуща редица
        int currentStart = 0;
        int currentLength = 1;

        // Обхождане на масива
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                // Увеличаваме текущата редица
                currentLength++;
            } else {
                // Проверка дали текущата редица е най-дългата
                if (currentLength > bestLength) {
                    bestLength = currentLength;
                    bestStart = currentStart;
                }

                // Нулираме текущата редица
                currentStart = i;
                currentLength = 1;
            }
        }

        // Последна проверка след края на цикъла
        if (currentLength > bestLength) {
            bestLength = currentLength;
            bestStart = currentStart;
        }

        // Принтиране на резултата
        System.out.println("Най-дългата редица от еднакви елементи: {");
        for (int i = bestStart; i < bestStart + bestLength; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println("}");

    }

    static void zad5BestColumnFromIncreasingElements() {
//        5. Напишете програма, която намира максималната редица от нарастващи
//        елементи в масив. Пример: {3, 2, 3, 4, 2, 2, 4}  {2, 3, 4}.
//        Сканирайте масива отляво надясно и във всеки един момент пазете в
//        променлива колко елемента има в нарастващ ред, които завършват с
//        текущия елемент. Пазете най-добрия старт и най-добрата дължина за
//        момента в отделни две променливи.

        int[] arr = {3, 2, 3, 4, 2, 2, 4};

        // Променливи за най-добра редица
        int bestStart = 0;
        int bestLength = 1;

        // Променливи за текуща редица
        int currentStart = 0;
        int currentLength = 1;

        // Обхождане на масива
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] + 1 == arr[i]) {
                // Увеличаваме текущата редица
                currentLength++;
            } else {
                // Проверка дали текущата редица е най-дългата
                if (currentLength > bestLength) {
                    bestLength = currentLength;
                    bestStart = currentStart;
                }

                // Нулираме текущата редица
                currentStart = i;
                currentLength = 1;
            }
        }

        // Последна проверка след края на цикъла
        if (currentLength > bestLength) {
            bestLength = currentLength;
            bestStart = currentStart;
        }

        // Принтиране на резултата
        System.out.println("Най-дългата редица от нарастващи елементи: {");
        for (int i = bestStart; i < bestStart + bestLength; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println("}");
    }

    static void zad6ArraySortedShowsBiggestElements() {
//                6. Да се напише програма, която чете от конзолата две цели числа N и K,
//                и масив от N елемента. Да се намерят тези K елемента, които имат
//                максимална сума.
//                Сортирайте масива в нарастващ ред и вземете от него последните K
//                елемента.

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Колко от най големите числа да се покажат:");
        int a = input.nextInt();
        System.out.println("Въведете колко да е броя елементи в масива от 10 до 20:");
        int b = 0;
        do {
            b = input.nextInt();
        } while (b < 10 | b > 20);

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        int[] arr = new int[b];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(b);
        }

        System.out.print("Generated array:");
        for (int i : arr) {
            System.out.print(" " + arr[i] + " ");
        }

        //bubble sort
        for (int i = 1; i < arr.length; i++) {
            for (int j = arr.length - 1; j >= i; j--) {
                if (arr[j - 1] > arr[j]) {
                    int x = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = x;
                }
            }
        }
        System.out.println("");
        System.out.printf("Last %d numbers", b);
        for (int i = arr.length - b; i < arr.length; i++) {
            System.out.print(" " + arr[i] + " ");
        }
    }

    static void zad7SortWithSelectionSort() {
//        7. Сортиране на масив означава да подредим елементите му в нарастващ
//        (намаляващ) ред. Напишете програма, която сортира масив. Да се
//        използва алгоритъма "Selection sort".
//                Потърсете в Интернет информация за алгоритъма "Selection sort" и
//        негови реализации.
        int[] arr = {10, 5, 12, 10, 3, 4, 5, 7, 33, 22, 1, 5, 7, 1, 5};

        //Algorithms.SelectionSort.sort(arr);
        //Algorithms.SelectionSort.printArray(arr);

        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }

        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();

    }

    static void zad8MostCommonElement() {
//        8. Напишете програма, която намира най-често срещания елемент в масив.
//        Пример: {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3}  4 (5 пъти).
//        Ако сортирате масива, еднаквите му елементи ще бъдат един до друг.
//                Така ако го сканирате отляво надясно и преброите всяка група еднакви
//        елементи от колко елемента се състои, можете да намерите и най
//        голямата група. Тя съдържа най-често срещания елемент.

        int[] arr = {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3};

        SelectionSort.sort(arr);

        int[] groups = new int[arr.length];

        for (int i = arr[0]; i < arr.length; i++) {
            groups[i] = 0;
        }

        for (int i = arr[0]; i < arr.length; i++) {
            groups[arr[i]]++;
        }


        for (int i = arr[0]; i < arr.length; i++) {
            System.out.println("Element " + i + " is  " + groups[i] + " times encountered!");
        }

    }

    static void zad9NumbersSumOfInsertedNumber() {
//        9. Да се напише програма, която намира последователност от числа в
//        масив, които имат сума равна на число, въведено от конзолата (ако има
//        такава). Пример: {4, 3, 1, 4, 2, 5, 8}, S=11  {4, 2, 5}.
//        С два вложени цикъла можете да намерите сумата на всички редици.
//                Единият цикъл ще бележи стартовия елемент, от който започваме да
//        сумираме, а другият – броя сумирани елементи.

        System.out.println("Insert number that can be sum of other numners: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int[] arr = {4, 3, 1, 4, 2, 5, 8};
        boolean found = false;

        // Обхождаме всички възможни стартови индекси
        for (int start = 0; start < arr.length; start++) {
            int sum = 0;
            // Добавяме елементите, започвайки от текущия стартов индекс
            for (int end = start; end < arr.length; end++) {
                sum += arr[end];

                if (number == sum) {
                    System.out.print("Намерена е последователност: { ");
                    for (int i = start; i < end; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.print(" }");
                    found = true;
                    break;// Прекратяваме вътрешния цикъл, след като намерим последователността
                }
            }
            // Ако намерим поне една последователност, прекратяваме външния цикъл
            if (found) {
                break;
            }
        }
        if (!found) {
            System.out.println("Не е намерена последователност със сума равна на " + number);
        }
    }

    static void zad10MatrixWithNumbersExampleA() {
//        10. Напишете програма, която създава следните квадратни матрици и ги
//        извежда на конзолата във форматиран вид. Размерът на матриците се
//        въвежда от конзолата. Пример за (4,4):
//        Помислете за подходящи начини за итерация върху масивите с два
//        вложени цикъла.

        int counter = 0;
        for (int i = 1; i <= 4; i++) {
            counter = i;
            for (int j = 1; j <= 4; j++) {
                System.out.print(counter + " ");
                counter += 4;
            }
            System.out.println();
        }
    }

    static void zad10MatrixWithNumbersExampleABCDGPT() {
//        10. Напишете програма, която създава следните квадратни матрици и ги
//        извежда на конзолата във форматиран вид. Размерът на матриците се
//        въвежда от конзолата. Пример за (4,4):
//        Помислете за подходящи начини за итерация върху масивите с два
//        вложени цикъла.
        // Въвеждане на размерността на матрицата

        int n = 4;

//        Матрица а):
//        1   5   9  13
//        2   6  10  14
//        3   7  11  15
//        4   8  12  16

        System.out.println("Матрица а):");
        int[][] matrixA = new int[n][n];
        int valueA = 1;
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                matrixA[row][col] = valueA++;
            }
        }
        matrixPrint(matrixA);

//        Матрица b):
//        1   8   9  16
//        2   7  10  15
//        3   6  11  14
//        4   5  12  13
        System.out.println("Матрица b):");
        int[][] matrixB = new int[n][n];
        int valueB = 1;
        for (int col = 0; col < n; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < n; row++) {
                    matrixB[row][col] = valueB++;
                }
            } else {
                for (int row = n - 1; row >= 0; row--) {
                    matrixB[row][col] = valueB++;
                }
            }
        }
        matrixPrint(matrixB);

//        Матрица c):
//        1   2   4   7
//        3   5   8  11
//        6   9  12  14
//        10  13  15  16
        System.out.println("Матрица c):");
        int[][] matrixC = new int[n][n];
        int valueC = 1;
        for (int diag = 0; diag < 2 * n - 1; diag++) {
            int row = Math.max(0, diag - n + 1);
            int col = Math.min(diag, n - 1);
            while (row < n && col >= 0) {
                matrixC[row++][col--] = valueC++;
            }
        }
        matrixPrint(matrixC);

//        Матрица d):
//        1   2   3   4
//        12  13  14   5
//        11  16  15   6
//        10   9   8   7
        System.out.println("Матрица d):");
        int[][] matrixD = new int[n][n];
        int valueD = 1;
        int minRow = 0, maxRow = n - 1;
        int minCol = 0, maxCol = n - 1;

        while (valueD <= n * n) {
            for (int i = minCol; i <= maxCol; i++) {
                matrixD[minRow][i] = valueD++;
            }
            minRow++;
            for (int i = minRow; i <= maxRow; i++) {
                matrixD[i][maxCol] = valueD++;
            }
            maxCol--;
            for (int i = maxCol; i >= minCol; i--) {
                matrixD[maxRow][i] = valueD++;
            }
            maxRow--;
            for (int i = maxRow; i >= minRow; i--) {
                matrixD[i][minCol] = valueD++;
            }
            minCol++;
        }
        matrixPrint(matrixD);
    }

    static void matrixPrint(int matrix[][]) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.printf("%4d", element);
            }
            System.out.println();
        }
        System.out.println();
    }

    // Да довърша Да се намери подматрицата с размер (3,3), която има максимална сума. ----------

    static void zad11SquareMatrixWithSmallerMatrixInside() {
//        11. Да се напише програма, която създава правоъгълна матрица с размер
//                (n, m). Размерността и елементите на матрицата да се четат от
//        конзолата. Да се намери подматрицата с размер (3,3), която има
//        максимална сума.
//        Модифицирайте примера за максимална площадка с размер 2 x 2.

        Scanner inp = new Scanner(System.in);

        System.out.println("Insert number for columns: ");
        int cols = inp.nextInt();
        System.out.println("Insert number for rows: ");
        int rows = inp.nextInt();

        int[][] squareMatrix = new int[rows][cols];

        Random rand = new Random();

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                squareMatrix[row][col] = rand.nextInt(10);
            }
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(squareMatrix[row][col] + " ");
            }
            System.out.println();
        }

        int bestSum = Integer.MIN_VALUE;
        int bestRow = 0;
        int bestCol = 0;

        for (int row = 0; row < squareMatrix.length - 1; row++) {
            for (int col = 0; col < squareMatrix[0].length - 1; col++) {
                int sum = squareMatrix[row][col] + squareMatrix[row][col + 1]
                        + squareMatrix[row + 1][col] + squareMatrix[row + 1][col + 1];
                if (sum > bestSum) {
                    bestSum = sum;
                    bestRow = row;
                    bestCol = col;
                }
            }
        }
        System.out.println("best platform is:");
        System.out.printf("%d %d \n", squareMatrix[bestRow][bestCol],
                squareMatrix[bestRow][bestCol + 1]);
        System.out.printf("%d %d \n", squareMatrix[bestRow + 1][bestCol],
                squareMatrix[bestRow + 1][bestCol + 1]);
        System.out.printf("The maximal sum is: %d%n", bestSum);

    }

    static void zad12ArrayOfSymbolsTranslatedToTheirNumbers() {
//        12. Да се напише програма, която създава масив с всички букви от
//        латинската азбука. Да се даде възможност на потребител да въвежда
//        дума от конзолата и в резултат да се извеждат индексите на буквите от
//        думата.
//        12. Задачата можем да решим с масив и два вложени for цикъла (по буквите
//                на думата и по масива за всяка буква). Задачата има и хитро решение
//        без масив: индексът на дадена буква ch от азбуката може да се сметне
//        чрез израза: (int) ch – (int) 'A'.

        int ch;

        System.out.println("Enter some text:");
        while (true) {
            try {
                if (!((ch = System.in.read()) != '\n')) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println((char) ch + " symbol has number " + (int) ch);
        }
        // System.out.println((int) 'a');
    }

    static int binarySearch(int array[], int x, int low, int high) {

        // Repeat until the pointers low and high meet each other
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (x == array[mid])
                return mid;

            if (x > array[mid])
                low = mid + 1;

            else
                high = mid - 1;
        }

        return -1;
    }

    static void zad13BinarySearchInSortedArray() {
//        https://www.geeksforgeeks.org/binary-search/?ref=header_outind
//        13. Да се реализира двоично търсене (binary search) в сортиран
//        целочислен масив.
//        13. Потърсете в Интернет информация за алгоритъма "binary search". Какво
//        трябва да е изпълнено, за да използваме този алгоритъм?

        int[] sortedArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int n = sortedArray.length;
        int x = 4;
        int result = binarySearch(sortedArray, x, 0, n - 1);
        if (result == -1)
            System.out.println("Not found");
        else
            System.out.println("Element found at index " + result);
    }

    static void zad14MergeSort() {
//        https://www.geeksforgeeks.org/merge-sort/?ref=header_outind
//        14. Напишете програма, която сортира целочислен масив по алгоритъма
//        "merge sort".
//        Потърсете в интернет информация за алгоритъма "merge sort" и негови
//        реализации.
        //Merge sort is a popular sorting algorithm known for its efficiency and stability.
        // It follows the divide-and-conquer approach to sort a given array of elements.
        Algorithms.Sorting.MergeSort merge = new MergeSort();
        int arr[] = {12, 11, 13, 5, 6, 7};

        System.out.println("Given array is");
        merge.printArray(arr);

        merge.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array is");
        merge.printArray(arr);

    }

    static void zad15QuickSort() {
//        https://www.geeksforgeeks.org/quick-sort-algorithm/?ref=header_outind
//        Advantages of Quick Sort:
//        It is a divide-and-conquer algorithm that makes it easier to solve problems.
//        It is efficient on large data sets.
//                It has a low overhead, as it only requires a small amount of memory to function.
//        It is Cache Friendly as we work on the same array to sort and do not copy data to any auxiliary array.
//                Fastest general purpose algorithm for large data when stability is not required.
//                It is tail recursive and hence all the tail call optimization can be done.
//                Disadvantages of Quick Sort:
//        It has a worst-case time complexity of O(N 2 ), which occurs when the pivot is chosen poorly.
//        It is not a good choice for small data sets.
//                It is not a stable sort, meaning that if two elements have the same key, their relative order will not be preserved
//        in the sorted output in case of quick sort, because here we are swapping elements according to the pivot’s position
//        (without considering their original positions).
//        Applications of Quick Sort
//
//        "The DSA course helped me a lot in clearing the interview rounds. It was really very helpful in setting a strong
//        foundation for my problem-solving skills. Really a great investment, the passion Sandeep sir has towards DSA/teaching
//        is what made the huge difference." - Gaurav | Placed at Amazon
//
//        Before you move on to the world of development, master the fundamentals of DSA on which
//        every advanced algorithm is built upon. Choose your preferred language and start learning today:
//
//        DSA In JAVA/C++
        int[] arr = {10, 7, 8, 9, 1, 5};
        int N = arr.length;
        Algorithms.Sorting.QuickSort quick = new QuickSort();

        // Function call
        quick.quickSort(arr, 0, N - 1);
        System.out.println("Sorted array:");
        quick.printArr(arr);
    }

    static void zad16AllPrimeNumbersSieveOfEratosthenes() {
//        16. Напишете програма, която намира всички прости числа в диапазона
//        [1..10 000 000].
//        Потърсете в интернет информация за "sieve of Erathostenes".

        int n = 10000000;
        System.out.print("Following are the prime numbers ");
        System.out.println("smaller than or equal to " + n);
        Algorithms.Other.AllPrimeNumbersSieveOfEratosthenes.sieveOfEratosthenes(n);
    }

    static void zad17LargestAreaOfSameNumbersInMatrix() {
//        17. Напишете програма, която по подадена матрица намира най-голямата
//        област от еднакви числа. Под област разбираме съвкупност от съседни
//        (по ред и колона) елементи. Ето един пример, в който имаме област,
//                съставена от 13 на брой еднакви елементи със стойност 3:
//        1 3 2 2 2 4
//        3 3 3 2 4 4
//        4 3 1 2 3 3
//        4 3 1 3 3 1
//        4 3 3 3 1 1
//        Тази задача е доста по-трудна от останалите. Може да използвате
//        алгоритми за обхождане на граф, известни с названията "DFS" (Depth
//        first-search) или "BFS" (Breadth-first-search). Потърсете информация и
//        примери за тях в Интернет.
//        DFS -  https://www.geeksforgeeks.org/depth-first-search-or-dfs-for-a-graph/?ref=header_outind
//        BFS - https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/?ref=header_outind

    }

    public static void main(String[] args) {

    }
}