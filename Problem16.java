import java.util.Scanner;

public class Problem16 {
    // if number is divisble by both 3 or 5, but not by 15
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if((a%3==0 || a%5==0) && a%15 !=0 ){
            System.out.println("divisble");
        }
        else{
            System.out.println("not divisble");
        }
    }
}
