public class NumberDisplay {
    private int limit;
    private int value;

    public NumberDisplay(int rollOverLimit) {
        limit = rollOverLimit;
        value = 0;
    }
    // Simpel get-metode, der returnerer værdien af value
    public int getValue() {
        return value;
    }
    // Metode, der tjekker value. Hvis value < 0, returneres String som består af "0", samt værdien af value. Ellers returneres "", samt værdi af value.
    public String getDisplayValue() {
        if (value < 10) {
            return "0" + value;
        } else {
            return "" + value;
        }
    }
    // Set-metode, der gør det muligt at sætte value-attributtet til en anden værdi
    public void setValue(int replacementValue) {
        if (replacementValue >= 0 && replacementValue < limit) {
            value = replacementValue;
        }
    }
    // Metode, der gør det muligt for value at stige, dog hvis value+1 overstiger limit, er det kun den resterende værdi over limit, som skal tilskrives value
    public void increment() {
        value = (value + 1) % limit;
    }
}