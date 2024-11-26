package Chapter21QualityProgrammingCode;

import java.util.ArrayList;

public class Chapter21QualityProgrammingCode {
    // primer za dobre komentiran kod. str ot u4ebnika 764

    /**
     * @return a list of all primes in given range [start, end].
     * A number num is prime if it can not be divided to any number
     * in the range [2, sqrt(num)]. We check condition this for all
     * numbers in the given range.
     */
    public static ArrayList<Integer> getPrimes(int start, int end) {
        ArrayList<Integer> primesList = new ArrayList<Integer>();
        for (int num = start; num <= end; num++) {
            boolean prime = true;
            for (int div = 2; div <= Math.sqrt(num); div++) {
                if (num % div == 0) {
                    // Found a divider -> num is not prime
                    prime = false;
                    break;
                }
            }
            if (prime) {
                primesList.add(num);
            }
        }
        return primesList;
    }

    /**
     * Кода от първа задача от глава 21.
     * Трябва да съм го преработил да стане качествен.
     * Кода е взет от първия пример в главата.
     * <p>
     * Стартира цикъл,който избира 3 пъти от switch, който принтира или числа или върщи присвояване.
     */
    static void exampleMethodToFormat() {
        int i = 0, w = 0, end = 3;

        System.out.println("Cycle");
        for (int counter = 0; counter <= end; counter++) {
            System.out.print(counter + " " + 'f');

            switch (counter) {
                case 1:
                    System.out.println("9 9");
                    break;
                case 2:
                    i = 1;
                    break;
                case 3:
                    w = 5;
                    break;
                default:
                    System.out.print("4 ");
                    break;
            }
        }
    }

    public static void main(String[] args) {

    }
}
