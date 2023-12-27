
public class operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//unnary operators using increment and decrement
		int x=10;
		System.out.println(x++);
		System.out.println(x++);
		System.out.println(x++);
		
		  System.out.println(++x); 
		  System.out.println(x--); 
		  System.out.println(--x);
		//unnary operators using ~ and !
		  int a=10;
		  int b=-10;
		  boolean c=true;
		  boolean d = false;
		 
		  System.out.println(~a);
		  System.out.println(~b);
		  System.out.println(c);
		  System.out.println(!d);
		 //oprators example
		  System.out.println(10*10/5+3-5/10);
		  // left shift is indicated by <<
		  // left shift is nothing but multiplication.
		 // ex: 20<< 4 now 2 will be mutiplied by 4 times i.e 2 to the power of 4 = 16 and 20*16=320 is the answer
		  System.out.println(10<<5);
		  //right shift is indicated by >>
		  //right shift is nothing but division
		  //ex: 200>>4 now 2 will be mutiplied by 4 times i.e 2 to the power of 4 = 16 and 200/16 = 12
		  
		  System.out.println(1000>>5);
	}

}
