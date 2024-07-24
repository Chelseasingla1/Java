import java.util.*;

public class Problem1 {
 public static void main(String[] args) {
        
Scanner sc = new Scanner(System.in);
int years = sc.nextInt();


double births = changeToyears(7) , deaths = changeToyears(13), immigrants = changeToyears(45);
           for(int i =1; i<=years; i++){
                     System.out.print("Total population for year " + i + ": ");
                     double fPop = years*(births + immigrants - deaths);
                     System.out.printf("%1.0f", fPop);
                     System.out.println();
            }
         } 

         public static double changeToyears(double changeInSec)
         {
          double yrs = 3600 * 365 * 24;
          double changeInYears = yrs/changeInSec;
          return changeInYears;
         }
}
// one birth every 7 sec , one death every 13 seconds, one new imingrant evry 45 secsm , to use scanner class to get the number of years
// and display population after number of years,
// should be cast into an integer
