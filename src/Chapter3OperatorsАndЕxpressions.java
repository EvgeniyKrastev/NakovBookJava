class Chapter3OperatorsАndЕxpressions {

    static void ZadachiGlava3() {
        Object obj = "string";
        String str = "\'";
        str += (String) obj; // we need to cast if we want to insert data on other type of literal
        System.out.println(obj + " " + str);
        String firstName = "", LastName = "";
        short age = 0;
        boolean isMale = false;
        int id = 0, uniqueNumber = 0;
        //задачи страница 125
        //1.Напишете израз, който да проверява дали дадено цяло число е четно
        //или нечетно.
        //System.out.println((20%2==0)? "четно" : "нечетно");

        //2. Напишете булев израз, който да проверява дали дадено цяло число се
        //дели на 5 и на 7 без остатък.

        //System.out.println((20%5==0&&20%7==0)? "четно" : "нечетно");

        System.out.println("3. Напишете израз, който да проверява дали дадено цяло число съдържа  7 за трета цифра (отдясно на ляво).");
        //3. Разделете числото на 100 и го запишете в нова променлива. Нея
        //разделете на 10 и вземете остатъкът. Остатъкът от делението на 10 е
        //третата цифра от първоначалното число. Проверете равна ли е на 7.
        int x = 765, y = 0, z = 0;
        y = x / 100;

        System.out.println((y % 10) == 7 ? "равно е на 7" : "не е равно на 7");
        System.out.println("4. Напишете израз, който да проверява дали третия бит на дадено число е 1 или 0.");
        System.out.println(7 << 2);
        System.out.println("11. Дадено е число n и позиция p. Напишете поредица от операции, които \r\n"
                + "да отпечатат стойността на бита на позиция p от числото n (0 или 1). \r\n"
                + "Пример: n=35, p=5 -> 1. Още един пример: n=35, p=6 -> 0. ");

        int n = 35; // 00100011
        int p = 6;
        int i = 1; // 00000001
        int mask = i << p;

        // If i & mask are positive then the p-th bit of n is 1
        System.out.println((n & mask) != 0 ? 1 : 0);
    }

    static void main(String[] args) {

    }
}
