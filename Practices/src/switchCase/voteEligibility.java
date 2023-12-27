package switchCase;

import java.util.Scanner;

public class voteEligibility {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age;
		System.out.println("Enter the age");
		age = input.nextInt();
		int con = age >= 18?1:0;
		switch(con) {
		case 1: System.out.println("you are eligible for voting");
		break;
		case 0: System.out.println("you are not eligible for voting");
		break;
		}
		
		
	}

}
