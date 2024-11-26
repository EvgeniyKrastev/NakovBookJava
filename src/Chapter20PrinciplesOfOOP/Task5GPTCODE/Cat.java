package Chapter20PrinciplesOfOOP.Task5GPTCODE;

class Cat extends Animal {
    public Cat(int age, String name, String gender) {
        super(age, name, gender);
    }

    @Override
    public String makeSound() {
        return "Meow";
    }
}
