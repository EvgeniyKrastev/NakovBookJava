package SolidPrinciples.DependencyInversion.Wrong;

// Клас, който използва EmailService директно
 class Notification {
    private EmailService emailService;

     Notification() {
        this.emailService = new EmailService(); // Твърда зависимост
    }

    public void send(String message) {
        emailService.sendEmail(message);
    }
}
