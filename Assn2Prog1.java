import java.util.Scanner;
/*Write a program to accept three integer values from the user where all are > -1000 and < 1000.  
If an invalid value is entered, end the program, displaying a message, 
stating what the user did wrong as well as the incorrect inputed value.  
When three valid numbers are entered, sort the three numbers from lowest to highest 
and output the three integers per below:
You entered 94, 98, and -1.  The sorted order from lowest to highest is: -1, 94 then 98.
*/

//main method
public class Assn2Prog1 {
public static void main(String[] args) {

// Create a Scanner object to read input.
Scanner keyboard = new Scanner(System.in);

//variable declaration
int temporary;

// Get 3 vals from user >-1000 and <1000
System.out.println("Enter 3 values between -1000 and +1000: ");
int a1 = keyboard.nextInt();
int a2 = keyboard.nextInt();
int a3 = keyboard.nextInt();
int num1 = a1;
int num2 = a2;
int num3 = a3;

//output logic and # range check
if ((num1 > 999 || num1 < -999)){
System.out.println(num1 + " is either greater than 1000 or less than -1000 [exit]");
System.exit(0);}
	if ((num2 > 999 || num2 < -999)){
	System.out.println(num2 + " is either greater than 1000 or less than -1000 [exit]");
	System.exit(0);}
		if ((num3 > 999 || num3 < -999)){
		System.out.println(num3 + " is either greater than 1000 or less than -1000 [exit]");
		System.exit(0);}
			if (num1 > num2) {
			temporary = num1;
			num1 = num2;
			num2 = temporary;}
				if (num2 > num3) {
				temporary = num2;
				num2 = num3;
				num3 = temporary;}
					if (num1 > num2) {
					temporary = num1;
					num1 = num2;
					num2 = temporary;}
else System.out.print("You entered "+a1+", "+a2+", "+a3+". The sorted order from lowest to highest is: " +num1+", "+num2+" then "+num3+".");
  }
}




	


