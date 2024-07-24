import java.util.Scanner;
 public class ScannerExample {
 public static void main(String[] args) {

// Create a Scanner object

Scanner scanner = new Scanner (System. in);

// Taking a string input
System.out.print("Enter your name: ");

String name = scanner.nextLine();

// Taking an integer input

System.out.print("Enter your age: *");
int age = scanner.nextInt();

//Taking a double input

System.out.print("Enter your salary: ");

double salary = scanner.nextDouble();

//Taking a boolean input

System.out.print("Are you married (true/false)");
boolean isMarried = scanner.nextBoolean();

// Displaying the input received
System.out.println("Name: " + name);

System.out.println("Age:" + age);
System.out.println("Salary:"+ salary);
System.out.println("Married:" + isMarried);

}
}