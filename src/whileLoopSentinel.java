import java.util.Scanner;
//Kode der plusser heltal, indtil sentinel indtastet
public class whileLoopSentinel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast venligt dit første heltal.");
        int SENTINEL = -1;
        int sum = 0;
        int input = scanner.nextInt();

        while (input != SENTINEL) {
            sum += input;
            System.out.println("Næste heltal, bitch");
            System.out.println("Hvis de ikke har flere tal at tilføje til summen, skriv -1");
            input = scanner.nextInt();
            }
        System.out.println("Din endelige sum er: " + sum);
        }
    }


