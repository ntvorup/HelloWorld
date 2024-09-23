import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberToGuess = 7;
        int userGuess = 0;
        int antalGæt = 0;
        System.out.println("Gæt et tal mellem 1-10");
        while (numberToGuess != userGuess) {
            String input = scanner.next();
            System.out.println("Prøv igen.");
            if (scanner.hasNext(String.valueOf(numberToGuess))); {
                System.out.println("Nice");
            }
            antalGæt++;
        }
        System.out.println("Du gættede tallet, tillykke!");
        System.out.println("Du har brugt " + antalGæt + " antal forsøg på at gætte tallet");
    }
}

