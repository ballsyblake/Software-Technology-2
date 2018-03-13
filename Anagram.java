import java.io.*;
import java.util.*;

public class Anagram{
    
     public static void main(String []args){
         
         Scanner in = new Scanner(System.in);
         System.out.print("Enter the first word: ");
         String word1 = in.nextLine();
         System.out.print("Enter the second word: ");
         String word2 = in.nextLine();
         if (isAnagram(word1, word2)){
             System.out.println(word1 + " is an anagram of " + word2);
         }
         else{
             System.out.println(word1 + " is not an anagram of " + word2);
         }         
     }
     
     public static boolean isAnagram(String x, String y){
         
         char [] x1 = x.toCharArray();
         Arrays.sort(x1);
         char [] y1 = y.toCharArray();
         Arrays.sort(y1);
        return Arrays.equals(x1, y1);
     }
}

