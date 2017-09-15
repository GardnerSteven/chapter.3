package tutorial;

import java.util.Scanner;

public class DemoRaise 
{

	public static void main(String[] args) 
	{
		double salary1;
		double startingWage;
		Scanner inputDevice = new Scanner(System.in);
		System.out.print("Please enter a wage >> ");
		salary1 = inputDevice.nextInt();
		inputDevice.nextLine();
		Scanner inputDevice1 = new Scanner(System.in);
		System.out.print("Please enter a wage >> ");
		startingWage = inputDevice.nextInt();
		inputDevice.nextLine();
		predictRaise(salary1);
		predictRaise(startingWage);

	}
	
	public static void predictRaise(double salary)
	{
		double newSalary;
		final double RAISE_RATE = 1.10;
		newSalary = salary * RAISE_RATE;
		System.out.println("Current salary: " + salary + " 	 After raise: "
				+ newSalary);
		
		
	}
}
