import java.util.Scanner;

public class SkoledageEllerWeekend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int brugerValg = 0;
        Ugedag ugedag = null;

        while (true) {
            System.out.println("Skriv et tal fra 1-7, for at tjekke ugedagen");
            Ugedag[] ugedage = Ugedag.values(); // returnere array af mulige værdier i ugedag-enummet
            for (int i = 0; i < ugedage.length; i++) { // kører igennem hver ugedag i enum, og udskriver hver dag med tilhørende tal.
                System.out.println((i + 1) + ". " + ugedage[i]);
            }
            if (scanner.hasNextInt()) {
                brugerValg = scanner.nextInt();
                if (brugerValg >= 1 && brugerValg <= 7) {
                    break;
                } else {
                    System.out.println("Tallet er udenfor 1-7.");
                }
            } else {
                System.out.println("Prøv igen. Måske med et tal?");
                scanner.next();
            }
        }
        switch (brugerValg) {
            case 1:
                ugedag = Ugedag.MANDAG;
                break;
            case 2:
                ugedag = Ugedag.TIRSDAG;
                break;
            case 3:
                ugedag = Ugedag.ONSDAG;
                break;
            case 4:
                ugedag = Ugedag.TORSDAG;
                break;
            case 5:
                ugedag = Ugedag.FREDAG;
                break;
            case 6:
                ugedag = Ugedag.LØRDAG;
                break;
            case 7:
                ugedag = Ugedag.SØNDAG;
                break;
            default:
                System.out.println("Ugyldigt valg.");
                return;
        }
        switch (ugedag) {
            case MANDAG:
            case TIRSDAG:
            case ONSDAG:
            case TORSDAG:
            case FREDAG:
                System.out.println("Det er hverdag, du skal i skole!");
                break;
            case LØRDAG:
            case SØNDAG:
                System.out.println("Det er weekend, bare sov videre");
                break;
            default:
                System.out.println("Ugyldig dag.");
        }
        scanner.close();
    }
}
