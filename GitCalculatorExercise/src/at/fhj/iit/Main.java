/*
 * Authors: Martin Zellner, Lisa Zirkl
 * Task: Simulation Calclator
 * Final Changes: 03.04.2019
 */
package at.fhj.iit;

public class Main {

	public static void main(String[] args) {
		

		Calculator calc = new CalculatorImpl();
	
		calc.addValue(20);	// currently highest number
		calc.addValue(4);	// currently lowester number
		calc.addValue(16);
		
		// add other integers
		calc.addValue(13);
		calc.addValue(5);
		calc.addValue(23);
		// output lowest number 
		System.out.println("Minimum is: "+calc.getMinimum());
		// output highest number
		System.out.println("Maximum is: "+calc.getMaximum());
		// output sum of all numbers
		System.out.println("Sum is: "+calc.sum());
	}
}
