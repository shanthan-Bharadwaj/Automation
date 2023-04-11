
public class DoWhileLoop {
	
	//In do while loop do loop will be executed first and then while loop condition will be checked
	//In the below example first 12 will be printed and while condition will be false so nothing will be printed and last statement will be printed.
	

	public static void main(String[] args) {
		int i = 12;
		
		do {
			
			System.out.println(i);
			i++;
		}
		while(i<10);
	System.out.println("after the loop");

	}

}
