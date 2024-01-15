package ifElseCondition;

import java.util.Scanner;

public class EmployeeSalaryHike {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enetr the joining year: ");
		int join = input.nextInt();
		int current = 2023;
		int diff = current - join;
		if(diff>=3) {
			System.out.println("2500 bonous will be credited");
		}else {
			System.out.println("No bonous");
		}

	}

}
