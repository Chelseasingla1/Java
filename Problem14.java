import java.util.Scanner;
public class Problem14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println("a is greater");
            }
        }
        else if(b>c){
            System.out.println("b is greater");
        }
        else if(c>a){
            System.out.println("c is greater");
        }
    //three positive integer as input and print highest value
}}
