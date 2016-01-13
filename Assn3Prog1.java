//Assn3Proj1.Andrew.Pokorney

import java.util.Scanner;
public class Assn3Prog1 {
public static void main(String [] args) {

Scanner keyboard = new Scanner(System.in);

//User line input
System.out.print("Please provide a line of input greater than 1 character: ");
String input = keyboard.nextLine();

//Input Validation 1, number of characters
while(input.length() < 2){
System.out.print("Invalid input, you did not provide enough characters!");
System.out.print("\nPlease provide a new line of input greater than 1 character: ");
input = keyboard.nextLine();
int inputNum = input.length();
}

//User A/B selections
System.out.print("Please select between option A and option B. ");
System.out.print("\nOption A will identify uppercase letters. ");
System.out.print("\nOption B will identify every second character. ");
System.out.print("\nPlease enter either A or B now: ");
String letter = keyboard.nextLine();

//Input Validation 2, AaBb only
while(!(letter.equals("A") | letter.equals("B") | letter.equals("a") | letter.equals("b"))){
System.out.print("You entered "+letter+", an invalid selection.");
System.out.print("\nPlease re-enter either A or B: ");
letter = keyboard.nextLine();
}

//Part a logic, uppercase identifier
//Define a variable to test logic
char entryA = '0';
//Aa logic 
if(letter.equals("A") || letter.equals("a")){
	System.out.print("\nYour input for option a. is: "+input);
	System.out.print("\nYour output for option a. is: ");
	//loop and uppercase test
	for(int i = 0; i < input.length(); i++){
		char inputCharA = input.charAt(i);
		entryA = inputCharA;
			if (entryA == 'A' | entryA == 'B' | entryA == 'C' | entryA == 'D' | entryA == 'E' | entryA == 'F' | entryA == 'G' | entryA == 'H' | entryA == 'I' |entryA == 'J' | entryA == 'K' | entryA == 'L' | entryA == 'M' | entryA == 'N' | entryA == 'O' | entryA == 'P' | entryA == 'Q' | entryA == 'R' | entryA == 'S' | entryA == 'T' | entryA == 'U' | entryA == 'V' | entryA == 'W' | entryA == 'X' | entryA == 'Y' | entryA == 'Z'){
			System.out.print(inputCharA);}}}

//Part b logic, every other character
//Define a variable to test logic
char entryB = '0';
//Bb logic
if(letter.equals("B") || letter.equals("b")){
	System.out.print("\nYour input for option b. is: "+input);
	System.out.print("\nYour output for option b. is: ");
		//Loop 2+ from char 1
		for(int j = 1; j < input.length(); j+=2){
		char inputCharB = input.charAt(j);
		System.out.print(inputCharB);}}	
	

}}




