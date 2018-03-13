import java.util.*;

public class Anagram{
    
    public static void main(String []args){
        Scanner user_input = new Scanner(System.in);
        
        System.out.print("Enter the first word: ");
        String x = user_input.next();
        
        System.out.print("Enter the second word: ");
        String y = user_input.next();        
        
        if (isAnagram(x,y))
            System.out.println(x + " is an anagram of " + y);
        else
            System.out.println(x + " is not an anagram of " + y);
    }
     
    public static boolean isAnagram(String x, String y){
        String[] x1 = x.split("");
        String[] y1 = y.split("");
        
        if (x1.length == y1.length){
        
            int num = 0;
            for (int i = 0;i < x1.length; i++) {
                
                if (x1[num].equals(y1[i]) && !x1[num].equals(y1[num])) {
                    String temp = x1[num];
                    x1[num] = x1[i];
                    x1[i] = temp;
                    i = num;
                }
                else if(x1[num].equals(y1[num]) && num < x1.length - 1){
                    num += 1;
                }
            }
            if (Arrays.equals(x1, y1))
                return true;
            else
                return false;
        }
        else
            return false;
        
    }
}