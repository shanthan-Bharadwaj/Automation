package polymorphism;

public class RBI {
	/*polymorphism - same name  + multiple form
	 * there are 2 types of polymorphism compile time and runtime polymorphism
	 * compile time/early binding/static binding/ overloading -all these are same
	 * run time/late binding/dynamic binding/overwriting -all these are same.
	 * Complie time polymorphism -In a class having same method name but diff method signature 
	 * method signature is combination of method name and its parameter
	 * in the below example we are providng 2 same methods but with diff parameters
	 * If two methods are having same method signature but there return type is different so overloading is not possbile
	 * In two methods having same method name and same data types with diff variable name then overloading is not possible
	 * ex for above public void add(inta,intb),public void add(inta,intc) - in this case overloading will not work.
	 * We can Overload the main method also but we should not provide the array for string
	 * system.out.println() is also an overloaded method
	
	
	
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void add(int a,int b) {
		
	}
	public void  add(int a,String b) {
		
	}
	/*
	 * public void sub(int a,int b,int c) {
	 * 
	 * } public int sub(int a,int b,int c) { return c; }
	 * 
	 *In this part we are having same method signature but different return type even overloading is not posible.
	 */

	  public int sub(int a,int b) {
		return b;
												
	  } public int sub(int a,int b,int c) { 
		  return c; 
		  }
	  
	  //overloading is possibility in above case
	  
	  public int mul(int a,int b) {
			return b;
													
		  } public int mul(int a,String b) {
			return a; 
			   
			  }
	//overloading is possible in above scenario.
}
