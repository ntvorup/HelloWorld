public class FirkantTestMain {
    public static void main(String[] args) {
        FirkantTest firkant1 = new FirkantTest(4.2, 3.5);
        System.out.println("Arealet af første firkant: " + firkant1.beregnAreal());
        System.out.println(firkant1.firkantType());

        FirkantTest firkant2 = new FirkantTest(5.6, 5.6);
        System.out.println("Arealet af anden firkant: " + firkant2.beregnAreal());
        System.out.println(firkant2.firkantType());
    }
}
/* Firkant firkantA = new Firkant(4.2, 3.5);
Firkant firkantB = new Firkant (5.6, 5.6);

double beregnAreal = firkant1.beregnAreal();
double beregnAreal = firkant2.beregnAreal();

System.out.println("arealet på firkanten er: "+beregnAreal)

 */