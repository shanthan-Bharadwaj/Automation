package switchCase;

import java.util.Scanner;

public class simplecalulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		int num1,num2,c;
		System.out.println("Enter num1");
		num1 = input.nextInt();
		System.out.println("Enter num2");
		num2 = input1.nextInt();
		System.out.println("Enter an no");
		c = input2.nextInt();
		int add = num1+num2;
		int sub = num1-num2;
		int mul = num1*num2;
		int div = num1/num2;
		
		
		switch(c) {
		case 1: System.out.println("Additon of two no's"+ add);
		break;
		case 2: System.out.println("Sub of two no's"+ sub);
		break;
		case 3: System.out.println("Sub of two no's"+ mul);
		break;
		case 4: System.out.println("Sub of two no's"+ div);
		break;
		default: System.out.println("No operation is available");
		
		}

	}

}
