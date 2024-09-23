public class arrayKlasseOpgave {
    public static void main(String[] args) {
        int[] arr = new int[] {34, 117};
        double[] arr2 = new double[] {3.4, 2.5, 1.2, 6.7};
        String[] arr1 = {"Hej", "med", "dig"};

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (String i : arr1) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (double i : arr2) {
            System.out.print(i +" ");
        }
    }
}
