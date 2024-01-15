package Operators;

public class multiple_operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((((8+2345)/3)%5)*5);
		
	// Using Assignment operators
		int x=2345;
		int res1 = (x+=8);
		int res2 =  res1/=3;
		int res3 = res2%=5;
		int res4 = res3*=5;
		System.out.println(res4);
	}

}
