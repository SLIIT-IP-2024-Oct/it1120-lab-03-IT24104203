import java.util.Scanner;

public class IT24104203Lab3Q4 {

	public static void main(String[] args) {

	//creating the scanner
	Scanner input = new Scanner(System.in);
	
	//recording the user input
	System.out.println("enter a 5 digit number: ");
	int number = input.nextInt();

	//extract each digit seperately using division and modulus
	int digit1 = (number / 10000) % 10;
	int digit2 = (number / 1000) % 10;
	int digit3 = (number / 100) % 10;
	int digit4 = (number / 10) % 10;
	int digit5 = number % 10;

	//print digits seperately with spaces between them
	System.out.println(digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5);

	}
}