import java.util.Scanner;
//Loop indtil man vælger at fjerne sang fra repeat ved at indtaste "yes"
public class whileLoopRepeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isOnRepeat = true;
        while(isOnRepeat) {
            System.out.println("Playing current song");
            System.out.println("Would you like to take this song " + "off of repeat? If so, answer yes");
            String input = scanner.next();

            if("yes".equals(input)) {
                isOnRepeat = false;
            }
        }
        System.out.println("OK! Playing next song");
    }
}
