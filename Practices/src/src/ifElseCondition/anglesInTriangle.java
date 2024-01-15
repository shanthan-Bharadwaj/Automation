package ifElseCondition;

import java.util.Scanner;

public class anglesInTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the angles in a triangle: ");
		int angle1 = input.nextInt();
		int angle2 = input.nextInt();
		int angle3 = input.nextInt();
		int sum = angle1+angle2+angle3;
		if( sum ==180 &&angle2>0 && angle2>0&& angle3>0) {
			
			System.out.println("Angles in a trianle is =180");
		}else {
			System.out.println("Angles in a trianle is not a triangle");
		}

	}

}
