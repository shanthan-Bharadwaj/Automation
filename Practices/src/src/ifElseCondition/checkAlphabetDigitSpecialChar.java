package ifElseCondition;

import java.util.Scanner;

public class checkAlphabetDigitSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the char: ");
		char ch = input.next().charAt(0);
		if((ch >= 'a' && ch<='z') || (ch >= 'A' && ch<='Z')) {
			System.out.println("Given char is a alphabet");
		}else if(ch>='0' && ch<='9') {
			System.out.println("Given char is a digit");
		}else {
			System.out.println("given char is a special char");
		}

	}

}
