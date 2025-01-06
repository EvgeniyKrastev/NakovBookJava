package SolidPrinciples.DependencyInversion.Right;

// Имплементация на EmailService
 class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
}