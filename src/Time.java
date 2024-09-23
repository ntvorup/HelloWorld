public class Time {
    public static void main(String[] args) {
        int seconds = 39;
        int hours = 9;
        int minutes = 55;

        int hoursSlut = 10;
        int minutesSlut = 22;
        int secondsSlut = 12;

        int sidenMidnatErDerGået = 29700;
        int sekunderPåEtDøgn = 86400;
        int sekunderBrugt = (hours*60*60)+(minutes*60);
        int sekunderTilbage = (24*60*60)-sekunderBrugt;

        String sekunder = "Sekunder:";
        String minutter = "Minutter:";
        String timer = "Timer:";

        String dot = ".";
        String space = " ";
        String kolon = ":";

        System.out.println(hours + dot + minutes + dot + seconds);
        System.out.println("Jeg har brugt" + space + sekunderBrugt + space + "sekunder på opgaven");

        System.out.println("Procentdel af timen, der er gået: ");
        System.out.println(minutes * 100 / 60);

        double minutesD = 55;
        System.out.println("Brøkdel af timen, der er gået: ");
        System.out.println(minutesD / 60);
        System.out.println("Brøkdel af timen, der er gået: ");
        System.out.println((double)minutes/60);

        final int MINUTES_PER_HOUR = 60;


    }
}