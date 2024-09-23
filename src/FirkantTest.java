public class FirkantTest {
    public static void main(String[] arg) {

    }
    private double side;
    private double højde;

    public FirkantTest(double side, double højde) {
        this.side = side;
        this.højde = højde;
    }

    public double beregnAreal() {
        return this.side * this.højde;
    }

    public String firkantType() {
        if (this.side == this.højde) {
            return "Det er et kvadrat";
        } else {
            return "Det er en rektangel";
        }
    }
}

