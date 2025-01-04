//Високите нива на модули (абстракциите) не трябва да зависят от
// ниските нива (конкретни реализации).
//И двете трябва да зависят от абстракции.
//
//Абстракциите не трябва да зависят от детайлите.
//Детайлите трябва да зависят от абстракциите.
//
//Тоест трявба да сме зависими от абстракции а не от конкретни класове.
//----------------------------- Грешен Подход -----------------------------
// Конкретна имплементация за изпращане на съобщения
public class EmailService {
    public void sendEmail(String message) {
        System.out.println("Sending email: " + message);
    }
}

// Клас, който използва EmailService директно
public class Notification {
    private EmailService emailService;

    public Notification() {
        this.emailService = new EmailService(); // Твърда зависимост
    }

    public void send(String message) {
        emailService.sendEmail(message);
    }
}

// Използване
public class Main {
    public static void main(String[] args) {
        Notification notification = new Notification();
        notification.send("Hello!");
    }
}
//----------------------------- Верен Подход -----------------------------

// Интерфейс за услугата за изпращане на съобщения
public interface MessageService {
    void sendMessage(String message);
}

// Имплементация на EmailService
public class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
}

// Имплементация на SMSService
public class SMSService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

// Клас Notification, който зависи от интерфейс (абстракция)
public class Notification {
    private MessageService messageService;

    // Зависимостта се подава чрез конструктора
    public Notification(MessageService messageService) {
        this.messageService = messageService;
    }

    public void send(String message) {
        messageService.sendMessage(message);
    }
}

// Използване
public class Main {
    public static void main(String[] args) {
        MessageService emailService = new EmailService();
        Notification emailNotification = new Notification(emailService);
        emailNotification.send("Hello via Email!");

        MessageService smsService = new SMSService();
        Notification smsNotification = new Notification(smsService);
        smsNotification.send("Hello via SMS!");
    }
}
