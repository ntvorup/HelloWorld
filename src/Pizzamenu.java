import java.util.Scanner;

public class Pizzamenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Velkommen til Marios italiano pizze, vælg venligts en af vores fire signatur pizze, ved at indtaste nummeret:");
        System.out.println("1. Margerita");
        System.out.println("2. Vesuvio");
        System.out.println("3. Hawaii");
        System.out.println("4. Pepperoni");

        int valg = scanner.nextInt();

        switch (valg) {
            case 1:
                System.out.println("Du har valgt en Margherita");
                break;
            case 2:
                System.out.println("Du har valgt en Vesuvio");
                break;
            case 3:
                System.out.println("Du har valgt en Hawaii");
                break;
            case 4:
                System.out.println("Du har valgt en Pepperoni");
                break;
            default:
                System.out.println("Du har ikke valgt en pizza fra menuen");
                break;
        }
        scanner.close();
        System.out.println("Din pizza er klar om 10-15 habibi");
    }
}