
public class SwitchCaseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = (int)(Math.random()*8);
		System.out.println(num);
		
		switch(num) {
		case 1: 
			System.out.println("Monday");
			break;
		case 2: 
			System.out.println("Tuesday");
			break;
		case 3: 
			System.out.println("Wednesday");
			break;
		case 4: 
			System.out.println("Thursday");
			break;
		case 5: 
			System.out.println("Friday");
			break;
		case 6: 
			System.out.println("Staurday");
			break;
		case 7: 
			System.out.println("Sunday");
			break;
			default :
				System.out.println("Not a weekday");
				break;
				
		}

	}

}
