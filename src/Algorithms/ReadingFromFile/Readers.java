package Algorithms.ReadingFromFile;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Readers {

    /**
     * Methods for work with files and text
     * for Files - new file()
     */


    /**
     *
     * @param fileName we give the address of the file
     * @return string with the text from the file
     * @throws IOException
     */
    public static String zad8ReadFileScannerAndStringBuilder(String fileName) throws IOException {

        StringBuilder content = new StringBuilder();
        // Създаваме Scanner за четене на файла
        try (Scanner scanner = new Scanner(new File(fileName))) {
            // Четем файла ред по ред
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                content.append(line).append(System.lineSeparator()); // Добавяме реда и нов ред
            }
        }
        // Връщаме съдържанието като String
        return content.toString();
    }
}
