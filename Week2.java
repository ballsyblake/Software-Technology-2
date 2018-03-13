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
        System.out.println(x);
     }
     
     static int lonelyInteger(int[] a){
         int len = a.length;
         if (len < 1 || len > 100 || len % 2 ==0){
             return -1;
         }
         for(int i = 0; i < len; i++){
             if (a[i] < 0 || a[i] > 100){
                 return -1;
             }
         }
         
         for (int i = 0; i < len; i++){
             boolean lonely = true;
             for (int j = 0; j < len; j++){
                 if ((i != j) && (a[i] == a[j])){
                     lonely = false;
                     break;
                 }
             }
             if (lonely){
                 return a[i];
             }
         }
         return -1;
     }
}
