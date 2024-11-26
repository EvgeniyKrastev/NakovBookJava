package Chapter20PrinciplesOfOOP.FactoryPattern.GPTCode;

public class Cat extends Animal {
    @Override
    public String getSound() {
        return "Meow";
    }

    @Override
    public String getType() {
        return "Cat";
    }
}
