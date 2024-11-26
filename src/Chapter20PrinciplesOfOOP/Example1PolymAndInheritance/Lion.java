package Chapter20PrinciplesOfOOP.Example1PolymAndInheritance;

class Lion extends Felidae {
    private int weight;

    private void movePaw(){
    }

    private void ambush(){
    }

    protected Lion(boolean male, int weight) {
        super(male); // Shall be explained in the next paragraph
        this.weight = weight;
        super.hide();
        this.ambush();
        super.run();
    }

    protected int getWeight() {
        return weight;
    }

    protected void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    protected boolean catchPray(Object pray) {
        return false;
    }

    @Override
    protected void walk() {

    }
}
