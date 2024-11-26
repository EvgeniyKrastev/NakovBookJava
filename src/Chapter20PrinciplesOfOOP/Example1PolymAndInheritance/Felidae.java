package Chapter20PrinciplesOfOOP.Example1PolymAndInheritance;

 abstract class Felidae { // Latin word for "cat"
    protected boolean male;

    protected abstract boolean catchPray(Object pray);

    protected abstract void walk();

    protected void hide(){}

    protected void run(){
    }

    protected Felidae() {
        this(true);
    }
    protected Felidae(boolean male) {
        this.male = male;
    }
    protected boolean isMale() {
        return male;
    }

    protected void setMale(boolean male) {
        this.male = male;
    }
}
