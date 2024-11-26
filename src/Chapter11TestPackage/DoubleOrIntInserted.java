package Chapter11TestPackage;

public class DoubleOrIntInserted {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        java.util.ArrayList<Integer> ints = new
                java.util.ArrayList<Integer>();
        java.util.ArrayList<Double> doubles = new
                java.util.ArrayList<Double>();

        while (true) {
            System.out.println("Enter an int or a double:");
            if (input.hasNextInt()) {
                ints.add(input.nextInt());
            } else if (input.hasNextDouble()) {
                doubles.add(input.nextDouble());
            } else {
                break;
            }
        }

        System.out.printf("You entered these ints: %s%n",
                ints.toString());
        System.out.printf("You entered these doubles: %s%n",
                doubles.toString());

    }
}