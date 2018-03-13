import java.util.*;

public class Week2{

     public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = in.nextInt();
        }
        int x = lonelyInteger(array);
        System.out.println("the lonely integer is " + x);
     }
     
     static int lonelyInteger(int[] a){
         int len = a.length;
         if (len < 1 || len > 100 || len % 2 ==0){
             return -1;
         }
         for (int i = 0; i < len; i++){
             if (a[i] < 0 || a[i] > 100){
                 return -1;
             }
         }
         int x = 0;
         for (int i = 0; i < len; i++){
             x ^= a[i];
         }
         return x;
     }
}
