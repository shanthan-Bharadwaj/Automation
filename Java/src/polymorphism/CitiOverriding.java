package polymorphism;

public class CitiOverriding extends RBIOveriding {

	public static void main(String[] args) {
		CitiOverriding obj = new CitiOverriding();
		
		System.out.println(obj.HomeLoanROI());
		

	}
	public double HomeLoanROI() {
		
		return 10.5;
	}
	
	public CitiOverriding CarLoanROICiti() {
		CitiOverriding obj = new CitiOverriding();
		return obj;
	}

}
