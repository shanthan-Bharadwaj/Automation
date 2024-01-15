package switchCase;

import java.util.Scanner;

public class printGender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		char gen;
		
		System.out.println("Print the gender(M/F");
		gen = input.next().charAt(0);
		
		switch(gen) {
		case 'M': System.out.println("Gender is Male");
		break;
		case 'm': System.out.println("Gender is Male");
		break;
		case 'F': System.out.println("Gender is Female");
		break;
		case 'f': System.out.println("Gender is Female");
		break;
		default:System.out.println("Gender does not match");
		}
		

	}

}
