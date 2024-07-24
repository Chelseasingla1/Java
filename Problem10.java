import java.util.*;

public class Problem10 {
    public static void main(String[] args) {
        // for a class teahcer to determine grades 
        // 91-100 excellent
        // 81-90 very good
        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt();

        if(g>=91 && g<=100){
            System.out.println("Excellent");
        }
        else if(g>=81 && g<=90){
            System.out.println("Very Good");
        }
        else if(g>= 71 && g<= 80){
            System.out.println("Good");
        }
        else if(g>= 61 && g<= 70){
            System.out.println("Average");
        }
        else if(g>= 51 && g<= 60){
            System.out.println("Below Average");
        }
        else if(g>= 40 && g<= 50){
            System.out.println("Improvement needed");
        }
        else{
            System.out.println("Fail");
        }
    }

}
