import java.util.*;

public class Prob2 {
    
    // game edition quiz 
    // two randome funcs n1 nad n2
    // quiz creation
    public static void main(String[] args) {
     Random r = new Random();
     Scanner sc = new Scanner(System.in);
        int a = r.nextInt(101); 
        int b = r.nextInt(101);
        int c = a+b;
        System.out.println("What is the sum of " + a + " and " + b + "?");
int x = sc.nextInt();
        if(c == x){
            System.out.println("Right");
           
        }
        else{
            System.out.println("wrong, answer is " + c);
        }
        
    }
}
