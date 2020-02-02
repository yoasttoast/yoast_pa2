package yoast_p2;
import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		double weight, bmi;
		int height, num = 0;
		
		while (num != 3) {
			System.out.println("Please select an option:");
			System.out.println("1: BMI in Customary (lbs, in)");
			System.out.println("2: BMI in Metric (Kg, m)");
			System.out.println("3: Quit");
			
			num = input.nextInt();
			
			if (num == 1) {
				System.out.println("Please enter your height in inches:");
				height = input.nextInt();
				System.out.println("Please enter your weight in pounds:");
				weight = input.nextDouble();
				bmi = (703 * weight) / (double)height;
				System.out.println("BMI Categories:");
				System.out.println("Underweight: < 18.5");
				System.out.println("Normal: 18.5-24.9");
				System.out.println("Overweight: 25.0-29.9");
				System.out.println("Obesity: 30 or Greater");
				System.out.printf("Your BMI: %.2f\n", bmi);
			}
			
			else if (num == 2) {
				System.out.println("Please enter your height in meters:");
				height = input.nextInt();
				System.out.println("Please enter your weight in kilograms:");
				weight = input.nextDouble();
				bmi = (703 * weight) / (double)height;
				System.out.println("BMI Categories:");
				System.out.println("Underweight: < 18.5");
				System.out.println("Normal: 18.5-24.9");
				System.out.println("Overweight: 25.0-29.9");
				System.out.println("Obesity: 30 or Greater");
				System.out.printf("Your BMI: %.2f\n", bmi);
			}
			
			else if (num == 3) {
				System.out.println("Thank you!");
			}
			
			else if(num != 1 || num != 2 ||num != 3) {
				System.out.println("ERROR! Invalid Number. Try again");
			}
		}
		input.close();

	}

}
