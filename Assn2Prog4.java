import java.util.Scanner;

//main method
public class Assn2Prog4 {
public static void main(String[] args) {

// Create a Scanner object to read input.
Scanner keyboard = new Scanner(System.in);

//Get a monetary value from the user
System.out.print("\nEnter a value to be converted: ");
double value = keyboard.nextDouble();
keyboard.nextLine();	//consumes the nextDouble spacing

//Get a currency to convert from 
System.out.print("Enter a currency type to convert from (EUR,USD,GBP): ");
String valueFrom = keyboard.nextLine();

//output logic
if (!(value >= 0.0001 && value <= 1000000)){
System.out.println("You have entered "+value+ ", which is outside of the acceptable range of .0001 and 1mm!");}
	else if (valueFrom.equals("EUR") || valueFrom.equals("eur")){
	double convertEURusd = (value * 1.141);
	double convertEURgbp = (value * .7397 );
	System.out.println("Your value, "+value+" EUR, converted is: " +convertEURusd+" USD and "+convertEURgbp+" GBP.");}
		else if (valueFrom.equals("USD") || valueFrom.equals("usd")){
		double convertUSDeur = (value * .8762);
		double convertUSDgbp = (value * .6486 );
		System.out.println("Your value, "+value+" USD, converted is: " +convertUSDeur+" EUR and "+convertUSDgbp+" GBP.");}
			else if (valueFrom.equals("GBP") || valueFrom.equals("gbp")){
			double convertGBPeur = (value * 1.352);
			double convertGBPusd = (value * 1.541 );
			System.out.println("Your value, "+value+" GBP, converted is: " +convertGBPusd+" USD and "+convertGBPeur+" EUR.");}
				else System.out.println("You have entered "+valueFrom+ ", an unacceptable currency type to convert from!");			
}}
	




