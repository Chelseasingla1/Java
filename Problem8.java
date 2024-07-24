import java.util.*;

public class Problem8 {
    public static void main(String[] args) {

        // given l and b of rectangle check area of rectangle less than or grater than parameter
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();

        int Area = l*b;
        int p = 2*(l+b);

        if(Area>p){
            System.out.println("Area is greater than perimeter");
        }
        else{
            System.out.println("Area is less than perimeter");
        }
    }
}
