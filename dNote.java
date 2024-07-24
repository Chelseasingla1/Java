public class dNote{
          public static void main(String args[]){
                 double births = changeToyears(7) , deaths = changeToyears(13), immigrants = changeToyears(45);
                 double initialPop = 312032486;
                 for(int i =1; i<=5; i++){
                     System.out.print("Total population for year " + i + ": ");
                     initialPop += births + immigrants - deaths;
                     System.out.printf("%1.0f", initialPop);
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