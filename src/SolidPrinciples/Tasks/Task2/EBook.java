package SolidPrinciples.Tasks.Task2;

class EBook extends Book {

    String downloadURL;

    public EBook(String title, String author, String downloadURL) {
        super(title, author);
        this.downloadURL = downloadURL;
    }

    @Override
    public String getTitle() {
        return "";
    }

    @Override
    public String getAuthor() {
        return "";
    }

    public String getDownloadURL() {
        return downloadURL;
    }

    public void setDownloadURL(String downloadURL) {
        this.downloadURL = downloadURL;
    }
}
