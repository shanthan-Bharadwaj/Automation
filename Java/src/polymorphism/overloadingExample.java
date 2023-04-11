package polymorphism;

public class overloadingExample {

	public static void main(String[] args) {
		overloadingExample obj = new overloadingExample();
		obj.add(0, 0);
		byte a = 1;
		byte b = 2;
		obj.add(a, b);
		obj.addition(10,20,30,40);
		
		

	}
	public void add(int a,float b ) {
		
	}
	public void add(byte a,byte b) {
		// overloading is possible
	}
	public void add(int a , double var) {
		// overloading is possible
	}
	
	/*
	 * public void add(int a,int c) { overloading is not possible }
	 */
	/*
	 * public int add(int a, intb) { overloading is not possible }
	 */
	/*
	 * public void add(float a,int b ) { //in this case method overloading is not
	 * possible // because ambiguity error will be coming at run time // because at
	 * run time it will get confuse to which variable value should assign. }
	 */
	
	//varargs example
	public void addition(int...a) {
		//Here values will be stored as an array
		
		
	}
}
