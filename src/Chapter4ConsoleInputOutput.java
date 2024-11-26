import java.util.Random;
import java.util.Scanner;

class Chapter4ConsoleInputOutput {

    static void ZadachiGlava4() {

        // -------------------------------printf------------------------------------
        //		String str = "Hello, Java!";
        //		// Print normal
        //		System.out.print(str);
        //		// Print formatted style
        //		System.out.printf("%s", str);
        //
        //
        //		String name = "Boris";
        //		int age = 18;
        //		String town = "Plovdiv";
        //		System.out.printf(
        //		"%S is %d years old from %s!\n", name, age, town);
        //
        //		System.out.printf(
        //		"%3$s is a big town.\n"
        //		+ "%1$s lives in %3$s\n"
        //		+ "%1$s is %2$d years old.\n",name, age, town);
        //
        //		int a =5, b= 3;
        //
        //		System.out.printf("%1$d + %2$d = " + (a+b) ,a,b);
        //
        //		System.out.printf("\n %d + %d = %d \n",a,b, a*b);
        //
        //		float pi = 3.14159206f;
        //		  System.out.printf("%.4f%n", pi);
        //
        //		  System.out.println(new java.util.Date());
        //
        //		  System.out.printf("The time is: %1$tH:%1$tM:%1$tS. \n",new java.util.Date());
        //
        //		  Date date = new Date();
        //		  System.out.printf("The date in Day/Month/Year is %1$td/%1$tm/%1$tY. \n",date);
        //
        //		  System.out.printf("The date  is : %1$tA %1$tI:%1$tM:%1$tp %1%tB/%1$tY. \n	 ",date);

        //  int ch;
        //  try {
        //	  System.out.println("Enter some text:");
        //	while((ch = System.in.read()) != '\n')
        //	  {System.out.println((char)ch);}
        //} catch (IOException e) {
        // TODO Auto-generated catch block
        //	e.printStackTrace();
        //}

        // ------------------------------------ buffered reader ------------------------------------
        //System.out.println("Buffered reader overview");

        //BufferedReader br = new BufferedReader(
        //	  new InputStreamReader(System.in));

        // System.out.println("buffered reader :Enter your first name: ");

        // String firstName= "" , lastName= "";
        //try {
        //	firstName = br.readLine();
        //} catch (IOException e) {
        //	// TODO Auto-generated catch block
        //	e.printStackTrace();
        //}


        /*
         * try {
         * 		 lastName = br.readLine();
         *  }
         *  catch (IOException e) { // TODO
         * Auto-generated catch block e.printStackTrace(); }
         */

        // System.out.printf("Hello %1$s %2$s \n",firstName, lastName);

        // ------------------------------------ Scanner------------------------------------
        //
        //		  Scanner input = new Scanner(System.in);
        //
        //		  System.out.println(" Scanner Please enter your first name");
        //
        //		  String firstName1 = input.nextLine();
        //
        //		  System.out.println("Please enter your last name");
        //
        //		  String lastName1 = input.nextLine();
        //
        //		  System.out.printf("Hello %s %ds ! \n",firstName1, lastName1);
        //
        //
        //		Scanner input = new Scanner(System.in);
        //
        //		  System.out.print("a = ");
        //		  int a = input.nextInt();
        //
        //		  System.out.print("b = ");
        //		  int b = input.nextInt();
        //		  // Output: a = 5
        //		  //     b = 6
        //
        //		  System.out.printf("%d + %d = %d%n", a, b, a + b);
        //		  System.out.printf("%d * %d = %d%n", a, b, a * b);
        //		  // Output: 5 + 6 = 11
        //		  //     5 * 6 = 30

        //		Scanner input = new Scanner(System.in);
        //		System.out.printf("Enter person name: ");
        //		String person = input.nextLine();
        //
        //		System.out.printf("Enter book name: ");
        //		  String book = input.nextLine();
        //
        //		  String from = "Authors Team";
        //
        //		  System.out.printf("  Dear %s,%n", person);
        //		  System.out.printf("We are pleased to inform " +
        //		   "you that \"%2$s\" is the best Bulgarian book. \n" +
        //		   "The authors of the book wish you good luck %s!%n",
        //		   person, book);
        //
        //		  System.out.println("  Yours,");
        //		  System.out.printf("  %s", from);
        //
    }

    /**
     * zad 4
     * Напишете програма, която чете от конзолата две цели числа (integer) и
     * отпечатва, колко числа има между тях, такива, че остатъкът им от
     * деленето на 5 да е 0
     * <p>
     * . Има два подхода за решаване на задачата:
     * Първи подход: Използват се математически хитрини за оптимизирано
     * изчисляване, базирани на факта, че всяко пето число се дели на 5.
     * <p>
     * Вторият подход е по-лесен, но работи по-бавно. Чрез for цикъл може да
     * се обиколи и провери всяко число в дадения интервал. За целта трябва
     * да прочетете от Интернет или от главата "Цикли" как се използва for
     * цикъл.
     */
    static void numbersDivivedByFiveBetween() {

        Scanner input = new Scanner(System.in);
        System.out.printf("Enter first number : ");
        int first = input.nextInt();
        System.out.printf("Enter second number : ");
        int second = input.nextInt();
        int count = 0;
        if (second < first) {
            int temp = first;
            first = second;
            second = temp;
        }

        for (int i = first; i <= second; i++) {
            if (i % 5 == 0)
                count++;
        }
        System.out.printf(count + " numbers can be divided without ostatuk between " + first + " and " + second);
    }

    static void TheBiggerNumberWithComparassing() {
        // str 154 zad 5
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = input.nextInt();
        System.out.println("Enter second number: ");
        int b = input.nextInt();

        a -= b; // a= a-b a -= b
        b += a; // b= b+a b += a
        a -= b; // a -= b a=a-b
        System.out.println("The Bigger number is " + -a);
    }

    static void SumFiveNumbers() {
        // str 154 zad 6
        System.out.println("Enter the number of Numbers that you want to sum from zero: ");
        Scanner input = new Scanner(System.in);
        int tmpForSum = 0, number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            tmpForSum += i;
        }
        System.out.println("The sum of the numbers from 0 to " + number + " is: " + tmpForSum);
    }

    static void ReadFiveNumbersAndPrintTheBigest() {
        //str 154 zad 7
        //        7. Напишете програма, която чете пет числа и отпечатва най-голямото от
        //        тях. Забележка: трябва да използвате конструкция "if", която до
        //        момента не сме разгледали.

        System.out.println("Insert 5 numbers: ");
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        int biggestNumber = 0;
        Random rnd = new Random();
        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            // System.out.println("Enter number " + i + ": ");
            numbers[i] = rnd.nextInt(50); //Random() or input.nextInt()
            System.out.println("Entered number " + (i + 1) + " is : " + numbers[i]);
            if (numbers[i] > biggestNumber) {
                biggestNumber = numbers[i];
            }
        }
        System.out.println("The bigest number is: " + biggestNumber);
    }

    static void TotoRandNumbers() {

    }

}
