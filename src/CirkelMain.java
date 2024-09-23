public class CirkelMain {
    public static void main(String[] args) {

        Cirkel cirkel = new Cirkel(9);

        double beregnAreal = cirkel.beregnAreal();
        double fåRadius = cirkel.fåRadius();

        System.out.println("Arealet af en cirkel, med en radius på: " + fåRadius + ", er: " + beregnAreal);
    }
}
