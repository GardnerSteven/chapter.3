package youDoIt;

import java.util.Scanner;

public class delgadosTacos 
{

	public static void main(String[] args) 
	{
		double burrito = 1.50;
		double taco = 1.00;
		double quesadilla = 1.00;
		double churro = 1.50;
		double fajitas = 2.00;
		double carnitas = 2.00;
		double enchiladas = 3.00;
		double salsa = 0.50;
		double queso = 0.50;
		double guacamole = 0.75;
		Scanner keyboard = new Scanner (System.in);
		displayMenu();
		System.out.println("How many burritos");
		int burritosOrdered = keyboard.nextInt();
		
		System.out.println("How many tacos");
		int tacosOrdered = keyboard.nextInt();
		
		System.out.println("How many quesadillas");
		int quesadillasOrdered = keyboard.nextInt();
		
		System.out.println("How many churros");
		int churrosOrdered = keyboard.nextInt();
		
		System.out.println("How many fajitas");
		int fajitasOrdered = keyboard.nextInt();
		
		System.out.println("How many carnitas");
		int carnitasOrdered = keyboard.nextInt();
		
		System.out.println("How many enchiladas");
		int enchiladasOrdered = keyboard.nextInt();
		
		System.out.println("How much salsa");
		int salsaOrdered = keyboard.nextInt();
		
		System.out.println("How much queso");
		int quesoOrdered = keyboard.nextInt();
		
		System.out.println("How much guacamole");
		int guacamoleOrdered = keyboard.nextInt();
		
		double total = (burrito * burritosOrdered) + (taco * tacosOrdered) +
				(quesadilla * quesadillasOrdered) + (churro * churrosOrdered) +
				(fajitas * fajitasOrdered) + (carnitas * carnitasOrdered) +
				(enchiladas *enchiladasOrdered) + (salsa * salsaOrdered) +
				(queso * quesoOrdered) + (guacamole * guacamoleOrdered);
		
		System.out.println("Your total is " + total);
		
		displayTacoTruck();
	}
	public static void displayMenu()
	{
	
		System.out.println("burrito = 1.50"); 
		System.out.println("taco = 1.00");
		System.out.println("quesadilla = 1.00"); 
		System.out.println("churro = 1.50"); 
		System.out.println("fajitas = 2.00");
		System.out.println("carnitas = 2.00");
		System.out.println("enchiladas = 3.00"); 	
		System.out.println("salsa = 0.50");
		System.out.println("queso = 0.50"); 
		System.out.println("guacamole = 0.50");
		
		
		
		
		
		
		
	}
	public static void displayTacoTruck()
	{
	
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx x");
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx   x");
		System.out.println("xx             xxxx    xx     x");
		System.out.println("xx             xxxx    xx       x");
		System.out.println("xx             xxxx    xx         x");
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.println("xxx  xxxx               xxxx    xxxxxxx");
		System.out.println("xx  xxxxxx             xxxxxx    xxxxxx");
		System.out.println("xx   xxxx               xxxx      xxxxx");
		
	}

}
