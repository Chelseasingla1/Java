// input r, length of cylinder , find out area and volume

import java.util.Scanner;

public class Problem5 {

             public static void main(String[] args) {

             Scanner sc = new Scanner(System.in);

              double r = sc.nextDouble();
              double l = sc.nextDouble();

              double area = 3.14*r*r;
              double volume = 3.14*r*r*l;

System.out.println("Area: " + area);
System.out.println("Volume: " + volume);

}
}