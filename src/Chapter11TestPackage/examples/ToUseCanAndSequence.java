package Chapter11TestPackage.examples;
import Chapter11TestPackage.Cat;
import Chapter11TestPackage.Sequence;

public class ToUseCanAndSequence {

    public static void main(String[] args){
        Cat diego = new Cat("Jonny","Black");
        System.out.println(diego.getColor() + " " + diego.getName());
        for (int i = 0; i < 5; i++) {
            System.out.print(Sequence.nextValue());
        }
    }
}
