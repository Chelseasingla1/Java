import java.util.Scanner;

public class Problem19 {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); 
        int y = sc.nextInt();
        
        if(m==1){
            System.out.println("January "+ y + " "+ " 30 days");
        }
        else if(m==2){
            if(y%4==0){
                System.out.println("February "+y + " " + "29 days");
            }
            else{
                System.out.println("February "+y + " "+ "28 days");
            }
        }
        else if(m==3){
            System.out.println("March "+y + " "+ "31 days");
        }
        else if(m==4){
            System.out.println("April "+y+ " " + "30 days");
        }
        else if(m==5){
            System.out.println("May "+y + " "+ "31 days");
        }
        else if(m==6){
            System.out.println("June "+y + " "+ "30 days");
        }
        else if(m==7){
            System.out.println("July "+y+ " " + "31 days");
        }
        else if(m==8){
            System.out.println("August "+y+ " " + "31 days");
        }
        else if(m==9){
            System.out.println("September "+y + " " + "30 days");
        }
        else if(m==10){
            System.out.println("October "+y + " "+ "31 days");
        }
        else if(m==11){
            System.out.println("November "+y+ " " + "30 days");
        }
        else if(m==12){
            System.out.println("December "+y + " "+ "31 days");
        }

    }

    
}
