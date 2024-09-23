import java.util.Random;

public class Terning {
    private final int MAX = 6;
    private int faceValue;
    private Random randomGenerator;

    public Terning () {
        randomGenerator = new Random();
        faceValue = randomGenerator.nextInt(MAX)+1;
    }
    public void roll() {
        faceValue = randomGenerator.nextInt(MAX)+1;
    }
    public int getFaceValue () {
        return faceValue;
    }
}