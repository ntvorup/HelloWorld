public class iterateThroughArray {
    public static void main(String[] args) {
        double[] arr = {4.5, 25.3, 12.1, 34.0, 15.5};
        double min = arr[0];
        double max = arr[0];
        double tal = 12.1;

        /*for(double i : arr) {
            System.out.print(i+" ");
            System.out.println();
        }
        for(double i : arr) {
            System.out.print(i+" ");
            System.out.println();
        }
        for (double i : arr) {
            double squared = Math.pow(i, 2);
            System.out.print(squared);
            System.out.println();
        }

        // finder det mindste og største tal
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
         */
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == tal) {
                System.out.println("Hurra! vi fandt 12.1! Det stop på indeks: " + i);
            }
        }
    }
}