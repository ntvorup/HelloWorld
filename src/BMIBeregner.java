import java.util.Scanner;
class BMIBeregner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Velkommen til BMI-Beregneren!");
        System.out.println("Først, indtast venligst din vægt, i kg, for at udregne dit BMI.");
        double weight = input.nextDouble();
        System.out.println("Indtast nu venligst din højde i meter.");
        double height = input.nextDouble();
        final double BMI = (weight/(height*height));
        System.out.println("Med en højde på " + height + " meter, og en vægt på " + weight + " kg, er dit Body Mass Index (BMI) på: " + BMI);
        if (BMI < 18.5) {
            System.out.println("BMI under 18,5: Undervægt - Lav risiko for fedmerelaterede komplikationer.");
        }
        else if (BMI < 25) {
            System.out.println("BMI 18,5-24,9: Normal vægt - Middel risiko for fedmerelaterede komplikationer.");
        }
        else if (BMI < 30) {
            System.out.println("BMI 25-29,9: Overvægt - Let øget risiko for fedmerelaterede komplikationer.");
        }
        else if (BMI < 35) {
            System.out.println("BMI 30-34,9: Fedme - Moderat til høj øget risiko for fedmerelaterede komplikationer.");
        }
        else if (BMI <= 40) {
            System.out.println("BMI 35-39,9: Svær fedme - Høj risiko for fedmerelaterede komplikationer.");
        }
        else {
            System.out.println("BMI over 40: Svær fedme - Høj risiko for fedmerelaterede komplikationer.");
        }
}
}