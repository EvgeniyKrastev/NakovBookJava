package Chapter20PrinciplesOfOOP.Inheritance;

class Lion extends Felidae {
    private int weight;

    protected Lion(boolean male, int weight) {
        super(male); // Shall be explained in the next paragraph
        this.weight = weight;
    }

    protected int getWeight() {
        return weight;
    }

    protected void setWeight(int weight) {
        this.weight = weight;
    }

    public String toString() {
        return String.format(
                "(Lion, male: %s, weight: %s)",
                this.isMale(), this.getWeight() );
    }
}
/** super.
 Тя указва да бъде използван базовият клас и позволява достъп до негови
 методи, конструктори и член-променливи. Със super() можем да извикваме
 конструктор на базовия клас. Със super.method() можем да извикваме метод
 на базовия клас, да му подаваме параметри и да използваме резултата от
 него. Със super.field можем да вземем стойността на член-променлива на
 базовия клас или да й присвоим друга стойност.
 */
