//Assn1Prog3.AndrewPokorney
import java.util.Scanner;
public class Assn1Prog3{
	public static void main (String[] args){
		
		int y;	//hold value of Year
		int a;		//remainder of y/19
		int b;		//quotient of y/100
		int c; 	//remainder of y/100
		int d;		//quotient of b/4
		int e;		//remainder of b/4
		int g;		//quotient of 8*b+13/25
		int h;		//remainder of 19*a+b-d-g+15/30
		int j;		//quotient of c/4
		int k;		//remainder of c/4
		int m;		//quotient of a+11*h/319
		int r;		//remainder of 2*e+z*j-k-h+m+32/7
		int n;		//quotient of h-m+r+90/25
		int p;		//remainder of h-m+r+n+19/32
		
		
// Create a Scanner object to read input.
Scanner keyboard = new Scanner(System.in);
      
// Get Year from user
System.out.print("\nEnter a four-digit year: ");
y = keyboard.nextInt();

//Divide y (year) by 19 and call the remainder a. Ignore the quotient
a = y%19;

//Divide y by 100 to get a quotient b and a remainder c.
b = y/100;
c = y%100;

//Divide b by 4 to get a quotient d and a remainder e.
d = b/4;
e = b%4;

//Divide 8 * b + 13 by 25 to get a quotient g. Ignore the remainder.
g = (8*b+13)/25;

//Divide 19 * a + b - d - g + 15 by 30 to get a remainder h. Ignore the quotient.
h = (19*a+b-d-g+15)%30;

//Divide c by 4 to get a quotient j and a remainder k.
j = c/4;
k = c%4;

//Divide a + 11 * h by 319 to get a quotient m. Ignore the remainder.
m = (a+11*h)/319;

//Divide 2 * e + 2 * j - k - h + m + 32 by 7 to get a remainder r. Ignore the quotient.
r = (2*e+2*j-k-h+m+32)%7;

//Divide h - m + r + 90 by 25 to get a quotient n. Ignore the remainder. This is the month
n = (h-m+r+90)/25;

//Divide h - m + r + n + 19 by 32 to get a remainder p. This is the day
p = (h-m+r+n+19)%32;

System.out.println("\nFor year "+ y + ", the Easter month is " + n + " and day " + p +".");
}}
