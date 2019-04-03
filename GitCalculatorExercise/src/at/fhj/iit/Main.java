package at.fhj.iit;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator() {
			@Override
			public int sum() {
				return 0;
			}

			@Override
			public int getMaximum() {
				return 0;
			}

			@Override
			public int getMinimum() {
				int min = 0;
				return min;
			}

			@Override
			public void addValue(int value) {
				ArrayList c = new ArrayList();
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
		calc.getMinimum();
		// output highest number
		calc.getMaximum();
		// output sum of all numbers

	}

}
