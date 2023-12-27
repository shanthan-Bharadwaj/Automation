package Operators;

public class swappingOfTwoNos {

	public static void main(String[] args) {
		//swapping of 2 no's without using 2 no's
		int a=7,b=5;
		System.out.println("Value of a before swap is :" + a);
		System.out.println("Value of b before swap is :" + b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Value of a after swap is :" + a);
		System.out.println("Value of b after swap is :" + b);
		
		//swapping of 2 no's using third variable
		int c=10,d=20;
		int temp = 0;
		System.out.println("Value of C before swap is :" + c);
		System.out.println("Value of d before swap is :" + d);
		temp=d;
		d=c;
		c=temp;
		System.out.println("Value of C after swap is :" + c);
		System.out.println("Value of d after swap is :" + d);
	}

}
