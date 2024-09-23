import java.util.Scanner;
public class midCringe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast dit navn:");
        String navn = scanner.nextLine();
        if (navn.equalsIgnoreCase("frederik")) {
            System.out.println("mid og cringe");
        } else {
            System.out.println("Hej, " + navn + "!");
        }
        scanner.close();
    }
}