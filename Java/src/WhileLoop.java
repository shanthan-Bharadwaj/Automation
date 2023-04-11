
public class WhileLoop {
	
	//Loops are not statements, they will not terminate they will exit from loops condition
    // Enter into the loop when condition is true
	//exit from the loop when condition is false
	public static void main(String[] args) {
		
		int i=1;
		int num = (int)(Math.random()*15);
		System.out.println(num);
		while(num<10) {
			System.out.println(num);
			num++;
		}
	}

}
