/*
 * Authors: Martin Zellner, Lisa Zirkl
 * Task: Simulation Calclator
 * Final Changes: 03.04.2019
 */
package at.fhj.iit;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> c = new ArrayList<Integer>();
		
		Calculator calc = new Calculator() {
			@Override
			public int sum() {
				int sum = 0;
				for(int i = 0; i < c.size(); i++)
				{
					sum += c.get(i);
				}
				return sum;
			}

			@Override
			public int getMaximum() {
				int max = 0;
				for(int i = 0; i < c.size(); i++)
				{
					if(c.get(i) > max)
					{
						max = c.get(i);
					}
				}
				return max;
			}

			@Override
			public int getMinimum() {
				int min = Integer.MAX_VALUE;
				for(int i = 0; i < c.size(); i++)
				{
					if(c.get(i) < min)
					{
						min = c.get(i);
					}
				}
				return min;
			}

			@Override
			public void addValue(int value) {
				c.add(value);
			}
			
		};
		
		calc.addValue(20);	// currently highest number
		calc.addValue(4);	// currently lowester number
		
		
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
