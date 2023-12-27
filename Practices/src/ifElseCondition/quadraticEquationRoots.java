package ifElseCondition;

import java.util.Scanner;

public class quadraticEquationRoots {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the values: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = b*b-(4*a*c);
		System.out.println(d);
		if(d>0 ) {
			double x1 = (-b+Math.sqrt(d))/2*a;
			double x2 = (-b-Math.sqrt(d))/2*a;
			System.out.println("The roots of the equation is"+x1+" "+x2);
			
		} /*
			 * else if(d<0){ double x3 = (-b+Math.sqrt(d))/2*a; double x4 =
			 * (-b-Math.sqrt(d))/2*a;
			 * System.out.println("The roots of the equation is"+x3+" "+x4); }
			 */else {
			System.out.println("The determinant of the no is 0");
		}

	}

}
