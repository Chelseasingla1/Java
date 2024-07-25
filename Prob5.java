import java.util.*;

public class Prob5 {
    // h and t 

     public static void main(String[] args) {
    
     Random r = new Random();
       int m = r.nextInt(2); 

       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       System.out.println(m);
       if(n==m){
            System.out.println("Right");
     }
        else{
            System.out.println("Wrong");
            

        }
    
     }

}
