package Chapter20PrinciplesOfOOP.Task5GPTCODE;

//котарак
class Tomcat extends Cat {
    public Tomcat(int age, String name) {
        super(age, name, "Male");
    }

    @Override
    public String makeSound() {
        return "Mrrr";
    }
}
