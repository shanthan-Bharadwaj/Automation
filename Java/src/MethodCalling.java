
public class MethodCalling {

	//static method can call another static method directly
	//Non-static method will be called not be called directly.an object should be created
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   method3();
   MethodCalling m = new MethodCalling();
   m.method();

	}
	
	public void method() {
		System.out.println("first method");
		method1();
	}
	public void method1() {
		System.out.println("second method");
		method2();
	}
	public void method2() {
		System.out.println("third method");
	}
	public static void method3() {
		System.out.println("fourth method");
	}

}
