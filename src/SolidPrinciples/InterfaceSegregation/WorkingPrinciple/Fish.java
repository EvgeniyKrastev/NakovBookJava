package SolidPrinciples.InterfaceSegregation.WorkingPrinciple;

public class Fish implements Eatable, Swimmable {
    @Override
    public void eat() {
        System.out.println("Fish is eating.");
    }

    @Override
    public void swim() {
        System.out.println("Fish is swimming.");
    }
}
