//Kode der finder det mindste og det største tal i en talrække/et array).
public class arrayNumberSorting {
    public static void main(String[] args) {
        int largeArray[] = {8, -24, 12, 13, 2, 25, 65, 34, 1, 99, 76, 87, 109, 54};

        int smallest = largeArray[0];
        int largest = largeArray[0];

        for(int i = 0; i <= 13; i++) {
            if (largeArray[i] < smallest) smallest = largeArray[i];
            if (largeArray[i] > largest) largest = largeArray[i];
            }
        System.out.println("The smallest value in the Array is: " + smallest);
        System.out.println("The largest value in the Array is: " + largest);
        }
    }