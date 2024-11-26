package Chapter20PrinciplesOfOOP.Inheritance;

class MainToString {
    protected static void main(String[] args) {
        Felidae cat = new Lion(true,150);
        System.out.println("cat. kak da izkaram pola i kilogramite kato sloja toString");

        System.out.println(cat.toString());

        AfricanLion africanLion = new AfricanLion(true,15);
        System.out.println(africanLion);
        // (AfricanLion, male: true, weight: 15)
//        Забележете, че извикването на toString() става скрито. Когато на метода
//        println() подадем някакъв обект, този обект първо се преобразува до
//        стринг чрез toString() метода му и след това се отпечатва в изходния
//        поток. Така при печатане на конзолата няма нужда изрично да преобразу
//        ваме обектите до стринг.
    }
}
