import java.util.Scanner;

public class Prob4 {
    
 public static void main(String[] args) {
    
     Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); 
        
        if(m>99 && m<1000){
            int a = m%10;
            int b = m/100;
            if(a==b){
                System.out.println("Palindrome");
            }
            else{
                System.out.println("Not Palindrome");
            }
        }
    // 3 diigt integer it is palindrome or not
 }
}
