package SolidPrinciples.Tasks.Task2;

import java.util.ArrayList;
import java.util.List;

class Reader {
    String Name;
    final int limitOfBooks = 1;
    List<Book> currentBooks= new ArrayList<>();
    // ако я няма инициализацията new ArrayList дава грешка.
    // най добре е или при декларация или в конструктора да се инициализира.

    public Reader(String name, Book book) {
        this.Name = name;
        this.currentBooks.add(book);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<Book> getCurrentBooks() {
        return currentBooks;
    }

    public void setCurrentBooks(Book currentBooks) {
        this.currentBooks.add(currentBooks);
    }
}
