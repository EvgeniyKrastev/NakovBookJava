package SolidPrinciples.Tasks.Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

class LibraryManager {
    static List<Book> books = new ArrayList<>();

    static void addBook(Book book){
        books.add(book);
    }

    static void lendBook(Reader reader, Book book){
        if(reader.currentBooks.size()<reader.limitOfBooks
                & !reader.currentBooks.contains(book)){
            reader.currentBooks.add(book);
            System.out.println(book.Title + " Added successfully! ");
        }else{
            System.out.println(reader.Name + " has reached the limit of books!");
            throw new ArrayIndexOutOfBoundsException
                    (reader.Name + "Limit of books reached");
        }
    }

    //Добавете метод за връщане на книга и проверка дали тя е била заета от читателя.
    static void returnBook(Reader reader, Book book){
        if(reader.currentBooks.contains(book)){
            reader.currentBooks.remove(book);
            System.out.println(book.Title + " Returned successfully! ");
        }else{
            System.out.println(reader.Name+ "dont have this book" + book.getTitle());
            throw new NoSuchElementException();
        }
    }

    static void searchForBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Въведете 1 за търсене по заглавие или 2 за търсене по автор:");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Поглъщане на новия ред след число

        if (choice == 1) {
            System.out.println("Въведете заглавие на книгата:");
            String titleToSearch = scanner.nextLine();

            boolean found = false;
            for (Book book : books) {
                if (book.getTitle().trim().equalsIgnoreCase(titleToSearch.trim())) {
                    System.out.println("Намерена книга: " + book.getTitle() + " от " + book.getAuthor());
                    found = true;
                }
            }

            if (!found) {
                System.out.println("Не е намерена книга със заглавие \"" + titleToSearch + "\".");
            }
        } else if (choice == 2) {
            System.out.println("Въведете име на автор:");
            String authorToSearch = scanner.nextLine();

            boolean found = false;
            for (Book book : books) {
                if (book.getAuthor().trim().equalsIgnoreCase(authorToSearch.trim())) {
                    System.out.println("Намерена книга: " + book.getTitle() + " от " + book.getAuthor());
                    found = true;
                }
            }

            if (!found) {
                System.out.println("Не е намерена книга от автор \"" + authorToSearch + "\".");
            }
        } else {
            System.out.println("Невалиден избор. Опитайте отново.");
            throw new IllegalArgumentException("Невалиден избор за търсене");
        }
    }

    public static void main(String[] args) {

        // Добавете книги в библиотеката (физически и електронни).
        addBook(new Book("The three questions", "Jorge Bucay"));
        addBook(new PhysicalBook("The art of communicating","Jim Stowal","3 column, Shelf 4"));
        addBook(new EBook("Technical manual Ford", "Ford Company", "ford.com"));
        addBook(new AudioBook("Mathematica for 9th grade", "Archimed",
                23));

        //Създайте читател с лимит от 2 книги.
        Reader evgo = new Reader("Evgo", books.get(0));
        Reader joro = new Reader("Joro", books.get(1));
        Reader ivo = new Reader("Ivo", books.get(3));

        //Читателят заема 2 книги. Опитайте да заемете трета книга и обработете изключението.

            //lendBook(evgo,books.get(2));

        //Върнете книга и заемете друга.

        // tuk raboti kato e books.get(0) a ako e evgo.contains.get(0) dava gre6ka
        returnBook(evgo, books.get(0));

        lendBook(evgo, books.get(1));

        //Разширение на задачата:
        // 1. Добавете функция за търсене на книга по автор или заглавие.

        searchForBook();
        // 2. Реализирайте логика за различно време на заемане на физически
        // и електронни книги.
        // 3. Позволете добавяне на нов тип книга като "специална колекция",
        // която изисква специално разрешение за заемане.

    }
}
