package SolidPrinciples.InterfaceSegregation.WorkingPrinciple;

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
