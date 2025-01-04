package SolidPrinciples.Tasks.Task2;

class AudioBook extends Book {
    int time;

    public AudioBook(String title, String author, int time) {
        super(title, author);
        this.time = time;
    }

    @Override
    public String getTitle() {
        return "";
    }

    @Override
    public String getAuthor() {
        return "";
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
