package at.fhj.iit;

import java.util.ArrayList;

public class CalculatorImpl implements Calculator {
	
	ArrayList<Integer> c = new ArrayList<Integer>();
	
	//returns the sum of all integers added
	public int sum() {
		int sum = 0;
		for(int i = 0; i < c.size(); i++)
		{
			sum += c.get(i);
		}
		return sum;
	}
	//returns the maximum of all added integers
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
	//returns the minimum of the added integers
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
	//method to add integers to ArrayList
	public void addValue(int value) {
		c.add(value);
	}

}
