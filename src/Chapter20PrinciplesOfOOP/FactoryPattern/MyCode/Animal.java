package Chapter20PrinciplesOfOOP.FactoryPattern.MyCode;
abstract class Animal {
    protected int age;
    protected String name;
    protected String gender;

    // Конструктор за Animal
public Animal(int age, String name, String gender) {
    this.age = age;
    this.name = name;
    this.gender = gender;
}

// Абстрактен метод за издаване на звук, който всеки наследник ще имплементира
public abstract String makeSound();

// Метод toString() за извеждане на информацията за животното
@Override
public String toString() {
    return "Animal [Name: " + name + ", Age: " + age + ", Gender: " + gender + ", Sound: " + makeSound() + "]";
}
}