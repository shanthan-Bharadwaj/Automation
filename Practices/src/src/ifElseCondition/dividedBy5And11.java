package ifElseCondition;

import java.util.Scanner;

public class dividedBy5And11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the num 1 : ");
		int num1 = input.nextInt();
		if(num1%5==0 && num1%11==0) {
			System.out.println(num1+" "+"is divided by 5 and 11");
		}else {
			System.out.println(num1+" "+"is not divided by 5 and 11");
		}

	}

}
