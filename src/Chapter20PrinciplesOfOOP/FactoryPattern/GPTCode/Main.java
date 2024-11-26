package Chapter20PrinciplesOfOOP.FactoryPattern.GPTCode;

public class Main {
    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();

        Animal cat = factory.getAnimal("cat");
        System.out.println("Animal: " + cat.getType() + ", Sound: " + cat.getSound());

        Animal dog = factory.getAnimal("dog");
        System.out.println("Animal: " + dog.getType() + ", Sound: " + dog.getSound());

        Animal frog = factory.getAnimal("frog");
        System.out.println("Animal: " + frog.getType() + ", Sound: " + frog.getSound());

        Animal kitten = factory.getAnimal("kitten");
        System.out.println("Animal: " + kitten.getType() + ", Sound: " + kitten.getSound());

        Animal whale = factory.getAnimal("whale");
        System.out.println("Animal: " + whale.getType() + ", Sound: " + whale.getSound());
    }
}

