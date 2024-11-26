package Chapter20PrinciplesOfOOP.Polimorphysum;

class Main{
    public static void main(String[] args) {
        Animal cat = new Felidae();
        cat.printInformation();
        // Output:
        ////   I am Cat.
        ////   Miaoooow!


        Animal lion = new Lion();

        // Za6to ne moga da stigna do catchPray metoda da go izwikam.
        // Za6toto deklariram s Animal i inicializiram s africanLion.
        // klasowete koito gi nqma v Animal ne mogat da se izpolzwat s inicializaciqta na AfricanLion
        //Klasowete koito gi nqma v Animal no gi ima w nasledniga, ne mogat da se polzwat s tazi deklaraciq.
        Animal afLion = new AfricanLion();

        // Zatova tuk deklariram AfricanLion i inicializiram pak s nego i stava vsi4ko.
        AfricanLion aafLion = new AfricanLion();
        // tuk podavam afLion za6toto metoda iska porosto nqkakuv obekt da se podawa, ako mahna
        // promenlivite ot definiciqta na metoda 6te se opravi vsi4ko
        aafLion.catchPray(afLion);

    }
}
