package Chapter20PrinciplesOfOOP.FactoryPattern.MyCode;

class Frog extends Animal {
    public Frog(int age, String name, String gender) {
        super(age, name, gender);
    }

    @Override
    public String makeSound() {
        return "Ribbit";
    }
}
