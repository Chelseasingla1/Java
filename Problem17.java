import java.util.Scanner;

public class Problem17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // day of week
        int b = sc.nextInt(); // future day of week

        int f = (a + b) % 7;
        if (a == 0) {
            System.out.println("Sunday");
        } else if (a == 1) {
            System.out.println("Monday");
        } else if (a == 2) {
            System.out.println("Tuesday");
        } else if (a == 3) {
            System.out.println("Wednesday");
        } else if (a == 4) {
            System.out.println("Thursday");
        } else if (a == 5) {
            System.out.println("Friday");
        } else if (a == 6) {
            System.out.println("Saturday");
        }
        if (b == 0) {
            System.out.println("Sunday");
        } else if (f == 1) {
            System.out.println("Monday");
        } else if (f == 2) {
            System.out.println("Tuesday");
        } else if (f == 3) {
            System.out.println("Wednesday");
        } else if (f == 4) {
            System.out.println("Thursday");
        } else if (f == 5) {
            System.out.println("Friday");
        } else if (f == 6) {
            System.out.println("Saturday");
        }
        // find future dates program propmtpt enter integer date of today's day of the
        // week
        // sunday - monday 0-6,
        // also prompts the user to enter a number after today for a furture day
        // display furture day of week

    }
}
