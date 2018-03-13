import java.util.*;

public class SortingAlgorithms{

     public static void main(String []args){
         
        int numberOfElements = 10000;
        int[] arr = new int[numberOfElements];
        
        Random rand = new Random(2017);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt();
        }
        
        long start = System.currentTimeMillis();
        selectionSort(arr);
        long end = System.currentTimeMillis();
        long diff = end - start;
        System.out.println("Running time: " + diff + " milliseconds.");


     }
     
     public static void selectionSort (int[] array) {
        int minIndex; // index of smallest item in each pass
        int pass, j, n = array.length;
        int temp;
        
        // sort array[0]..array[n-2], and array[n-1] is in place
        for (pass = 0; pass < n - 1; pass++) {
            // scan from index pass; set minIndex to pass
            minIndex = pass;
            // j scans the sublist array[pass+1]..array[n-1]
            for (j = pass + 1; j < n; j++) {
                // update minIndex if smaller element found
                if (array[j] < array[minIndex])
                minIndex = j;
            }
            // place smallest item in array[pass]
            if (minIndex != pass) {
                temp = array[pass];
                array[pass] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

}
