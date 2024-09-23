public class TerningSpil {
    public static void main(String[] args) {
        Terning terning1 = new Terning();
        Terning terning2 = new Terning();

        terning1.roll();
        terning2.roll();

        System.out.println("Terning 1 har rullet: " + terning1.getFaceValue() + ". Terning 2 har rullet: " + terning2.getFaceValue());
    }
}