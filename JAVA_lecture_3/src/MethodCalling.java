
public class MethodCalling {

	public static void main(String[] args) {
		
		//A static component cannot call the non-static component directly
		//A non-static component can call another non-static & static component directly
		//If A static component need to call non-static component directly then object needs to be created
		//A static component can call another static component directly
		
		MethodCalling m = new MethodCalling();
		
		m.go();
		go3();
		

	}
	public void go() {
		System.out.println("Inisde go method");
		go1();
	}
	public void go1() {
		System.out.println("Inisde go1 method");
		go2();
	}
	public void go2() {
		System.out.println("Inisde go2 method");
		go3();
	}
	public static void go3() {
		System.out.println("Inisde go3 method");
	}

}
