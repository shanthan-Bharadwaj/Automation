package Swap2no;

//Swaaping of 2 nos without using 3 variable.

public class Swapping2NosWithoutThirdVariable {

	public static void main(String[] args) {
		int a= 20;
		int b=10;
		
		System.out.println("Before swap"+ " "+ "a is:"+a+" "+"b is:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swap"+ " "+ "a is:"+a+" "+"b is:"+b);

	}

}
