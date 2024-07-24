import java.util.Scanner;

public class MinutesToYearsDays{
       public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Enter number of minutes");
       long m = sc.nextLong();// minutes
       
       final int min_day = 60*24;
       final int min_yr = min_day * 365;
       long y = m/min_yr; // years
    
       long remianm = m%min_yr; // remaining minutes
       long d = remianm/min_day; // days
 
       System.out.println(m + " minutes" + y + "years" + d +               "days" );
          }
}

       
