package Chapter23TextFromHTMLSeparator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class HtmlTagRemover {
    private static final String INPUT_FILE_NAME = "Chapter23TextFromHTMLSeparator/Problem1.html";
    private static final String OUTPUT_FILE_NAME = "Chapter23TextFromHTMLSeparator/Problem1.txt";
    private static final String CHARSET = "windows-1251";

    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(
                new FileInputStream(INPUT_FILE_NAME), CHARSET);
        PrintWriter writer = new PrintWriter(
                OUTPUT_FILE_NAME, CHARSET);
        try {
            boolean inTag = false;
            StringBuilder buffer = new StringBuilder();
            while (true) {
                int nextChar = reader.read();
                if (nextChar == -1) {
                    // End of file reached
                    printBuffer(writer, buffer);
                    break;
                }
                char ch = (char) nextChar;
                if (ch == '<') {
                    if (! inTag) {
                        printBuffer(writer, buffer);
                    }
                    buffer.setLength(0);
                    inTag = true;
                } else if (ch == '>') {
                    inTag = false;
                } else {
                    // We have other character (not "<" or ">")
                    if (! inTag) {
                        buffer.append(ch);
                    }
                }
            }
        } finally {
            reader.close();
            writer.close();
        }
    }

    private static String removeAllTags(String str) {
        String strWithoutTags = str.replaceAll("<[^>]*>", "\n");
    return strWithoutTags;
 }

private static String trimNewLines(String str) {
    int start = 0;
    while (start < str.length() && str.charAt(start)=='\n') {
        start++;
    }

    int end = str.length()-1;
    while (end >= 0 && str.charAt(end)=='\n') {
        end--;
    }

    if (start > end) {
        return "";
    }

    String trimmed = str.substring(start, end+1);
    return trimmed;
}

private static String removeNewLinesWithWhiteSpace(String str) {
    while (str.indexOf("\n\n") != -1) {
        str = str.replaceAll("\n\\s+", "\n");
    }
    return str;
}

    private static void printBuffer(PrintWriter writer,
                                    StringBuilder buffer) {
        String str = buffer.toString();
        String trimmed = str.trim();
        String textOnly = removeNewLineWithWhiteSpace(trimmed);
        if (textOnly.length() != 0) {
            writer.println(textOnly);
        }
    }
    private static String removeNewLineWithWhiteSpace(String str){
        str = str.replaceAll("\n\\s+", "\n");
        return str;
    }
}

//За простота сме пропуснали обработката на грешки при четене и писане
//във файл. При възникване на изключение го изхвърляме от главния метод
//и оставяме виртуалната машина да го отпечата в конзолата.
//Входният файл чете символ по символ с класа InputStreamReader. За
//съжаление не можем да ползваме любимият ни клас Scanner, защото той
//няма метод за четене на единичен символ.
//Първоначално буферът за натрупване на текст е празен. В главния цикъл
//анализираме всеки прочетен символ. Имаме следните случаи: - Ако стигнем до края на файла, отпечатваме каквото има в буфера и
//алгоритъмът приключва. - При срещане на символ "<" (начало на таг) първо отпечатваме буфера
//        (ако установим, че преминаваме от текст към таг). След това
//зачистваме буфера и установяваме isTag = true. - При срещане на символ ">" (край на таг) установяваме isTag = false.
//        Това ще позволи следващите след тага символи да се натрупват в
//буфера. - При срещане на някой друг символ (текст или празно пространство),
//той се добава към буфера, ако сме извън таг. Ако сме в таг, символът
//се игнорира.
//Печатането на буфера се грижи да премахва празните редове в текста и да
//изчиства празното пространство в началото и в края на текста. Как точно
//        извършваме това, вече разгледахме в предходното решение на задачата,
//което се оказа грешно.