import java.util.Scanner;
//Lader en indtaste antal varer man skal scanne. Derefter skal man enkeltvis indtaste varernes pris. Så vil maskinen udregne summen.
public class forLoopCashier {
    public static void main(String[] args) {
        //Få antal varer scannet
        System.out.println("Enter the number of items you would like to scan");
        Scanner scanner = new Scanner(System.in);

        int quantity = scanner.nextInt();
        double total = 0;

        for(int i=0; i<quantity; i++){
            System.out.println("Enter the cost of the item: ");
            double price = scanner.nextDouble();

            total = total + price;
        }
        scanner.close();
        System.out.println("Your total is: " + total + " DKK. " + "Thank you for shopping with us!");
    }
}