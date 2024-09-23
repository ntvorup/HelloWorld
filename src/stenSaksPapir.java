import java.util.Random;
import java.util.Scanner;

public class stenSaksPapir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] muligheder = {"sten", "saks", "papir"};
        String valg;
        int bruger = 0;
        int computer = 0;
        int antalSpil = 0;

        while (bruger < 2 && computer < 2) {
            System.out.println("Choose your fighter: sten, saks eller papir - Bedst ud af 3");
            valg = scanner.nextLine();
            String computerValg = muligheder[random.nextInt(3)];
            System.out.println("Computeren valgte: " + computerValg);

            if (valg.equals(computerValg)) {
                System.out.println("Det blev uafgjort");


            } else if ((valg.equals("sten")) && (computerValg.equals("saks")) || (valg.equals("saks")) && (computerValg.equals("papir")) || (valg.equals("papir")) && (computerValg.equals("sten"))) {
                System.out.println("Tillykke du vandt! Du valgte " + valg + ", og computeren valgte " + computerValg);
                antalSpil++;
                bruger++;
                System.out.println("Antal spil: " + antalSpil + ", dig: " + bruger + ", computer: " + computer);

            } else {
                System.out.println("Kom igen, computeren valgte: " + computerValg + ", der vinder over" + valg);
                antalSpil++;
                computer++;
                System.out.println("Antal spil: " + antalSpil + ", dig: " + bruger + ", computer: " + computer);
            }
        }
        System.out.println("Tak for spillet!");
    }
}

