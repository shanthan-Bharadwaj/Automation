
public class Methods {

// void reutrn type	
	public void display(){
		
		//Public is a access specifier
		// Void a return type,  here return type is nothing like what data type of value does this method will return
		// return type may be int,char,float of there is no return type void should be displayed
		// if any return type is provided the return keyword should be given at the last of the method
		// 
		
		
	}
// Int return type
	public int Display1() {
		
		int i=2;
		int j=3;
		int sum= (i+j);
		return sum;
	}
//Char return type
	public char Display() {
		 return 'S';
	}
//String return type{
	public String Display3() {
		
		String X = "Shanthan";
		return X;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods M = new Methods();
		M.Display1();
		
		// Here i am creating an object for Method2 class to use S variable in this class
		//Here in the Method2 class s is declared as class variable, So M1,M2,M3 will be behaving as am individual
		//so S will be same as for every object. If in Method2 class S is referred with static keyword then value will be incremented  for M1,M2 and M3
		
		Method2 M1 = new Method2();
		M1.s++;
		
		Method2 M2 = new Method2();
		M2.s++;
		
		Method2 M3 = new Method2();
		System.out.println(M3.s);
		
		
	}

}
