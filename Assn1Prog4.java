//Assn1Prog4.AndrewPokorney
import java.util.Scanner;
public class Assn1Prog4 {
public static void main(String[] args) {
	
double originalBal;		//Holds original balance from user
double annualRate;		//Holds annual interest rate	 
double monthlyRate;		//Hold value for monthly interest rate    
double monthOne;		//Holds value for month 1
double monthTwo;		//Holds value for month 2
double monthThree;		//Holds value for month 3
double annualPercent;	//Holds value for monthly percentage

// Create a Scanner object to read input.
Scanner keyboard = new Scanner(System.in);
      
// Get user's initial balance
System.out.print("\nEnter your initial balance: ");
originalBal = keyboard.nextDouble();

//Get user's annual interest rate
System.out.print("\nEnter your anticipated interest rate (0.00): ");
annualRate = keyboard.nextDouble();

//output logic
annualPercent = annualRate;
monthOne = (originalBal+(originalBal*(annualPercent/100))/12);
monthTwo = (monthOne+(monthOne*(annualPercent/100))/12);
monthThree = (monthTwo+(monthTwo*(annualPercent/100))/12);

//output to user
System.out.print("\nInitial Balance: "+originalBal);
System.out.print("\nAnnual interest rate in percent: "+annualPercent);
System.out.print("\nEnd of first month balance: "+monthOne);
System.out.print("\nEnd of second month balance: "+monthTwo);
System.out.println("\nEnd of third month balance: "+monthThree);

}}




