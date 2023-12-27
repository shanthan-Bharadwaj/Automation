package ifElseCondition;

import java.util.Scanner;

public class libraryFInes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no.of days: ");
		int days = input.nextInt();
		int amount;
		if(days>0 && days<=5) {
			amount = (int)0.5*days;
			System.out.println("amount to be paid is"+amount);
			
		}else if(days>6 && days<=10) {
			amount = 1* days;
			System.out.println("amount to be paid is"+amount);
		}else if(days >10 && days<29) {
			amount = 5 *days;
			System.out.println("amount to be paid is"+amount);
		}else {
			System.out.println("Invalid");
		}

	}

}
