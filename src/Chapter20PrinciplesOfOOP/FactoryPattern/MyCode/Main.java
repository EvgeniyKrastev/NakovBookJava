package Chapter20PrinciplesOfOOP.FactoryPattern.MyCode;

class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();

        Animal cat = factory.getAnimal("cat");
        System.out.println("Animal say"+" "+cat.makeSound());

        Animal dog = factory.getAnimal("dog");
        System.out.println("Animal say"+" "+dog.makeSound());

        Animal frog = factory.getAnimal("frog");
        System.out.println("Animal say"+" "+frog.makeSound());

        Animal kitten = factory.getAnimal("kitten");
        System.out.println("Animal say"+" "+kitten.makeSound());

    }
}
