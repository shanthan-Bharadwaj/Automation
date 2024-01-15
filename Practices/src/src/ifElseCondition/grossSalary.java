package ifElseCondition;

import java.util.Scanner;

public class grossSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the basic slary: ");
		int bs = input.nextInt();
		
		if(bs<=10000) {
			float gs = bs+20*(bs)/100+80*(bs)/100;
			System.out.println(gs);
		}else if(bs<=20000 && bs>10000) {
			float gs = bs+25*(bs)/100+90*(bs)/100;
			System.out.println(gs);
		}else if(bs>20000) {
			float gs = bs+30*(bs)/100+95*(bs)/100;
			System.out.println(gs);
		}
		

	}

}
