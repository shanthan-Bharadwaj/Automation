package polymorphism;

/*
 * overriding is also known as dynamic binding/late binding/run time polymorphism.
 * Overriding can be done when inheritance is applied on the class.
 * In overriding same method and method signature is used.
 * can we change the return type while performing the overriding?
 *  - No we cannot change the return type if the return types used are primitive
 *  -Yes we can change the return type if the return type is classname
 *  When we are returning the object then return type for the method will be class name
 * Covariant means return types are the class names and there is a parent - class relationship between the classes 
 * 

*/
public class RBIOveriding {
	
	public double HomeLoanROI(){
		
		return 8.5;
	}
	
	public double CarLoanROI() {
		
		return 10.5;
	}
	public RBIOveriding CarLoanROICiti() {
		RBIOveriding obj = new CitiOverriding();
		return obj;
	}

}
