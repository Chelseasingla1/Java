import java.util.Scanner;

public class Problem18 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
        int b = sc.nextInt(); 
        int c = sc.nextInt(); 

        //sort 3 integer , non decreasing order
if(a>b){
int temp =a;
a=b;
b= temp;
}
if(a> c){
    int temp =a;
    a=c;
    c= temp; 
}
if( b> c){
    int temp =b;
    b=c;
    c= temp; 
}

        
System.out.println(a + " " + b + " " + c);
        }
}
