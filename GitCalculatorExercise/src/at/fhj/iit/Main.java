package at.fhj.iit;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> c = new ArrayList<Integer>();
		
		Calculator calc = new Calculator() {
			@Override
			public int sum() {
				
				return 0;
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
				int min = 0;
				return min;
			}

			@Override
			public void addValue(int value) {
				c.add(value);
			}
			
		};
		
		calc.addValue(20);	// currently highest number
		calc.addValue(4);	// currently lowester number
		calc.addValue(16);
		
		// add other integers
		calc.addValue(13);
		calc.addValue(5);
		calc.addValue(23);
		// output lowest number 
		System.out.println(calc.getMinimum());
		// output highest number
		System.out.print(calc.getMaximum());
		// output sum of all numbers
		

	}

}
