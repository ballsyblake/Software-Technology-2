public class TowerSolver{

     public static void main(String []args){
        towerOfHanoi(4, "needle A", "needle B", "needle C");
     }
     
     static void towerOfHanoi(int n, String needleA, String needleB, String needleC) { 
        // stopping condition: move 1 disk       
        if (n == 1){           
            System.out.println("move disk from " + needleA + " to " + needleC);
        }
        else{           
            // move n-1 disks from needleA to needleB
            towerOfHanoi(n - 1, needleA, needleC, needleB);           
            // move the last disk from needleA to needleC           
            System.out.println("move disk from " + needleA + " to " + needleC);           
            // move n-1 disks from needleB to needleC
            towerOfHanoi(n - 1, needleB, needleA, needleC);       
        }   
     }
}
