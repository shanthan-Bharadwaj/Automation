package ifElseCondition;

import java.util.Scanner;

public class checkCharacerIsAlphabet {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a charcter: ");
		char ch = input.next().charAt(0);
		if((ch >= 'a' && ch<='z') || (ch >= 'A' && ch<='Z')) {
			System.out.println("Given character is an alphabet");
		}else {
			System.out.println("Given character is not an alphabet");
		}

	}

}
