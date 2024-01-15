package switchCase;

import java.util.Scanner;

public class noOfdaysInAMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("Enter the month");
		n= input.nextInt();
		switch(n) {
		case 1: System.out.println("jan as 31 days");
		break;
		case 2: System.out.println("Feb as 28 days");
		break;
		case 3: System.out.println("Mar as 31 days");
		break;
		case 4: System.out.println("Apr as 30 days");
		break;
		case 5: System.out.println("May as 31 days");
		break;
		case 6: System.out.println("June as 30 days");
		break;
		case 7: System.out.println("July as 31 days");
		break;
		case 8: System.out.println("Aug as 31 days");
		break;
		case 9: System.out.println("Sep as 30 days");
		break;
		case 10: System.out.println("oct as 31 days");
		break;
		case 11: System.out.println("Nov as 30 days");
		break;
		case 12: System.out.println("Dec as 31 days");
		break;
		default:System.out.println("Not a valid month");
		}

	}

}
