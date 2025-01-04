public interface Animal {
    void eat();
    void fly();
    void swim();
}

public class Bird implements Animal {
    @Override
    public void eat() {
        System.out.println("Bird is eating.");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying.");
    }

    @Override
    public void swim() {
        throw new UnsupportedOperationException("Birds don't swim!");
    }
}

public class Fish implements Animal {
    @Override
    public void eat() {
        System.out.println("Fish is eating.");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Fish can't fly!");
    }

    @Override
    public void swim() {
        System.out.println("Fish is swimming.");
    }
}
