package Chapter13CharacterStrings;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Single responsability - един клас или метод да има само една отговорност
 * В този клас слагам само задачите свързани с тази глава
 */
class Chapter13CharacterStrings {
    /*--------------------------Примери от главата-----------------------------*/

    //Класът java.lang.String позволява обработка на символни низове в Java.

    /**
     * Четене и печатане на конзолата
     */

    static void name() {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.printf("Hello, %s, have a nice reading!", name);
    }

    /**
     * Сравнение за еднаквост
     * Да сравним два символни низа и да установим дали стойностите им са еднакви или не
     */

    static void equalStringsMethods() {
        // equalsIgnoreCase(…)- игнорира разликата между малки и главни букви
        // equals(…) - прави разлика между малки и главни букви

        String word1 = "Java";
        String word2 = "JAVA";
        System.out.println(word1.equals(word2)); // false
        System.out.println(word1.equalsIgnoreCase(word2)); // true
    }

    /**
     * Сравнение на низове по азбучен ред.
     * compareTo(…)- прави разлика между главни и малки букви
     * compareToIgnoreCase(…)- не прави разлика между главни и малки букви.
     * Методът compareTo(…) сравнява 2 символни низа за равенство или различие.
     * За да бъдат два низа с еднакви стойности, то те трябва да имат една и съща
     * дължина (брой символи) и символите да бъдат еднакви и подредени в един
     * и същ ред.
     * compareTo(…)
     * връща положително число, отрицателно число или 0 в зависимост от
     * лексикографската подредба.
     */

    static void compareStringsLexical() {
        String score = "sCore";
        String scary = "scary";
        System.out.println(score.compareToIgnoreCase(scary)); // 14
        System.out.println(scary.compareToIgnoreCase(score)); // -14
        System.out.println(scary.compareTo(score)); // 32
    }

    /*Сравняването на низове с оператора == в Java е груба
    грешка, защото този оператор сравнява адресите на
    низовете, не техните стойности! За сравняване на низове
    Любопитен обаче е следният случай:

    String hello = "Hello";
    String same = "Hello";
    System.out.println(same == hello); // true

    Оптимизация на паметта при символни низове
    Истината обаче е, че съществува
    оптимизация във виртуалната машина, която спестява създаването на
    дублиращи символни низове в паметта. Тази оптимизация се нарича
    */

    /**
     * Създаване и инициализиране на String.
     */

    static void creatingStringsAndInitial() {
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println((str1 == str2)); // false
        //Връщаният резултат е
        //false, тъй като всяка променлива сочи на отделно място в паметта:
    }

    /**
     * Търсене на низ в друг низ.
     * - indexOf(…)- започва от началото на низа към неговия край. Когато се интересуваме от първия срещнат резултат, тогава
     * използваме indexOf(…)
     * - lastIndexOf(…)- търси отзад-напред.  Ако искаме да претърсваме низа от неговия край
     * (например за откриване на последната точка в името на даден файл или
     * последната наклонена черта в URL адрес), уместно решение е
     * lastIndexOf(…).
     */

    static void searchingStringInOtherString() {
        String book = "Introduction to Java book";
        int index = book.indexOf("Java");
        System.out.println(index); // index = 16
    }

    /**
     * Всички срещания на дадена дума.
     * Понякога искаме да открием всички срещания на даден подниз в текущия
     * низ. Използването на двата метода само с 1 подаден аргумент за търсен низ
     * не би ни свършило работа, защото винаги ще връща само първото срещане
     * на подниза. Ето защо е възможно подаването на втори параметър за индекс,
     * който посочва началната позиция, от която започва търсенето.
     * <p>
     * Ето защо
     * правилното търсене на следващ резултат е с аргумент index + 1. За
     * lastIndexOf(…), аналогично, тъй като търсенето е в обратен ред, индексът
     * се намалява с единица.
     */

    static void allOccurrencesOfAgivenWord() {
        String quote = "The main subject in the \"Intro Java\"" +
                " book is Java for Java newbies.";
        int index = quote.indexOf("Java");
        while (index != -1) {
            System.out.println("Java found on index: " + index);
            index = quote.indexOf("Java", index + 1);
        }
    }

    /**
     * Извличане на част от низ.
     * substring(…)-  можем да извлечем даден подниз по зададени
     * начална и крайна  позиция в текста.
     * String path = "C:\\Pics\\Rila2008.jpg";
     * // filename = "Rila2008"
     */

    static void substringTaking() {
        String path = "C:\\Pics\\Rila2008.jpg";
        String filename = path.substring(8, 16);
        // filename = "Rila2008"

//        Символът на
//        посочената позиция – индекс2 – не се взима предвид!
//                Например, ако посочим substring(5, 10), ще бъдат
//        извлечени символите между индекс 5 и 9 включително, а
//        не между 5 и 10!
    }

    /**
     * Извличане на част от низ.
     * path.lastIndexOf("\\");
     * String path = "C:\\Pics\\Rila2008.jpg";
     * // fullname = "Rila2008.jpg"
     */

    static void stringAfterLastSimbol() {
        String path = "C:\\Pics\\Rila2008.jpg";
        int index = path.lastIndexOf("\\"); // index = 7
        String fullName = path.substring(index + 1);
        // fullname = "Rila2008.jpg"
    }

    /**
     * Разцепване на низ по разделител.
     * split(…) Един от най-гъвкавите методи за работа със символни низове.
     */

    static void splitHowToWorkWith() {
        String listOfBeers = "Amstel, Zagorka, Tuborg, Becks.";
        String[] beersArr = listOfBeers.split("[ ,.]");

//        Все пак, ако обходим масива и изведем елементите му един по един,
//                резултатите ще бъдат: "Amstel", "", "Zagorka", "", "Tuborg", "" и "Becks".
//                Получаваме 7 резултата, вместо очакваните 4. Причината е, че при разделянето
//        на текста се откриват 3 подниза, които съдържат 2 разделителни
//        символа един до друг (например запетая, последвана от интервал). В този
//        случай празният низ между двата разделителя също е част от връщания
//        резултат.

        // Как да премахнем празните елементи?
        for (String beer : beersArr) {
            if (!beer.equals("")) {
                System.out.println(beer);
            }
        }

//        Този подход обаче няма да премахне празните низове от масива. Затова
//        можем да променим аргумента, който подаваме на метода split(…), като
//        добавим знака +:

        //String[] beersArr = listOfBeers.split("[ ,.]+");

//        След тази промяна масивът beersArr ще съдържа 4 елемента – четирите
//        думи от променливата listOfBeers. Добавяйки плюс към заградените
//        символи, ние инструктираме метода split(…) да работи по следния начин:
//        "Върни всички поднизове от променливата, които са разделени от
//        интервал, запетая или точка. Ако срещнеш два или повече съседни
//        разделителя, считай ги за един".

        //Множество от всички малки латински букви, регулярният израз ще изглежда така:
        //String small = "[a-z]";

//        Всички малки и главни букви на латиница и кирилица:
//        String allLetters= "[a-zA-Zа-яА-Я]";

//        В сила са и операндите OR, AND и NOT за работа с множества. Можем,
//        например, да разделим даден текст по всички символи, които не са цифри:
//        String nan = "[^0-9]";

//        Регулярни изрази – полезни конструкции
//        Съществуват предефинирани класове, които обобщават често използвани
//        множества. Някои от тях са:
//        - . (символът точка) – обхваща всички възможни символи (може да
//        прихваща или не обозначенията за нов ред)
//        - \d – обхваща всички цифри (еквивалентно на [0-9])
//                - \D – обхваща всички символи, които не са цифри (еквивалентно на
//                [^0-9])
//        - \s – знак за интервали: [ \t\n\x0B\f\r]
//        - \S – всички знаци, освен тези за интервали: [^\s]
//        - \w – всички символи, считани за дума: [a-zA-Z_0-9]
//        - \W – еквивалентно на [^\w]
//        Когато използвате предефинираните класове в Java, не
//        забравяйте, че обратната наклонена черта е екраниращ
//        знак! По тази причина е необходимо да добавяме още
//        една обратна наклонена черта, за да използваме предефинираните класове.
    }

    /**
     * Заменя подниз.
     * doc.replace("some@mail.bg", "osama@laden.af")
     * Примерно в документ сме сгрешили един имейл на много места
     * и може да го оправим с медотда а replace(…).
     * Когато се налага да
     * работим с по-обща информация, на помощ ни идва метода replaceAll(…)
     */

    static void substringReplacing() {
        String doc = "Hello, some@mail.bg, " +
                "you have been using some@mail.bg in your registration.";
        String fixedDoc = doc.replace("some@mail.bg", "osama@laden.af");
        System.out.println(fixedDoc);
    }

    /**
     * Заменя телефонен номер със звездички Обяснение на аргументите на replaceAll(…)
     * <p>
     * Примерът може да бъде допълнително подобрен за
     * подбиране на номерата само от дадени мобилни оператори, за работа с
     * телефони на чуждестранни мрежи и др., но за целта на примера е
     * използван опростен вариант. Литералът "08" е заграден от кръгли скоби.
     * Те служат за обособяване на отделна група от регулярния израз. Групите
     * могат да бъдат използвани за обработка само на определена част от израза,
     * вместо целия. В нашия пример, групата е използвана в заместването –
     * откритите съвпадения са заместени с "$1********" – текстът от първата
     * група на регулярния израз + последователни 8 звездички за цензурата. Тъй
     * като дефинираната от нас група винаги е константа – 08, то заместеният
     * текст ще бъде във формат: 08********.
     * .
     */

    static void phoneNumberReplace() {
        String doc = "Smith's number: 0892880022 \n" +
                "Franky can be found at 0853445566 \n" +
                "so as Steven - 0811654321";
        String replacedDoc;
        replacedDoc = doc.replaceAll("(08)[0-9]{8}", "$1********");
        System.out.println(replacedDoc);

        //Smith's number: 08**********
        //Franky can be found at 08**********
        //so as Steven - 08**********
    }

    /**
     * Преминаване към главни и малки букви
     * toLowerCase()
     * toUpperCase()
     */

    static void toSmallOrBigChars() {
        String text = "All Kind OF LeTTeRs";
        System.out.println(text.toLowerCase());
        // all kind of letters

//        Ако искаме да сравним въведен вход от потребителя и не сме сигурни по
//        какъв точно начин е написан той, можем да уеднаквим регистъра на
//        буквите и да го сравним с дефинираната от нас константа.
//        По този начинне правим разлика за малки и главни букви. Например, ако имаме входен
//        панел на потребителя, в който въвеждаме име и парола, и няма значение
//        дали паролата е написана с малки, или главни букви, може да направим
//        подобна проверка:

        String pass1 = "Parola";
        String pass2 = "PaRoLa";
        String pass3 = "parola";
        boolean isEqual;
        isEqual = pass1.toUpperCase().equals("PAROLA"); // true
        isEqual = pass2.toUpperCase().equals("PAROLA"); // true
        isEqual = pass3.toUpperCase().equals("PAROLA"); // true

//        В този случай малко обезсмисляме действието на метода
//        equalsIgnoreCase(…), като дефинираме проверката ръчно.
    }

    /**
     * Премахване на празно пространство в края на низ .trim();
     */

    static void whiteSpaceRemover() {
        String fileData = " \n\n Mario Peshev ";
        String reduced = fileData.trim(); // result  "Mario Peshev"

    }
//////////////////////////////////////////// STRING BUILDER //////////////////////////////////////////////////////

    /**
     * Слепване на низове правилно(елегантно решение).
     * 50 000 символа се слепват за под 1 сек, ако беше с конкатенация на низове за 1 000 символа 9 мин.
     */
    static void numbersConcatenatorEllegant() {
        System.out.println(new Date());
        StringBuilder sb = new StringBuilder();
        sb.append("Numbers: ");
        for (int idx = 1; idx <= 50000; idx++) {
            sb.append(idx);
        }
        System.out.println(sb.substring(0, 1024));
        System.out.println(new Date());
    }

    /**
     * Обръщане на низове правилен начин защото не се ползва конкатенация и става много по бързо.
     */
    static String reverseTextFast(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--)
            sb.append(text.charAt(i));
        return sb.toString();
    }

    /**
     * Обръщане на низове правилен начин
     */

    static void exampleReverseString() {
        String text = "EM edit";
        String reversed = reverseTextFast(text);
        System.out.println(reversed); // tide ME
    }

    /**
     * StringBuilder sb = new StringBuilder(15);
     * sb.append("Hello,Java!");
     * StringBuilder – по-важни методи
     * - StringBuilder(int capacity) – конструктор с параметър начален
     * капацитет. Чрез него може предварително да зададем размера на
     * буфера, ако имаме приблизителна информация за броя итерации и
     * слепвания. Така спестяваме излишни заделяния на динамична памет.
     * - capacity() – връща размера на целия буфер (общия брой заети и
     * свободни символи)
     * - length() – връща дължината на записания низ в променливата
     * - charAt(int index) – връща символа на указаната позиция
     * - append(…) – слепва низ, число или друга стойност след последния
     * записан символ в буфера
     * - delete(int start, int end) – премахва низ по зададена начална и
     * крайна позиция
     * - insert(int offset, String str) – вмъква даден стринг на дадена
     * позиция
     * - replace(int start, int end, String str) – замества записания низ
     * между началната и крайната позиция със стойността на променливата
     * str
     * - toString() – връща записаната информация в обекта на StringBuilder
     * като резултат от тип String, който можем да запишем в променлива
     * на String.
     */

    static void stringBuilder() {

    }

    /**
     * Извличане на главните букви от текст.
     */
    static String extractCapitals(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                result.append(ch);
            }
        }
        return result.toString();
    }
////////////////////////////////////////////Класът java.util.Formatter//////////////////////////////////////

    /**
     * %[индекс_на_аргумента$][флагове][ширина][.точност]формат
     * <p>
     * - индекс_на_аргумента – незадължителен спецификатор; десетично
     * число, указващо позицията на аргумента. Първият аргумент има
     * индекс "1$", вторият – "2$", и т.н.
     * - флагове – незадължителен спецификатор; списък от символи,
     * модифициращи начина на извеждане на низа. Зависи пряко от
     * формата.
     * - ширина – незадължителен спецификатор; неотрицателно десетично
     * число, посочващо минималния брой от символи, които да бъдат
     * изведени на изхода. Удобен за таблично форматиране.
     * - точност – незадължителен спецификатор; неотрицателно десетично
     * число, ограничаващ броя символи. Зависи от типа формат, широко
     * използван при десетични числа.
     * - формат (conversion) – символ, указващ как да бъде форматиран
     * аргументът. Зависи от типа на подадения аргумент.
     */

    static void usefullMethods() {
        // toString() - заложен в дефиницията на класа Object – базовият клас
        String text = "53";
        int intValue = Integer.parseInt(text); // 53


        /**Връщаната стойност е true, когато подаваният параметър е инициализиран
         (не е обект със стойност null) и съдържанието й е "true", без значение от
         малките и главни букви в него, т.е. всякакви текстове като "true", "True"
         или "tRUe" ще зададат на променливата boolValue стойност true. Всички
         останали случаи връщат стойност false.
         В случай, че подадената на parseXXX метод стойност е невалидна (например
         подаваме "Пешо" при парсване на число), се получава изключение
         NumberFormatException.
         */
        String textBool = "True";
        Boolean boolValue = Boolean.parseBoolean(textBool); // true
    }

    /**
     * Използване на String.format()
     * е статичен метод, чрез който можем да създаваме форматирани стрингове,
     * на които да подаваме параметри. Той е удобен при
     * създаването на шаблони – често срещани текстове с променливи
     * параметри. С негова помощ можем да използваме низове с декларирани
     * параметри и всеки път да променяме единствено параметрите. Можем да
     * направим асоциация с метода System.out.printf(…), който също форматира
     * шаблонен низ и подава стойности на местата на параметрите:
     * <p>
     * System.out.printf("This is a template from %s.", "Mario");
     * <p>
     * Както методът String.format(), така и System.out.printf(…) ползват за
     * извеждането на параметризираните низове класа java.util.Formatter.
     */

    static void stringFormat() {

    }

    static void SimpleDateFormat() {
        String text = "27.10.2008";
        String[] dateElements = text.split("[.]");
        String dayString = dateElements[0];
        String monthString = dateElements[1];
        String yearString = dateElements[2];
        int day = Integer.parseInt(dayString);
        int month = Integer.parseInt(monthString);
        int year = Integer.parseInt(yearString);
        Calendar cal = new GregorianCalendar(year, month - 1, day);
        Date date = cal.getTime(); // Mon Oct 27 00:00:00 EET 2008

//        27.10 отбелязва месец октомври, докато в Java обект това би означавало
//        двадесет и седми ноември.
//
//        Класът java.text.
//                SimpleDateFormat съдържа функционалност, чрез която достигаме до
//        поелегантно преобразуване на типовете. Той ни дава възможност за
//        преобразуване на текстово съдържание към дата, както и обратното.
//
//        Не забравяйте да вмъкнете java.text.SimpleDateFormat или
//        пакета java.text.* в началото на програмата, за да може
//        да използвате възможностите на класа. Класът Date също
//        се намира в java.util пакета и не се импортира автоматично!
//
//                java.text.SimpleDateFormat – шаблони
//        SimpleDateFormat ни предлага по-удобен интерфейс за превръщане на
//        текстови променливи към обекти на класа java.util.Date, и обратно.
//        Той е базиран на работата на шаблони, които дефинират по
//        какъв начин е въведена датата: кои елементи от нея са зададени (ден,
//                месец, година, час, милисекунди и т.н.), какви са разделителите (точки,
//                наклонени черти, интервали), използва ли се 24-часово визуализиране или
//        12-часово и други подробности.
//                Форматиращ
//                символ
//        Описание
//        G Ера
//        Y Година
//        M Месец
//        D Ден от месеца
//        H Час (1-12, сутрин/следобед)
//        H Час (0-23)
//        K Час (1-24)
//        K Час (0-11, сутрин/следобед)
//        M Минути
//        S Секунди
//        S Милисекунди (0-999)
//        E Ден от седмицата
//        D Ден от годината (1-365)
//        F Ден от седмицата в месеца (1-5)
//        w Седмица в годината (1-53)
//        W Седмица в месеца (1-5)
//        A Am/Pm – сутрин/следобед
//        Z Времева зона

//        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
//        Date date = sdf.parse("27.10.2008");
//        System.out.println(date); // Mon Oct 27 00:00:00 EET 2008
    }

    /**
     * Извежда от текста имената и после цифрите на продуктите.
     * split()
     */

    static void namesAndNumberTextSeparator() {
        String catalog =
                "MicrowaveOven: 170, \n" +
                        "AudioSystem: 125, \n" +
                        "TV: 315, \n" +
                        "Refrigerator: 400";
        System.out.println(catalog);
        /* MicrowaveOven: 170,
        AudioSystem: 125,
        TV: 315,
        Refrigerator: 400 */
        String[] products = catalog.split("[\\d\\s,:]+");
        for (String product : products) {
            System.out.print(product + " ");
        }
        // MicrowaveOven AudioSystem TV Refrigerator
        System.out.println();
        String[] prices = catalog.split("\\D+");
        for (String price : prices) {
            System.out.print(price + " ");
        }
        // Result: 170 125 315 400

//        Структурата на каталога е еднотипна: име_на_продукт: цена, последвани от нов ред.
//                При първото разделяне използваме класа \D, като разделяме текста на всички символи,
//                които не са цифри. След това, за да изведем
//        единствено имената на продуктите, използваме по-сложно множество:
//        [\d\s,:], което обхваща всички цифри, всички интервали (необходимо ни
//                е за премахването на разстоянията и знаците за нов ред), запетаи и
//        двоеточия.
//                Виждате, че преди използваните класове е необходимо поставянето на още
//        една наклонена черта, която указва, че наклонената черта от дефиницията
//        на класа не е екраниращ символ.
    }

    /**
     * Слага в отделен стринг всички главни букви.
     * Можете да разгледате документацията за класа Character, защото той
     * предлага и други полезни методи за обработка на символи.
     */
    static void exampleConcatNumbersWithChronometer() {
        System.out.println(new Date());
        String collector = "Numbers: ";
        for (int idx = 1; idx <= 50000; idx++) {
            collector += idx;
        }
        System.out.println(collector.substring(0, 1024));
        System.out.println(new Date());

    }

    /**
     * Takes string 27.10.2008 (dd,m,y), return Date type var Date Mon Oct 27 00:00:00 EET 2008.
     * Returns date formated to GregorianCalendar -> Mon Oct 27 00:00:00 EET 2008.
     * Must save the data in variable type Date varName = simpleDateFormat
     */
    static Date simpleDateFormat(String text) {
        String[] dateElements = text.split("[.]");
        String dayString = dateElements[0];
        String monthString = dateElements[1];
        String yearString = dateElements[2];
        int day = Integer.parseInt(dayString);
        int month = Integer.parseInt(monthString);
        int year = Integer.parseInt(yearString);
        Calendar cal = new GregorianCalendar(year, month - 1, day);
        Date date = cal.getTime(); // Mon Oct 27 00:00:00 EET 2008
        return date;
    }

    static void simpleDateFormatTest() {
        String text = "27.10.2008";
        Date varName = simpleDateFormat(text);
        System.out.println(varName);
    }
    /*--------------------От тук нататък започват задачите за главата.-----------------------------*/

    /**
     * Приема текст и го връща обърнат това е бавния начин.
     */
    static String reverseTextSlowExample(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--)
            sb.append(text.charAt(i));
        return sb.toString();
    }

    /**
     * Изпълнява примера за обръщане реда на буквите в думите (Бавния вариант).
     * <p>
     * 1. Напишете програма, която прочита символен низ, обръща го отзад
     * напред и го принтира обратно на конзолата. Например: "introduction" 
     * "noitcudortni".
     * 1. Използвайте StringBuilder и for цикъл.
     */
    static void reversingAStringSlowExample() {
        String text = "EM edit";
        String reversed = reverseTextSlowExample(text);
        System.out.println(reversed); // tide ME
    }


    /**
     * Принтира на екрана местоположенията на дума в стринг.
     * <p>
     * Приема стринг две променливи едната е стринга другата търсената дума.
     * showAllPlacesOfGivenWord
     */
    static void printLocationsWord(String text, String searchedWord) {
        int index = text.indexOf(searchedWord);
        while (index != -1) {
            System.out.println("substring 'in ' found on index: " + index);
            index = text.indexOf("in", index + 1);
        }
    }

    /**
     * Изпълнява примера за принтиране на всяко местоположение на дадена дума.
     * <p>
     * 2. Напишете програма, която открива колко пъти даден подниз се съдържа
     * в текст. Например, ако търсим подниза "in" в текста:
     * We are living in a yellow submarine. We don't have anything else.
     * Inside the submarine is very tight. So we are drinking all the
     * day. We will move out of it in 5 days.
     * 2. Обърнете регистъра на буквите на текста и използвайте търсене в
     * цикъл. Не забравяйте да използвате indexOf(…) с начален индекс, за да
     * избегнете безкраен цикъл!
     */
    static void showAllPlacesOfGivenWord() {
        String text = "We are living in a yellow submarine. We don't have anything else.\n" +
                "     Inside the submarine is very tight. So we are drinking all the\n" +
                "     day. We will move out of it in 5 days.";

        String searchedWord = "in";
        printLocationsWord(text, searchedWord);
    }


    /**
     * Метода прави с големи букви дума в изречение,
     * заградена с тагове.
     * <p>
     * 3. Даден е текст. Напишете програма, която променя регистъра на буквите
     * на всички места в текста, заградени с таговете <upcase> и </upcase>.
     * Таговете не могат да бъдат вложени.
     * Пример:
     * We are living in a <upcase>yellow submarine</upcase>. We don't
     * have <upcase>anything</upcase> else.
     * Резултат:
     * We are living in a YELLOW SUBMARINE. We don't have ANYTHING else.
     * 3. Използвайте регулярни изрази или indexOf(…) за отварящ и затварящ
     * таг. Пресметнете началния и крайния индекс на текста. Обърнете текста
     * в главни букви и заменете целия подниз отварящ таг + текст +
     * затварящ таг с увеличения текст.
     */

    static void textReplaceWithUpperCaseBetweenTags() {
        String input = "We are living in a <upcase>yellow submarine</upcase>. We don't " +
                "have <upcase>anything</upcase> else.";

        String openingTag = "<upcase>";
        String closingTag = "</upcase>";

        StringBuilder result = new StringBuilder(input);
        int startIdx = result.indexOf(openingTag);

        // Докато има отварящи тагове
        while (startIdx != -1) {
            int endIdx = result.indexOf(closingTag, startIdx);
            if (endIdx == -1) {
                break; // Ако няма затварящ таг, излизаме от цикъла
            }

            // Изчисляваме началото и края на текста, който трябва да бъде променен
            int textStart = startIdx + openingTag.length();
            int textEnd = endIdx;

            // Вземаме текста между отварящия и затварящия таг
            String toUpperCase = result.substring(textStart, textEnd).toUpperCase();

            // Замяна на текста с главни букви
            result.replace(startIdx, endIdx + closingTag.length(), toUpperCase);

            // Търсим следващия отварящ таг
            startIdx = result.indexOf(openingTag, startIdx + toUpperCase.length());
        }

        // Отпечатваме резултата
        System.out.println(result.toString());
    }

    /**
     * Метода има стринг с думи и някои от тях заменя със звездички.
     * <p>
     * 4. Даден е символен низ, съставен от няколко "забранени" думи,
     * разделени със запетая. Даден е и текст, съдържащ тези думи. Да се
     * напише програма, която замества забранените думи в текста със
     * звездички. Пример:
     * Microsoft announced its next generation Java compiler today. It
     * uses advanced parser and special optimizer for the Microsoft JVM.
     * Низ от забранените думи: "Java,JVM,Microsoft".
     * Резултат:
     * ******** announced its next generation **** compiler today. It
     * uses advanced parser and special optimizer for the ********* ***.
     * 4. Разделете забранените думи с метода split(…). За всяка забранена дума
     * обхождайте текста и търсете срещане. При срещане на забранена дума,
     * заменете с толкова звездички, колкото букви се съдържат в забранената
     * дума. Броят може да установите с метода length().
     */

    static void replaceBannedWordsWithStars() {
        String text = "Microsoft announced its next generation Java compiler today. It\n" +
                "     uses advanced parser and special optimizer for the Microsoft JVM.";
        String bannedWords = "Java,JVM,Microsoft";
        String[] bannedWordsArray = bannedWords.split(",");

        for (String bannedWord : bannedWordsArray) {
            // Създаваме низ от звездички със същата дължина като забранената дума
            String stars = "*".repeat(bannedWord.length());
            // Заместваме всички срещания на забранената дума в текста със звездички
            text = text.replaceAll(bannedWord, stars);
        }
        System.out.println(text);
    }

    /**
     * Метода взема масив URL във вид на стринг и го разделя по
     * [protocol]="http"
     * [server]="www.devbg.org"
     * [resource]="/forum/index.php"
     * И принтира.
     * <p>
     * 5. Използвайте регулярен израз или търсете по съответните разделители
     * – две наклонени черти за край на протокол и една наклонена черта за
     * разделител между сървър и ресурс.
     * 5. Напишете програма, която приема URL адрес във формат:
     * [protocol]://[server]/[resource]
     * и извлича от него протокол, сървър и ресурс. Например, при подаден
     * адрес: http://www.devbg.org/forum/index.php резултатът е:
     * [protocol]="http"
     * [server]="www.devbg.org"
     * [resource]="/forum/index.php"
     */

    static void splitURLByProtocolServerResource() {
        // Примерен URL адрес
        String url = "http://www.devbg.org/forum/index.php";

        // Регулярен израз за извличане на протокола, сървъра и ресурса
        String regex = "(https?)://([^/]+)(/.*)";

        // Компилираме регулярния израз
        Pattern pattern = Pattern.compile(regex);

        // Създаваме Matcher за проверка на съвпадението на регулярния израз с URL адреса
        Matcher matcher = pattern.matcher(url);

        // Проверяваме дали URL адресът съвпада с регулярния израз
        if (matcher.matches()) {
            // Извличаме и отпечатваме протокола, сървъра и ресурса
            String protocol = matcher.group(1);
            String server = matcher.group(2);
            String resource = matcher.group(3);

            System.out.println("[protocol]=\"" + protocol + "\"");
            System.out.println("[server]=\"" + server + "\"");
            System.out.println("[resource]=\"" + resource + "\"");
        } else {
            System.out.println("Невалиден URL формат.");
        }
    }

    /**
     * Метода обръща даден масив от думи наобратно като последователност и принтира.
     * <p>
     * Задачата от учебника е:
     * 6. Напишете програма, която обръща думите в дадено изречение.
     * Например: "C# is not C++ and PHP is not Delphi" -> "Delphi not is PHP and
     * C++ not is C#".
     * 6. Можете да решите задачата на две стъпки: обръщане на входния низ на
     * обратно; обръщане на всяка от думите от резултата на обратно.
     */

    static void reverseOrderWordsInString() {
        String sentence = "C# is not C++ and PHP is not Delphi";

        // Разделяме изречението на думи с метода split()
        String[] words = sentence.split(" ");

        // Обръщаме реда на думите
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);
            if (i != 0) {
                reversedSentence.append(" "); // Добавяме интервал между думите
            }
        }

        // Отпечатваме резултата
        System.out.println(reversedSentence.toString());
    }

    /**
     * Метода разделя вграден string по наклонена черта и извежда на екрана резултата.
     * <p>
     * Задачата от учебника е:
     * 7. Колко обратни наклонени черти трябва да посочите като аргумент на
     * метода split(…), за да разделите текста по обратна наклонена черта?
     * Пример: one\two\three
     * Забележка: В Java обратната наклонена черта е екраниращ символ
     * (escaping character).
     * Решения и упътвания
     * 7. Ползвайте 4 наклонени черти: split("\\\\").
     */
    static void splitStringBySlash() {
        String text = "one\\two\\three";

        // Разделяме текста по обратна наклонена черта
        String[] parts = text.split("\\\\");

        // Отпечатваме резултатите
        for (String part : parts) {
            System.out.println(part);
        }
    }

    public static void main(String[] args) {

    }
}
