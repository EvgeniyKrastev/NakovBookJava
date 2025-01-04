
//Принцип на единствената отговорност (SRP)
//Принципът на единствената отговорност гласи, че един клас трябва да има
// само една причина да бъде променян. Това означава, че класът трябва да
// бъде отговорен само за една функционалност или задача, а не да изпълнява
// множество различни роли.
//
//По този начин, ако има нужда да променим нещо в кода, което се отнася
// до дадена функционалност, трябва да правим промени само в този клас.
// Ако класът има множество отговорности, всяка промяна в изискванията
// за различни аспекти на приложението ще води до нуждата от промени в
// този клас, което увеличава сложността на поддръжката на кода.
//
//Принцип за методите:
//Както правилно отбеляза, принципът може да се прилага и към методите.
// Един метод трябва да извършва само едно действие, или поне да е отговорен
// за една логическа част от функционалността. Това прави методите по-лесни
// за разбиране, тестване и поддръжка.

class UserManager{
    private UserRepository userRepository;
    private EmailService emailService;

    UserManager(UserRepository userRepository, EmailService emailService){
        this.userRepository = userRepository;
        this.emailService = emailService;
    }

    void registerUser(String username, String password){
        // Само регистрация на потребителя
        userRepository.saveUser();

        // Изпращане на имейл трябва да бъде обработено в друг клас
        emailService.sendConfirmationEmail();
    }

}

class UserRepository{
    void saveUser(String username, String password){
        //Код за запазване на потребител
    }
}

class EmailService {
    void sendConfirmationEmail(String username){
        //Код за изпращане на имейл
    }
}