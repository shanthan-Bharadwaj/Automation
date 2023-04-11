
public class IfElseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = (int)(Math.random()*20);
		System.out.println(num);
		
		if(num >= 15) {
			System.out.println("number is greater than 15");
		}
		else if(num >=10 && num <15) {
			System.out.println(num+"is in between 10 and 15");
		}
		else {
			System.out.println(num+"is less than 10 ");
		}

	}

}
