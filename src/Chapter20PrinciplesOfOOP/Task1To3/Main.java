package Chapter20PrinciplesOfOOP.Task1To3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Main {

    /**1,2. Дефинирайте клас Human със свойства "собствено име" и "фамилно име".
     Дефинирайте клас Student, наследяващ Human, който има свойство
     "оценка". Дефинирайте клас Worker, наследяващ Human, със свойства
     "надница" и "изработени часове". Имплементирайте и метод "изчисли
     надница за 1 час", който смята колко получава работникът за 1 час
     работа, на базата на надницата и изработените часове. Напишете
     съответните конструктори и методи за достъп до полетата (свойства).
     1. Задачата е тривиална. Просто следвайте условието и напишете кода.

    2. Инициализирайте масив от 10 студента и ги сортирайте по оценка в
     нарастващ ред. Използвайте Java интерфейса java.lang.Comparable.
     2. Имплементирайте Comparable в Student и оттам просто сортирайте списък
     от Comparable. Можете да използвате и java.util.Arrays. sort(Object[]). */
    static void task1And2() {
        // za6to s tova ne se polu4ava
        /* Student[] students = new Student[]{
                new Student("Evgo","Krastev",5),
                new Student("Georgi", "Georgiev",2),
                new Student("Ivan","Tonev",3),
                new Student("Adasha","Programista",4),
                new Student("Ivan","Ivanov",5),

                new Student("Bat","Gerge",3),
                new Student("Bat","Man",6),
                new Student("Super","Man",6),
                new Student("Popai","Moriaka",5),
                new Student("Megas","XRL",6)
        };
        * */

        List<Student> students = new ArrayList<>();
        students.add(new Student("Evgo","Krastev",5));
        students.add(new Student("Georgi", "Georgiev",2));
        students.add(new Student("Ivan","Tonev",3));
        students.add(new Student("Adasha","Programista",4));
        students.add(new Student("Ivan","Ivanov",5));

        students.add(new Student("Bat","Gosho",3));
        students.add(new Student("Bat","Man",6));
        students.add(new Student("Super","Man",6));
        students.add(new Student("Popai","Morqka",5));
        students.add(new Student("Megas","XLR",6));

        Collections.sort(students);

        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

    /**3. Инициализирайте масив от 10 работника и ги сортирайте по заплата в
     намаляващ ред.
     3. Задачата е като предната. */
    static void task3(){
        List<Worker> workers = new ArrayList<>();

        workers.add(new Worker("Evgo","Krastev",10,40));
        workers.add(new Worker("Georgi", "Georgiev",15,40));
        workers.add(new Worker("Ivan","Tonev",15,50));
        workers.add(new Worker("Adasha","Programista",10,60));
        workers.add(new Worker("Ivan","Ivanov",10,50));

        workers.add(new Worker("Bat","Gosho",20,30));
        workers.add(new Worker("Bat","Man",20,40));
        workers.add(new Worker("Super","Man",20,50));
        workers.add(new Worker("Popai","Morqka",15,60));
        workers.add(new Worker("Megas","XLR",25,40));

        Collections.sort(workers);

        for (Worker worker: workers){
            System.out.println(worker.toString());
        }
    }
    static void main(String[] args) {
        task3();
    }
}
