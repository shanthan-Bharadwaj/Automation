
public class IFElseCondition {

	public static void main(String[] args) {
	
		int num = (int) (Math.random()*30); //with out type castin
		System.out.println(num);
		
		if(num > 20) {
			System.out.println(num+" "+"is gretaer than 20");
		}
		else if(num>10 && num<20) {
			System.out.println(num +" "+"is greater than 10 and less than 20");
		
		}
		/*
		 * else if(num <= 10) { System.out.println(num +" "+"is less than 10");
		 * 
		 * }
		 */
		else if(num <= 10) {
			System.out.println(num +" "+"is less than 10");
		
		}
	}

}
