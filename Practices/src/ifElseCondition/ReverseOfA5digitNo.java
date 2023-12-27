package ifElseCondition;

public class ReverseOfA5digitNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=23456;
		int five = n/10000;
		n=n%10000;
		System.out.println(five);
		int four = n/1000;
		n=n%1000;
		System.out.println(four);
		int three = n/100;
		n=n%100;
		System.out.println(three);
		int two = n/10;
		System.out.println(two);
		int one = n%10;
	
		
	}

}
