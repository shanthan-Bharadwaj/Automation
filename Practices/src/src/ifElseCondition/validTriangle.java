package ifElseCondition;

import java.util.Scanner;

public class validTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("sides of a triangle: ");
		int s1 = input.nextInt();
		int s2 = input.nextInt();
		int s3 = input.nextInt();
		if((s1+s2)>s3) {
			System.out.println("Given sides of a triangle is a valid");
		}else if((s2+s3)>s1) {
			System.out.println("Given sides of a triangle is a valid");
		}else {
			System.out.println("Given sides of a triangle is not a valid");
		}
		

	}

}
