
public class calculator {
	
	public int add(int i,int j) {
		
		
		int sum= i+j;
		return sum;
	}
	
  public int Sub(int i,int j) {
		
		return j-i;
	}
  public int multiply (int i,int j) {
		
		
		return i*j;
	}
  
  public int divide (int i,int j) {
		

		return i/j;
	}
  public static void main(String[] args) {
	  
	  calculator c = new calculator();
	  System.out.println(c.add(25,30));
	  System.out.println(c.Sub(25,30));
	  System.out.println(c.multiply(25,30));
	  System.out.println(c.divide(10,5));
	  
	  
  }
}
