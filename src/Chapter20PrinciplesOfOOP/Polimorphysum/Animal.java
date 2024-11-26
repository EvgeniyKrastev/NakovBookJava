package Chapter20PrinciplesOfOOP.Polimorphysum;

abstract class Animal {
    public void printInformation() {
        System.out.println("I am " +
                this.getClass().getSimpleName() + ".");
        System.out.println(getTypicalSound());
    }

    protected abstract String getTypicalSound();
}
