package SolidPrinciples.DependencyInversion.Right;

// Клас Notification, който зависи от интерфейс (абстракция)
 class Notification {
    private MessageService messageService;

    // Зависимостта се подава чрез конструктора
     Notification(MessageService messageService) {
        this.messageService = messageService;
    }

     void send(String message) {
        messageService.sendMessage(message);
    }
}
