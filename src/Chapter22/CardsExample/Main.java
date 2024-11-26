package Chapter22.CardsExample;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    /**
     * Стъпка 1 – Дефиниране на клас "карта"
     * Тъй като трябва да разбъркваме карти, можем да започнем с дефиницията
     * на класа "карта", тъй като ако нямаме как да представяме една карта, няма
     * да има и как да представяме тесте карти и няма да има как да дефинираме
     * метода за разбъркване на картите. Вече споменахме, че представянето на
     * картите е извън обхвата на поставената задача, така че всякакво
     * представяне би ни свършило работа.
     * Ще дефинираме клас "карта" с полета лице и боя. Ще използваме символен
     * низ за лицето (с възможни стойности “2", “3", “4", “5", “6", “7", “8", “9", “10",
     * “J", “Q" или “K") и изброен тип за боята (с възможни стойности “спатия",
     * “каро", “купа" или “пика"). Класът Card би могъл да изглежда по следния
     * начин:
     *
     * Изпробване на класа "карта"
     * */


    public static void printCards(ArrayList<Card> cards) {
        for (Card card : cards) {
            System.out.print(card);
        }
        System.out.println();
    }

//    Методът няма нужда да връща нищо, защото не създава
//    нов ArrayList за резултата, а оперира върху вече създаден.
//    Какво име да дадем на метода? Според препоръките за работа с методи
//    трябва да дадем "говорящо" име – такова, което описва с 1-2 думи какво
//    прави метода. Подходящо за случая е името performSingleExchange. Името
//    ясно описва какво прави методът: извършва единично разместване.
//    Нека първо дефинираме метода, а след това напишем тялото му. Това е
//    добра практика, тъй като преди да започнем да реализираме даден метод
//    трябва да сме наясно какво прави той, какви параметри приема, какъв
//    резултат връща и как се казва. Ето как изглежда дефиницията на метода:


    //  Стъпка 3 – Единично разместване
    private static void performSingleExchange(
            ArrayList<Card> cards){
            Random rand = new Random();
        int randomIndex = 1 + rand.nextInt(cards.size()-1);
        Card firstCard = cards.get(0);
        Card randomCard = cards.get(randomIndex);
        cards.set(0, randomCard);//indeksiraneto v java zapo4va ot 0 zatova e 0 tuk
        cards.set(randomIndex, firstCard);
    }

    public static void shuffleCards(ArrayList<Card> cards) {
        if (cards.size() > 1) {
            Random rand = new Random();
            int exchangesCount = cards.size() + rand.nextInt(2);
            for (int i=1; i<=exchangesCount; i++) {
                performSingleExchange(cards);
            }
        }
        // razmera na cikala e koklkoto kartite zat6toto broq karti e nai dobre tolkowa puti da se
        // razburka kolkoto sa kartite
    }

//    public static void shuffleCards(ArrayList<Card> cards) {
//
//    }

    public static void main(String[] args) {
        /**
         * Стъпка 2 – Създаване и отпечатване на тесте карти
         * */

//        ArrayList<Card> cards = new ArrayList<Card>();
//        cards.add(new Card("2", Suit.CLUB));
//        cards.add(new Card("7", Suit.HEART));
//        cards.add(new Card("A", Suit.SPADE));
//        cards.add(new Card("J", Suit.CLUB));
//        cards.add(new Card("10", Suit.DIAMOND));
//
//        printCards(cards);
//
//        System.out.println("Initial deck: ");
//        printCards(cards);
//
//        shuffleCards(cards);
//        System.out.println("After shuffle: ");
//        printCards(cards);

//Сериозен тест на обичайния случай
        ArrayList<Card> cards = new ArrayList<Card>();
        String[] allFaces = new String[] {"2", "3", "4", "5",
                "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        Suit[] allSuits = new Suit[] {
                Suit.CLUB, Suit.DIAMOND, Suit.HEART, Suit.SPADE};
        for (String face : allFaces) {
            for (Suit suit : allSuits) {
                Card card = new Card(face, suit);
                cards.add(card);
            }
        }

//        CardsShuffle.shuffleCards(cards);
//        CardsShuffle.printCards(cards);
    }



}
