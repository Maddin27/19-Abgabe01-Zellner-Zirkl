package at.fhj.iit;

public class Main {

	public static void main(String[] args) {
		
		Calculator calc = new CalculatorImpl();
		
		calc.add(20);	// currently highest number
		calc.add(4);	// currently lowester number
		calc.add(16);
		
		// add other integers
		addValue();
		// output lowest number 
		getMinimum(calc);
		// output highest number
		getMaximum();
		// output sum of all numbers

	}

}
