import java.util.Random;
//denne kode løber random numre indtil de to terningslag sammenlagt bliver = 7
public class dieRoll {
    public static void main(String[] args) {
        Random rand = new Random();
        int rollOne = rand.nextInt(6) +1;
        int rollTwo = rand.nextInt(6) +1;
        int sum = rollOne+rollTwo;
        int wantedSum = 7;

        System.out.println(rollOne + " + " + rollTwo + " = " + sum);

        while (sum!=wantedSum) {
            rollOne = rand.nextInt(6) +1;
            rollTwo = rand.nextInt(6) +1;
            sum = rollOne+rollTwo;
            System.out.println(rollOne + " + " + rollTwo + " = " + sum);
        }
    }
}