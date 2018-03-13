import java.util.*;
import java.lang.*;
import java.io.*;

public class Week5Task2{

    public static void main(String []args){
        int x = 1;
        int max = 10;
        whileLoopMethod(x, max);
        recursiveMethodNoLoop(x, max);
        recursiveMethod(x, max);
        
    }
    
    public static void whileLoopMethod(int x, int max){
        while (x < max) {
            for (int i = 0; i < x; i++){
                System.out.print(x);
            }
            System.out.println();
            x++;
        }
    }
    // My own version of the recursive method without any looping functionality
    // Will also provide recursive with looping functionality
    public static void recursiveMethodNoLoop(int x, int max){
        if(max == 1){
            System.out.println();
            return;
        }
        else{
            if((x+max) == 10){
                System.out.println();
                recursiveMethod(x+1,x+max);
            }
            else{
                System.out.print(x);
                recursiveMethod(x,max-1);
            }
            
            
        }
    }
    
    public static void recursiveMethod(int x, int max){
        if(x>=max)
            return;
        else{
            for (int i = 0; i < x; i++){
                System.out.print(x);
            }
            System.out.println();
            recursiveMethod(x+1,max);
        }
    }
} 


