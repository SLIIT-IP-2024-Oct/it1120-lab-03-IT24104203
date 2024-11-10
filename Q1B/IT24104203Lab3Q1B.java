import java.util.Scanner;

public class IT24104203Lab3Q1B {
	public static void main(String[] args) {
		double unitPrice, weight, totalPrice;

		Scanner input = new Scanner(System.in);

		//input the price
		System.out.println("Enter the price of 1kg of rice = ");
		unitPrice = input.nextDouble(); 

		//input the weight
		System.out.println("Enter the number of kilograms you want ot buy = ");
		weight = input.nextDouble();

		//total payable
		totalPrice = unitPrice * weight;
		double payable = totalPrice * 0.9;
		
		System.out.println("your total is = " + payable);

	}
}