//Assn3Prog2.AndrewPokorney

import java.util.Scanner;
public class Assn3Prog2 {
public static void main(String [] args) {

Scanner keyboard = new Scanner(System.in);

//int input = keyboard.nextInt();
int ticketsleft = 100;
int ticketssold = 0;
int customers  = 0;
int input = 0;

//User input, validation, and output loop
while(ticketsleft > 0){
//Initial user input
System.out.print("\nHow many tickets would you like (max of 4)? ");
System.out.print(ticketsleft+" tickets are left: ");
input = keyboard.nextInt();
//User input validation and variable control
if(input > 0 && input <= 4 && input <= ticketsleft){
	ticketssold = ticketssold + input;
	ticketsleft = ticketsleft - input;
	customers++;
	System.out.println("\nYou will receive "+input+" tickets");}
else if(input > ticketsleft){ System.out.print("There are not enough tickets left! You asked for "+input+", only "+ticketsleft+" remain");
}
else System.out.print("The number you entered, "+input+", is not between 1 and 4. ");
}

//Tickets sold out message
if(ticketsleft == 0){
System.out.println("All 100 tickets have been sold. There were "+customers+" buyers.");}

}}