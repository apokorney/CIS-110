import java.util.Scanner;

//main method
public class Assn2Prog2 {
public static void main(String[] args) {

// Create a Scanner object to read input.
Scanner keyboard = new Scanner(System.in);

//variable declaration
int calories;
int caloriesTemp;
int fat;
double caloriesFat;
double caloriesFatPercent;

// Get Total calories from user
System.out.print("Enter total calories: ");
calories = keyboard.nextInt();

//Get fat total from user
System.out.print("Enter total grams of fat: ");
fat = keyboard.nextInt();

//Output vairable calculations
caloriesFat = (fat*9);

//Output logic
if (calories < fat){
System.out.println("Fat grams cannot be greater than calories!");
System.exit(0);}
	if (calories > 1 && fat >= 0){
	caloriesTemp = calories;
	caloriesFatPercent = ((caloriesFat/caloriesTemp)*100);
	System.out.println("The percentage of calories from fat is: "+caloriesFatPercent+"%");}
		if ((((caloriesFat/calories)*100) <= 30) && (fat >= 0)){
		System.out.println("This is a low fat food!");}
			else if (calories < 1){
			System.out.println("You enetered "+calories+" cal, calories cannot be less than one!");}
				else if (fat < 0) {
				System.out.println("You entered "+fat+"g. fat, Fat grams cannot be less than zero!");}
}}		
