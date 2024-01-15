package ifElseCondition;

import java.util.Scanner;

public class oddAndEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number: ");
		int num = input.nextInt();
		if(num%2==0) {
			System.out.println(num+" "+"is a even no");
		}else {
			System.out.println(num+" "+"is a odd no");
		}
		
	}

}
