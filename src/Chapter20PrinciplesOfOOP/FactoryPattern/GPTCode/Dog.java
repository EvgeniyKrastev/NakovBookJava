package Chapter20PrinciplesOfOOP.FactoryPattern.GPTCode;

public class Dog extends Animal {
    @Override
    public String getSound() {
        return "Bark";
    }

    @Override
    public String getType() {
        return "Dog";
    }
}
