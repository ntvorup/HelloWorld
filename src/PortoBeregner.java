import java.util.Scanner;
public class PortoBeregner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Velkommen til PostNords pristjek!");
        System.out.println("Angiv venligst hvor meget din pakke vejer i gram");
        int weight = input.nextInt();
        int price = 0;

        if (weight < 1 && weight > 2000) {
            System.out.println("Med en vægt på " + weight + " gram, vil dit brev desværre ikke kunne sendes.");
        } 
        else if (weight > 0 && weight < 100) {
                price = 25;
            }
        else if (weight > 100 && weight <= 250) {
                price = 50;
            }
        else if (weight > 250 && weight <= 2000) {
                price = 75;
                System.out.println("Med en vægt på " + weight + ", vil dit brev kunne sendes for " + price + "DKK");
            }
        }
    }

