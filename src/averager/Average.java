package averager;
import java.util.Scanner;

public class Average {
	
	private static Scanner Keyboard;
	
	private static int GetNumber(int number){
		System.out.println("Enter number " + number + ".");
		return Keyboard.nextInt();
	}
	
	
	private static void DisplayAverageWithArray(int[] numbers) {
		System.out.println("The average of the " + numbers.length + " numbers is :\n");
		
		int sum = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		
		System.out.println(sum / numbers.length);
	}
	
	
	public static void main(String[] args) {
		
		Keyboard = new Scanner(System.in);
		int a,b,c,d;
		
		a = GetNumber(1);
		b = GetNumber(2);
		c = GetNumber(3);
		d = GetNumber(4);
		
		int[] nums = {a, b, c, d, 5, 3, 9, 10, 1000, 123, 3234, 3};
		
		DisplayAverageWithArray(nums);
	}
	private static void DisplayAverage(int a, int b, int c){
		System.out.println("The average of the three numbers is :\n");
		
		int sum=a+b+c;
		System.out.println(sum/3);
	}
}