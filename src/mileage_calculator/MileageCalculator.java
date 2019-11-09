package mileage_calculator;

import java.util.Scanner;

public class MileageCalculator {

	private double miles = 0;
	private double gallons = 0;
	private Scanner scanner;
	
	public MileageCalculator() {
		scanner = new Scanner(System.in);
	}
	
	private double GetDoubleFromUser(String messageToUser) {
		System.out.println(messageToUser);
		return scanner.nextDouble();
	}
	
	private void CalculateMileage() {
		double mpg = miles / gallons;
		
		System.out.println("gas_milage output with inputs of " + miles + " miles and " + gallons + " : " + mpg);
	}
	
	public void Calculate() {
		System.out.println("Welcome to milage calculator!");
		miles = GetDoubleFromUser("Enter Mileage");
		gallons = GetDoubleFromUser("Enter Gallons");
		
		CalculateMileage();
			
		scanner.close();
	}
}
