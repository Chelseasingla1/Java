import java.util.*;
public class Problem9 {
    public static void main(String[] args) {

        //given value of l and b check if it is square

        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
int b = sc.nextInt();

        if(l==b){
            System.out.println("It is a square");
        }
        else{
            System.out.println("It is not a square");
        }
    }
}
