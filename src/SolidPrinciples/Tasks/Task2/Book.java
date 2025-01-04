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
        return Author;
    }

    @Override
    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setAuthor(String author) {
        Author = author;
    }
}
