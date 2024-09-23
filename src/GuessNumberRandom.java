import javax.print.attribute.standard.PrinterMakeAndModel;
import java.util.Random;
import java.util.Scanner;

public class GuessNumberRandom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int numberToGuess = rand.nextInt(10) +1;
        int userGuess = 0;
        int antalGæt = 0;
        System.out.println("Gæt et tal mellem 1-10");

        while (userGuess != numberToGuess) {

                if (userGuess > numberToGuess) {
                    System.out.println("Du skal gætte lavere");
                }
                else if (userGuess < numberToGuess) {
                    System.out.println("Du skal gætte højere");
                }
                antalGæt++;
            }
            System.out.println("Du gættede tallet, tillykke!");
        System.out.println("Du har brugt " + antalGæt + " antal forsøg på at gætte tallet");
    }
}
