import java.util.*;

public class Bit{
        public static void main(String[] args){
           int a =60;
           int b =3;
      
           Scanner sc = new Scanner(System.in);
           String n1 = sc.nextLine();
           System.out.println(n1);
               
           System.out.println("AND: " + (a & b));

           System.out.println("OR: " + (a | b));

           System.out.println("XOR: " + (a^b));
           System.out.println("Complement: " + (-a)); 
    
           System.out.println("Left shift: " + (a << 1));

           System.out.println("RIGHT shift: " + (a >> 1));
           System.out.println("unsigned RIGHT shift: " + (a >>> 1));

        }
}
