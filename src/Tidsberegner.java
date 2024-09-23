import java.util.Scanner;
class Tidsberegner {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Hvor mange hele timer er der gået siden midnat?");
    int hours = input.nextInt();
        System.out.println("Der er gået " + hours + " timer siden midnat");
        System.out.println("Hvor mange minutter er der gået siden midnat?");
    int minutes = input.nextInt();
        System.out.println("der er gået " + minutes + " minutter siden midnat" );
        System.out.println("Hvor mange sekunder er der gået siden midnat?");
    int seconds = input.nextInt();
        System.out.println("der er gået " + seconds + " sekunder siden midnat");
        System.out.println("Hvor mange timer, minutter og sekunder er der gået siden midnat?");
        System.out.println("Der er gået " + hours + " timer " + minutes + " minutter " + seconds + " sekunder siden ");
        System.out.println((minutes*60+hours*60*60+seconds) + " sekunder er gået siden midnat");

}
}
