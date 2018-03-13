import java.util.*;

public class Week4Task1and2{

    public static void main(String []args){
        int numberOfElements = 20;
        int[] arr = new int[numberOfElements];
        int maxInt = 10;
        // Generate elements in the array with random integers < maxInt
        int seed = 1000;
        Random rand = new Random(seed);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(maxInt);
        }
        // Output the array
        System.out.print("Unsorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // Call the sorting method        
        countingSort(arr);
        // Output the array after sorted
        System.out.print("Sorted array:   ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
     }
     
    public static void countingSort(int[] array) {
        // Find maximum element in the array
        int maxInteger = 0;
        for (int i = 0; i < array.length; i++) {
            if (maxInteger < array[i]) {
                maxInteger = array[i];
            }
        }
        // Count how many times each element appears in the array
        int[] countingArray = new int[maxInteger + 1];
        for (int i = 0; i < array.length; i++) {
            int integerToBeCounted = array[i];
            if (integerToBeCounted >= 0) {
                countingArray[integerToBeCounted]++;
            }
        }
        // Sort the array
        int currentIndex = 0;
        for (int i = 0; i <= maxInteger; i++) {
            for (int k = 0; k < countingArray[i]; k++) {
                array[currentIndex] = i;
                currentIndex++;
            }
        }
    }
}
