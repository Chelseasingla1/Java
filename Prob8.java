import java.util.*;

public class Prob8 {
    
    // rock paper scissors game
    // random number 0,1,2 scissors , rock, paper
// enter a number display a messgae whther computer winds 

// 
     public static void main(String[] args) {
   
        Random r = new Random();
Scanner sc = new Scanner(System.in);


int c= r.nextInt(3);
System.out.println("enter a numbre");
int u = sc.nextInt();

if(c== 0 && u ==1){
    System.out.println("You won");
    System.out.println("random number was" + c);
     }
     else if(c==1 && u==2){
            System.out.println("You won");
            System.out.println("random number was" + c);
        }
        else if(c==2 && u==0){
            System.out.println("You won");
              System.out.println("random number was" + c);
        }
        else if(c==u){
            System.out.println("Tie");
            System.out.println("random number was" + c);
        }
        else if(c==1 && u==0){
            System.out.println("You lost");
            System.out.println("random number was" + c);
     }
        else if(c==2 && u==1){
                System.out.println("You lost");
                System.out.println("random number was" + c);
            }
            else if(c==0 && u==2){
                System.out.println("You lost");
                System.out.println("random number was" + c);
            }
            else{
                System.out.println("Invalid input");
                System.out.println("random number was" + c);
            }

    }

}
