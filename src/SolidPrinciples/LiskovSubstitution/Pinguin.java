package SolidPrinciples.LiskovSubstitution;

class Pinguin  implements Bird {
    @Override
    public void eat(){
        System.out.println("Pinguin is eating!");
    }
}
