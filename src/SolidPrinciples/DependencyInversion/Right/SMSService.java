package SolidPrinciples.DependencyInversion.Right;

// Имплементация на SMSService
 class SMSService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
