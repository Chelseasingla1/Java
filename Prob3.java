
import java.util.Scanner;

public class Prob3 {
     // find number of days in month // enter month and year 

     // test case -  2, 2012 - feb 2012 29 days
     // 3,2015 - march 2015 31 days  

     public static void main(String[] args) {
    
     Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); 
        int y = sc.nextInt();

        switch(m){
        case 1 :
            System.out.println("January "+ y + " "+ " 30 days");
        break;
       case 2:
            if(y%4==0){
                System.out.println("February "+y + " " + "29 days");
            }
            else{
                System.out.println("February "+y + " "+ "28 days");
            }
        break;
       case 3:
            System.out.println("March "+y + " "+ "31 days");
        break;
       case 4:
            System.out.println("April "+y+ " " + "30 days");
        break;
        case 5:
            System.out.println("May "+y + " "+ "31 days");
        break;
       case 6:
            System.out.println("June "+y + " "+ "30 days");
        break;
        case 7:
            System.out.println("July "+y+ " " + "31 days");
        break;
        case 8:
            System.out.println("August "+y+ " " + "31 days");
        break;
        case 9:
            System.out.println("September "+y + " " + "30 days");
        break;
       case 10:
            System.out.println("October "+y + " "+ "31 days");
        break;
        case 11:
            System.out.println("November "+y+ " " + "30 days");
        break;
       case 12:
            System.out.println("December "+y + " "+ "31 days");
        break;
    }

     }

}
