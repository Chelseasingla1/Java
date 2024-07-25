import java.util.Random;
import java.util.Scanner;

public class Prob7 {
    
    public static void main(String[] args) {
   //  Scanner sc = new Scanner(System.in);
        Random r = new Random();
   //     int a 

//
//        write a program that display a random coordinate in a rectangle
// rectabng;e is centered at (0,0) width =100, height =200

        int x = r.nextInt(101);
        int y = r.nextInt(201);
        System.out.println(" (" + x + "," + y + ")");
    }
}
