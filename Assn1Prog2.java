//Assn1Prog2.AndrewPokorney
/*Write a program that asks the user to enter the name of his/her favorite city
Use a String variable to store the input
Display: 
number of character in the city name, 
city name in CAPS, city name in lower, 
first char of city*/

import java.util.Scanner;
public class Assn1Prog2{
public static void main (String [] args){
	
// Create a Scanner object to read input.
Scanner keyboard = new Scanner(System.in);

//Variable data types
String capName;
String lowerName;
int numChars;
String firstChar;
String city;
char cityChar;

// Get the favorite city from user
System.out.print("What is your favorite city? ");
city = keyboard.nextLine();

//Output logic
capName = city.toUpperCase();
lowerName = city.toLowerCase();
numChars = city.length();
cityChar = city.charAt(0);


//Output to user
System.out.println("Your city, "+city+","+" is "+numChars+" characters long.");
System.out.println("Your city, "+city+","+" in upper case letters is "+capName+".");
System.out.println("Your city, "+city+","+" in lower case letters is "+lowerName+".");
System.out.println("The first character in your city, "+city+", is "+ '"'+cityChar+'"' +".");

}}