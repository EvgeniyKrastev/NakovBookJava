package Chapter11TestPackage;

public class Sequence {
    // Static field
    private static int currentValue = -1;
    // Intentionally deny instantiation of this class
    public Sequence() {
    }
    // Static method
    public static int nextValue() {
        currentValue++;
        return currentValue;
    }
}


