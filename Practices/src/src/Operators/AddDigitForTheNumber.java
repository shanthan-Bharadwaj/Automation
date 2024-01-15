package Operators;

public class AddDigitForTheNumber {

	public static void main(String[] args) {
		int n = 1234567;
		int seven = (n/1000000);
		n=n%1000000;
		System.out.println(seven);
		int six = n/100000;
		n=n%100000;
		System.out.println(six);
		int five = n/10000;
		n=n%10000;
		System.out.println(five);
		int fourth = (n/1000);
		n = n%1000;
		System.out.println(fourth);
		int third = (n/100);
		n=n%100;
		System.out.println(third);
		int second = (n/10);
		System.out.println(second);
		int once = (n%10);
		System.out.println(once);
		System.out.println(fourth+ " "+third+" "+second+" "+once);
		
		
		
		
		
		
		

	}

}
