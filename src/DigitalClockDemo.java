public class DigitalClockDemo {
    public static void main(String[] args) {

        ClockDisplay clock = new ClockDisplay();
        for (int i = 0; i < 61; i++)
        {
            clock.timeTick();
            System.out.println("Klokken er: "+clock.getTime());
        }
    }
}
