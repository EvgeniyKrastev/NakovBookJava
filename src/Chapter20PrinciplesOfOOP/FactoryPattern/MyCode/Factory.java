package Chapter20PrinciplesOfOOP.FactoryPattern.MyCode;

class Factory {
    protected Animal getAnimal(String type){
        if (type == null){
            return null;
        }

        return switch (type.toLowerCase()) {
            case "cat" -> new Cat(1, "jony", "male");
            case "dog" -> new Dog(2, "jony", "male");
            case "frog" -> new Frog(5, "jony", "male");
            case "kitten" -> new Kitten(5, "male");
            default -> throw new IllegalArgumentException("Unknown animal type: " + type);
        };


        // the two switches are equal
//        switch (type.toLowerCase()){
//            case "cat":
//                return new Cat(1,"jony","male");
//            case "dog":
//                return new Dog(2,"jony","male");
//            case "frog":
//                return new Frog(5,"jony","male");
//            case "kitten":
//                return new Kitten(5,"male");
//            default:
//                throw new IllegalArgumentException("Unknown animal type: " + type);
//        }
    }
}
