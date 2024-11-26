package Chapter12Exceptions;

import java.io.*;
import java.util.Scanner;
//import static com.sun.tools.javac.file.JavacFileManager.getMessage;

class Chapter12Exceptions {
    // Primeren kod koito hvurlq izklu4eniq
    /*

    static void readFileError(String fileName) {
        FileInputStream fis = new FileInputStream(fileName);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(fis));
        String tmp = null;
        while ((tmp = in.readLine()) != null) {
            System.out.println(tmp);
        }
        in.close();
        fis.close();
    }
    */

    /**
     * 1. Да се намерят всички стандартни изключения от йерархията на
     * java.io.IOException.
     * 1. Използвайте среда за разработка Eclipse и вградената възможност за
     * разглеждане на йерархии от класове. Отворете класа java.io.
     * IOException като използвате вграденото търсене на класове
     * – [Ctrl-ShiftT] и натиснете [F4], за да отворите визуализатора на йерархии.
     * intelij - ctrl + n  и ctrl + H za ierarhii
     */
    static void zad1IOException() {

    }

    /**
     * 2. Да се намерят всички стандартни изключения от йерархията на
     * java.lang.RuntimeException.
     * intelij - ctrl + n  и ctrl + H za ierarhii
     */

    static void zad2RuntimeException() {

    }

    /**
     * 3. Да се намерят методите хвърлящи изключението java.lang.
     * IllegalArgumentException и да се проучи причината за неговото
     * хвърляне.
     * 3. Използвайте среда за разработка Eclipse и възможността за търсене на
     * използванията на даден клас. Отворете класа java.lang.IllegalArgumentException,
     * позиционирайте курсора на дефиницията на
     * класа и потърсете къде се използва като натиснете [Ctrl-H]
     * Отворете класа java.io.
     * IOException като използвате вграденото търсене на класове
     * – [Ctrl-ShiftT] и натиснете [F4], за да отворите визуализатора на йерархии.
     * intelij - ctrl + n  и ctrl + H za ierarhii
     */

    static void zad3IllegalArgumentException() {

    }

    /**
     * 4. Да се намерят всички стандартни изключения от йерархията на
     * java.lang.IllegalArgumentException.
     */

    static void zad4IllegalArgumentException() {

    }

    /**5,6,7 5. Обяснете какво представляват изключенията, кога се използват и как
     се прихващат.
     6. Обяснете ситуациите, при които се използва try-finally конструкцията.
     7. Обяснете предимствата на използването на изключения.
     */

    /**
     * От примерите в учебника.
     */

    static void readFile(String fileName) {
        try {//Exceptions could be thrown below
            FileInputStream fis = new FileInputStream(fileName);
            BufferedReader in = new BufferedReader(new InputStreamReader(fis));
            String line = null;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
            fis.close();
        } catch (FileNotFoundException e) {
            // Exception handler for FileNotFoundException
            // We just inform the client that there is
            // not such file
            System.out.println("The file \"" + fileName +
                    "\" does not exist! Unable to read it.");
        } catch (IOException e) {
            // Exception handler for IOException
            e.printStackTrace();
        }
    }

    static void ReadTheCereal() {
        String path = "D:\\Documents\\университет материали\\4-та година\\1ви семестър\\" +
                "Големи данни\\Файлове\\input\\cereal.csv";
    }

    static String zad8ReadFileScanner(String fileName) throws IOException {
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

    /**
     * 8. Напишете метод, който приема като параметър име на текстов файл и
     * прочита съдържанието му и го връща като String.
     * 8. Прочетете файла ред по ред с класа java.util.Scanner и добавяйте
     * редовете в StringBuilder. Декларирайте в сигнатурата на метода, че
     * изхвърля IOException и не обработвайте никакви изключения в него.
     */

    static void zad8() {
        // readFile("D:\\Desktop\\Translate.txt");
        // zad8ReadFileScanner("D:\\Desktop\\Translate.txt");
        try {// Примерно използване на метода
            String fileContent = zad8ReadFileScanner("D:\\Desktop\\Translate.txt");
            System.out.println(fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void binaryFileReader(String fileName) throws IOException {
        try (FileInputStream fisbfr = new FileInputStream(fileName)) {
            // String fileData =  fisbfr.readAllBytes().toString();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
        }
    }

    // Метод за четене на байтове от бинарен файл

    static byte[] readFileе(String fileName) throws IOException {
        FileInputStream fis = null;
        ByteArrayOutputStream baos = null;

        try {
            fis = new FileInputStream(fileName);
            baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int bytesRead;

            // Цикъл за четене на данните
            while ((bytesRead = fis.read(buffer, 0, buffer.length)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            return baos.toByteArray();
        } finally {
            // Затваряне на потоците в try-finally блок
            if (fis != null) {
                fis.close();
            }
            if (baos != null) {
                baos.close();
            }
        }
    }

    // Метод за записване на байтове във файл
    static void writeFile(String fileName, byte[] data) throws IOException {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(fileName);
            fos.write(data);
        } finally {
            // Затваряне на потока в try-finally блок
            if (fos != null) {
                fos.close();
            }
        }
    }

    /**
     * 9. Напишете метод, който приема като параметър име на бинарен файл и
     * прочита съдържанието на файла и го връща като масив от байтове.
     * Напишете метод, който записва прочетеното съдържание в друг файл.
     * 9. Малко е вероятно да напишете коректно този метод от първи път без
     * чужда помощ. Първо прочетете в Интернет как се работи с бинарни
     * потоци. След това следвайте препоръките по-долу за четенето на
     * файла:
     * - Декларирайте в сигнатурата на метода, че изхвърля IOException и
     * не обработвайте никакви изключения в него.
     * - Използвайте за четене FileInputStream, а прочетените данни
     * записвайте в ByteArrayOutputStream.
     * - Внимавайте с метода за четене на байтове read(byte[] buffer, int
     * offset, int count). Този метод може да прочете по-малко байтове,
     * отколкото сте заявени. Колкото байта прочетете от входния поток,
     * толкова трябва да запишете. Трябва да организирате цикъл, който
     * завършва при връщане на стойност -1.
     * - Използвайте try-finally, за да затваряте потоците.
     * Записването на масив от байтове във файл е далеч по-проста задача.
     * Отворете FileOutputStream и запишете в него масива. Изхвърлете чрез
     * throws всички изключения от метода. Използвайте try-finally, за да
     * затваряте потоците.
     * Накрая тествайте с някой ZIP архив. Ако програмата ви работи некоректно,
     * ще счупите структурата на архива и ще се получава грешка при
     * отваряне
     */


    static void zad9() {
        String fileName = "input.bin"; // Име на примерния файл
        byte[] sampleData = new byte[256]; // Масив от байтове

        // Запълваме масива с примерни данни
        for (int i = 0; i < sampleData.length; i++) {
            sampleData[i] = (byte) i; // Записваме стойности от 0 до 255
        }

        // Записваме масива във файла
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            fos.write(sampleData);
            System.out.println("Примерният файл е създаден: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            String inputFile = "input.bin";
            String outputFile = "output.bin";

            // Четене на съдържанието на файла
            byte[] fileData = readFileе(inputFile);

            // Записване на съдържанието във файл
            writeFile(outputFile, fileData);

            System.out.println("Файлът е копиран успешно.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 10. Потърсете информация в Интернет и дефинирайте собствен клас за
     * изключение FileParseException. Вашето изключение трябва да съдържа
     * в себе си името на файл, който се обработва и номер на ред, в който
     * възниква изключението. Добавете подходящи конструктори за вашето
     * изключение. Напишете програма, която чете от текстов файл числа. Ако
     * при четенето се стигне до ред, който не съдържа число, хвърлете вашия
     * exception и го обработете в извикващия метод.
     * 10. Наследете класа Exception и добавете подходящ конструктор, примерно
     * FileParseException(string msg, String filename, int line). След това
     * ползвайте вашето изключение както ползвате всички други
     * изключения, които познавате. За четене на файла ползвайте FileReader
     * и от него създайте BufferedReader.
     */
    static void zad10() {
    }

    static void myTestMethod() {
        FileInputStream fip = null;
        try {
            fip = new FileInputStream("D:\\Desktop\\Transate.txt");

        } catch (FileNotFoundException ex) {
            System.out.println("File not found or is broken!");
        }
        Scanner sc = new Scanner(fip);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }

    public static void main(String[] args) {

    }
}
