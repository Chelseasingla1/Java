
import java.util.Scanner;
public class Problem15 {
    
// a,b,c side of traingle

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if((a+b > c)  && (b+c > a) && (a+c > b) ){
            System.out.println("Triangle");
        }
        // else if(b+c > a ){
        //     System.out.println("Triangle");
        // }
        // else if(a+c > b){
        //     System.out.println("Triangle");
        // }
        else{
            System.out.println("Not a Triangle");
        }

    }
}
