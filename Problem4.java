// solve quadratic equation 
// then two root of quadratic equation
// r1 = a + b - 2ac / 
//a2 + b2 
//r1 = -b + 2b^ 2 - 4ac/ 2a
//r2 = -b - 2b^2 - 4ac/2a
//b^2-4ac = d
// d > 0 + two roots , d< 0 - no real roots, d =0 1 root 

// enter values a, b ,c , compare d if p+ 2 roots 
//note : Math.pow(x,0.5) square root of x
// ax^2 + bx +c

import java.util.Scanner;

public class Problem4 {

public static void main(String[] args) {

System.out.println("enter a:" );
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
System.out.println("enter b:" );
int b = sc.nextInt();
System.out.println("enter c:" );
int c = sc.nextInt();

int d = b*b - 4*a*c;

if(d>0){
System.out.println("Two roots");
}
else if(d<0){
System.out.println("Noroots");

}
else if(d==0){
System.out.println("1 roots");
}

}
}
