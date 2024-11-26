package Chapter20PrinciplesOfOOP.Task1To3;

class Student extends Human implements Comparable<Student> {

    /**Оценка*/
    private int assessment;// оценка

    /**assessment - Оценка*/
    Student(String firstName, String secondName, int assessment) {
        super.setFirstName(firstName);
        super.setSecondName(secondName);
        this.assessment = assessment;
    }

    int getAssessment() {
        return assessment;
    }

    void setAssessment(int assessment) {
        this.assessment = assessment;
    }

    // Имплементация на метода compareTo
    @Override
    public int compareTo(Student other) {
        // Сравняваме по Оценка в нарастващ ред затова е първо с this после с other
        return Integer.compare(this.assessment, other.assessment);
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getSecondName()+ " (" + this.assessment + ")";
    }
}