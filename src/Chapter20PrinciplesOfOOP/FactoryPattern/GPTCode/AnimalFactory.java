package Chapter20PrinciplesOfOOP.FactoryPattern.GPTCode;

class AnimalFactory {
    public Animal getAnimal(String type) {
        if (type == null) {
            return null;
        }
        switch (type.toLowerCase()) {
            case "cat":
                return new Cat();
            case "dog":
                return new Dog();
            case "frog":
                return new Frog();
            case "kitten":
                return new Kitten();
            default:
                throw new IllegalArgumentException("Unknown animal type: " + type);
        }
    }
}

