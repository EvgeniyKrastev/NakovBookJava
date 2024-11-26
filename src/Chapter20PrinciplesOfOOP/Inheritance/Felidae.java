package Chapter20PrinciplesOfOOP.Inheritance;

class Felidae { // Latin word for "cat"
    private boolean male;
    protected Felidae() {
        this(true);
    }
    /*При наследяване на един клас, нашите конструктори задължително трябва
    да извикат конструктор на базовия клас, за да може и той да инициализира
    член-променливите си. Ако не го направим изрично, в началото на всеки
    наш конструктор компилаторът поставя извикване на базовия конструктор
    без параметри: super()*/
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

