package SolidPrinciples.DependencyInversion.Right;

//Високите нива на модули (абстракциите) не трябва да зависят от
// ниските нива (конкретни реализации).
//И двете трябва да зависят от абстракции.
//
//Абстракциите не трябва да зависят от детайлите.
//Детайлите трябва да зависят от абстракциите.
//
//Тоест трявба да сме зависими от абстракции а не от конкретни класове.


// Използване
 class Main {
    public static void main(String[] args) {
        MessageService emailService = new EmailService();
        Notification emailNotification = new Notification(emailService);
        emailNotification.send("Hello via Email!");

        MessageService smsService = new SMSService();
        Notification smsNotification = new Notification(smsService);
        smsNotification.send("Hello via SMS!");
    }
}
