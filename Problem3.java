
import java.util.Scanner;

public class Problem3 {

public static void main(String[] args) {

int currentPopulation = 312_832_486;
Scanner input = new Scanner(System.in);
System.out.print("Enter the number of years to display the population growth: ");
int numberOfYears = input.nextInt();
double secondsInYear = 365 * 24*60 * 60;
int birthsPerYear = (int)secondsInYear/7;
int deathsPerYear = (int)secondsInYear/13;
int immigrantsPerYear = (int) secondsInYear / 45;
for (int i = 1; i <= numberOfYears; i++) 
{
currentPopulation += birthsPerYear + immigrantsPerYear - deathsPerYear;
System.out.println("The population in " + numberOfYears + " is " + currentPopulation);}
}
}
