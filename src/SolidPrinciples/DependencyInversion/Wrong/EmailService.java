package SolidPrinciples.DependencyInversion.Wrong;

 class EmailService {
     void sendEmail(String message) {
        System.out.println("Sending email: " + message);
    }
}
