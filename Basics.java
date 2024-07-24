import java.util.Scanner;
public class Basics {
                public static String calculateBMI(double weight, double height){
                       double BMI = (weight * 0.4535) / (height * 0.0254) * ( height * 0.0254);
                       return String.format("%.2f", BMI);
                  }
        
               public static void main(String[] args){
                      Scanner sc  = new Scanner(System.in);
                      int weight = sc.nextInt();
                      int height = sc.nextInt();
                      System.out.println(calculateBMI(weight, height));
           }
}