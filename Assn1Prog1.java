//Assn1Prog1.AndrewPokorney
import java.util.Scanner;
public class Assn1Prog1 {
public static void main(String[] args) {
	
String originalInput;	//Holds original Input from user
String finalOutput;	 
int inputAmount;     

// Create a Scanner object to read input.
Scanner keyboard = new Scanner(System.in);
      
// Get 6 characters.
System.out.print("Please provide 6 characters maximum without spaces: ");
originalInput = keyboard.nextLine();

//Count number of characters from input
inputAmount = originalInput.length();

/*char holders
char in0 = originalInput.charAt(0);
char in1 = originalInput.charAt(1);
char in2 = originalInput.charAt(2);
char in3 = originalInput.charAt(3);
char in4 = originalInput.charAt(4);
char in5 = originalInput.charAt(5);
*/

//output logic
if (inputAmount == 6)
{System.out.println(
originalInput.charAt(0)+"  "
+originalInput.charAt(1)+"  "
+originalInput.charAt(2)+"  "
+originalInput.charAt(3)+"  "
+originalInput.charAt(4)+"  "
+originalInput.charAt(5)+"  ");}
else if (inputAmount == 5)
{System.out.println(
originalInput.charAt(0)+"  "
+originalInput.charAt(1)+"  "
+originalInput.charAt(2)+"  "
+originalInput.charAt(3)+"  "
+originalInput.charAt(4)+"  ");}
else if (inputAmount == 4)
{System.out.println(
originalInput.charAt(0)+"  "
+originalInput.charAt(1)+"  "
+originalInput.charAt(2)+"  "
+originalInput.charAt(3)+"  ");}
else if (inputAmount == 3)
{System.out.println(
originalInput.charAt(0)+"  "
+originalInput.charAt(1)+"  "
+originalInput.charAt(2)+"  ");}
else if (inputAmount == 2)
{System.out.println(
originalInput.charAt(0)+"  "
+originalInput.charAt(1)+"  ");}
else
{System.out.println("Sorry, I'm going to need some more characters to work with!");}

}}