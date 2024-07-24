import java.util.Scanner;
public class distFormula{
       public static void main(String args[]){
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter x1, x2, y1, y2");
            
           double x1 = sc.nextDouble();
           double x2 = sc.nextDouble();
           double y1 = sc.nextDouble();
           double y2 = sc.nextDouble();
 
// distance

          double d = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1,2) + Math.pow(x2,2) + Math.pow(y2,2));
          System.out.println("Area" + d);
      }
}