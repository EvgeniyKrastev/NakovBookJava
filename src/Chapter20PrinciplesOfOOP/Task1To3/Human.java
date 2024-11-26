package Chapter20PrinciplesOfOOP.Task1To3;

class Human {

    private String firstName;
    private String secondName;

    Human() {
    }

    Human(String firstName , String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    String getFirstName() {
        return firstName;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    String getSecondName() {
        return secondName;
    }

    void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}
