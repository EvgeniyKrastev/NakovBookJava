package SolidPrinciples.Tasks.Task2;

class PhysicalBook extends Book {

    String libraryShelf;

    public PhysicalBook(String title, String author, String libraryShelf) {
        super(title, author);
        this.libraryShelf = libraryShelf;
    }

    @Override
    public String getAuthor() {
        return "";
    }

    @Override
    public String getTitle() {
        return "";
    }

    public String getLibraryShelf() {
        return libraryShelf;
    }

    public void setLibraryShelf(String libraryShelf) {
        this.libraryShelf = libraryShelf;
    }
}
