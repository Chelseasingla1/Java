import java.util.Scanner;

public class Problem12 {
    // postive ibetger  asinput and check the digit, has three digit or not

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
     
        if(N>=100 && N<=999){
            System.out.println("It is a three digit number");
        }
        else{
            System.out.println("It is not a three digit number");
        }
    }
}
