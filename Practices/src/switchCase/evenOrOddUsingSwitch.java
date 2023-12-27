package switchCase;

import java.util.Scanner;

public class evenOrOddUsingSwitch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("enter the number");
		num = input.nextInt();
		switch(num%2) {
		case 0: System.out.println("Provided number is a even");
		break;
		case 1: System.out.println("Provided number is odd");
		break;
		}

	}

}
