package Chapter20PrinciplesOfOOP.SingletonPattern;

//Шаблонът Singleton
//Това е най-популярният и използван шаблон. Позволява на определен клас
//да има само една инстанция и дефинира откъде да се вземе тази инстанция.
//Типични примери са класове, които дефинират връзка към единствени
//неща (виртуалната машина, операционна система, мениджър на
//прозорците при графично приложение, файлова система), както и
//класовете от следващия шаблон (factory).

//Шаблонът може да претърпи много оптимизации, например мързеливо
//инициализиране на единствената променлива за спестяване на памет, но
//това е класическата му форма.
public class Singleton {

    // Single instance
    //Имаме статична
    //променлива, която държи единствената инстанция.
    private static Singleton instance;

    // Initialize the single instance
    // Инициализираме я
    //еднократно в статичния конструктор на класа.
    static {
        instance = new Singleton();
    }

    // The method for taking the single instance
    //Методът за вземане на
    //инстанцията най-често се казва getInstance().
    public static Singleton getInstance() {
        return instance;
    }

    // Private constructor – protects direct instantialion
    private Singleton(){}
}

