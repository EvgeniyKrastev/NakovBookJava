package SolidPrinciples.Tasks.Task2;

public class Book implements BookAttributes{
    String Title;
    String Author;

     Book(String title, String author) {
        this.Title = title;
        this.Author = author;
    }

    @Override
    public String getAuthor() {
        return this.Author;
    }

    @Override
    public String getTitle() {
        return this.Title;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    public void setAuthor(String author) {
        this.Author = author;
    }
}
