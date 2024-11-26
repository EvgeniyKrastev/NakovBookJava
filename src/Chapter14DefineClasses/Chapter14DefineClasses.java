package Chapter14DefineClasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintStream;
//import src.Algorithms.FixingSubtitles;

class Chapter14DefineClasses {
    //--------------------------------------- Chapter Examples ---------------------------------------------

    /**
     * Четене на файл с Scanner.
     */
    static void ex1ReadFromFileScanner() {
        File file = new File("FilesForTesting/TestTextFileChapter14.txt");
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int lineNumber = 0;
        while (fileReader.hasNextLine()) {
            lineNumber++;
            System.out.printf("Line %d: %s%n",
                    lineNumber, fileReader.nextLine());
        }
        fileReader.close();
    }

    /**
     * Записване на числа в файл. Ползваме библютеката java.io.PrintStream.
     */
    static void ex2PrintIntoFile() {
        // идва от клас java.io.PrintStream
        // Create a PrintStream instance
        PrintStream fileWriter = null;
        try {
            fileWriter = new PrintStream("FilesForTesting/numbers.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        // Loop through the numbers from 1 to 20 and write them
        for (int num = 1; num <= 20; num++) {
            fileWriter.println(num);
        }
        // Close the stream when you are done using it
        fileWriter.close();
    }

    /**
     * Брой срещания на дума във файл – пример
     */
    static void ex3NumberOfOccurrencesInFile() {
        String fileName = "sample.txt";
        Scanner fileReader = null;
        int occurrences = 0;
        String word = "Java";
        try {
            fileReader = new Scanner(new File(fileName));
            System.out.println("File " + fileName + " opened.");
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                int index = line.indexOf(word);
                while (index != -1) {
                    occurrences++;
                    index = line.indexOf(word, (index + 1));
                }
            }
        } catch (FileNotFoundException fnf) {
            System.out.println("File " + fileName + " not found.");
        } catch (NullPointerException npe) {
            System.out.println("File " + fileName + " not found.");
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
            System.out.println("Scanner closed.");
        }
        System.out.printf("The word %s occurs %d times", word, occurrences);
    }

    /**
     * primera e Algorithms.FixingSubtitles
     */
    static void ex3FixingSubtitles() {
        //primera e Algorithms.FixingSubtitles

    }

    /**
     * primera e Algorithms.FixingSubtitles
     */
    static void ex4FixingSubtitles() {
        //primera e Algorithms.FixingSubtitles

    }

    //--------------------------------------- Tasks From Chapter ---------------------------------------------

    static void zad1() {

    }

    public static void main(String[] args) {
        ex1ReadFromFileScanner();
    }
}