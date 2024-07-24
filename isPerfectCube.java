import java.util.Scanner;

public class isPerfectCube{
        public static void main(String[] args){
             Scanner sc = new Scanner(System.in);
             double n = sc.nextDouble();
             double s = Math.cbrt(n);
             if(s == Math.floor(s) && s == Math.ceil(s)){
                  System.out.println("Perfect cube");
              }
              else{
                   System.out.println("Not a perfect cube");
              }
     }
}