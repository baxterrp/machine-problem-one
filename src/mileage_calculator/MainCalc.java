package mileage_calculator;

public class MainCalc {
	static MileageCalculator mileageCalculator;
	
	public MainCalc() {
		mileageCalculator = new MileageCalculator();
	}

	public static void main(String[] args) {

		// do if statement from user input on what they want to do 
		// if thing is do mileage calc
		mileageCalculator.Calculate();
	}
}
