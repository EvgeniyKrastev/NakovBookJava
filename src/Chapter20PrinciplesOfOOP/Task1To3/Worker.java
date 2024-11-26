package Chapter20PrinciplesOfOOP.Task1To3;

class Worker extends Human implements Comparable<Worker>{
    private int wages; // надница
    private int hoursWorked; // Изработени часове
    private int salary;

    Worker(String firstName, String secondName,int wages, int hoursWorked){
        super.setFirstName(firstName);
        super.setSecondName(secondName);
        this.wages = wages;
        this.hoursWorked = hoursWorked;
        this.salary = this.wages*this.hoursWorked;
    }

    public int getWages() {
        return this.wages ;
    }

    public void setWages(int wages) {
        this.wages = wages;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double calculateHourlyWage(){
        return this.hoursWorked/=this.wages;
    }

    // Имплементация на метода compareTo
    @Override
    public int compareTo(Worker other) {
        // Сравняваме по заплата в намаляващ ред затова е първо с other после с this
        return Integer.compare(other.salary,this.salary);
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getSecondName() + " (" + this.salary + ")";
    }
}