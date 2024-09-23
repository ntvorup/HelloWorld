public class Person {
 private String fornavn;
 private String efternavn;
 private double skostørrelse;

    public Person(String fornavn, String efternavn, double skostørrelse) {
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.skostørrelse = skostørrelse;
    }
    public void udskrivPerson() {
        System.out.println("Navn: " + fornavn + " " + efternavn + ". Skostørrelse: " + skostørrelse);
    }
}
