package Chapter20PrinciplesOfOOP.Task5GPTCODE;

public class Main {

    /**5. Имплементирайте следните обекти: куче (Dog), жаба (Frog), котка (Cat),
     котенце (Kitten), котарак (Tomcat). Всички те са животни (Animal).
     Животните се характеризират с възраст (age), име (name) и пол (gender).
     Всяко животно издава звук (виртуален метод на Animal).
     Направете масив от различни животни и за всяко изписвайте на
     конзолата името, възрастта и звука, който издава.
     5. Изписването на информацията можете да го имплементирате във
     виртуалния метод java.lang.Object.toString(). За да принтирате
     съдържанието на целия масив, можете да ползвате статичния метод
     java.util.Arrays.toString(Object[]), който ще използва предефи
     нирания от вас toString().*/
    public static void main(String[] args) {
        // Създаваме масив от различни животни
        Animal[] animals = {
                new Dog(3, "Rex", "Male"),
                new Frog(1, "Froggy", "Female"),
                new Cat(4, "Whiskers", "Female"),
                new Kitten(1, "Luna"),
                new Tomcat(5, "Tom")
        };

        // Принтираме информацията за всяко животно, използвайки Arrays.toString()
        System.out.println(java.util.Arrays.toString(animals));
    }
}
