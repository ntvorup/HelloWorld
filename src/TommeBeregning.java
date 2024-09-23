import java.util.Scanner;
class TommeBeregning {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Hvilket tal tommer ønsker de at konvertere til cm?");
    double tommer = input.nextDouble();
    final double TOMMER_TIL_CENTIMETER_FORHOLD = (2.54);
    double centimeter = TOMMER_TIL_CENTIMETER_FORHOLD*tommer;
    System.out.println(tommer + " tommer, er i cm: " + TOMMER_TIL_CENTIMETER_FORHOLD + " cm");

}
}