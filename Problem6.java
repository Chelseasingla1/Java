import java.util.*;
public class Problem6 {
    public static void main(String[] args) {

        //take an intgeere as input and print absolute value of that number

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N<0){
            System.out.println(N*(-1));
        }
        else{
            System.out.println(N);
        }
        // System.out.println(Math.abs(N));
    }
}
