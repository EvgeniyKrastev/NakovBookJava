package Chapter20PrinciplesOfOOP.Polimorphysum;

class AfricanLion extends Lion {

    public void catchPray(Object pray) {
        super.catchPray(pray);
        System.out.println("AfricanLion.catchPray");
        System.out.println("calling super.catchPray(pray)");
    }
}
