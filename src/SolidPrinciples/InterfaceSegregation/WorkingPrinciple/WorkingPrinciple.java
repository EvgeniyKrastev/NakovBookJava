//Принципът на разделяне на интерфейса
//(Interface Segregation Principle - ISP) гласи, че клиентите
//(класовете, които използват интерфейсите) не трябва да бъдат
//принуждавани да имплементират методи, които не използват.
//
//Това означава, че е по-добре да се създават множество малки,
//специализирани интерфейси, отколкото един голям интерфейс,
//който да съдържа методи за различни нужди.
//
//Основни насоки на ISP:
//Разделяй интерфейсите:
//    Големите, "тлъсти" интерфейси трябва да бъдат разделени на по-малки
//    и по-специализирани интерфейси, които
//    предоставят точно определена функционалност.
//
//Намаляваш зависимостите:
//    Клиентите трябва да знаят и имплементират само
//    методите, които са им нужни.
//
//Подобряваш гъвкавостта:
//    По-малките интерфейси улесняват повторното използване
//    на кода и правят системата по-модулна.

// Интерфейс за хранене
public interface Eatable {
    void eat();
}

// Интерфейс за летене
public interface Flyable {
    void fly();
}

// Интерфейс за плуване
public interface Swimmable {
    void swim();
}

public class Bird implements Eatable, Flyable {
    @Override
    public void eat() {
        System.out.println("Bird is eating.");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying.");
    }
}

public class Fish implements Eatable, Swimmable {
    @Override
    public void eat() {
        System.out.println("Fish is eating.");
    }

    @Override
    public void swim() {
        System.out.println("Fish is swimming.");
    }
}
