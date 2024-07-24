import java.util.Scanner;
public class Code1{
       public static void main(String[] args){
           
            double distance;
            double milesPerGallon;
            double pricePerGallon;
 
            System.out.println("Enter the driving distance in miles:");
            Scanner sc = new Scanner(System.in);
            distance = sc.nextDouble();
        
            System.out.println("miles per gallon");
            milesPerGallon = sc.nextDouble();

            System.out.println("price of gas per gallon");
            pricePerGallon = sc.nextDouble();

            double tripCost = (distance/milesPerGallon)*pricePerGallon;
           
            System.out.print("COST");
            System.out.printf("%.2f", tripCost);
}
}