import java.util.Scanner;

public class Problem13 {
    // check if number is divisible by 5 and 3
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
        if(N%3==0 && N%5==0){
            System.out.println("Number is divisible by 3 and 5");
        }
        else{
            System.out.println("Number is not divisible by 3 and 5");
        }
    }
}
