import java.util.Scanner;

public class Problem11 {
   
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b){
            System.out.println("a is greater than b");
        }
        if(b>a){
            System.out.println("b is greater than a");
        }
     }

}
