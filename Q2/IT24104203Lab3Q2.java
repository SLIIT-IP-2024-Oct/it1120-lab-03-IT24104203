import java.util.Scanner;

public class IT24104203Lab3Q2 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("what is your basic salary? ");
		double basic = input.nextDouble();

		System.out.println("what is your OT hours count? ");
		double otHrs = input.nextDouble();

		System.out.println("what is your OT hourly rate? ");
		double otRate = input.nextDouble();

		double otAmount = otHrs * otRate;
		double totalSalary = otAmount + basic;

		System.out.println("your total salary for this month is " + totalSalary);

	}
}