package ifElseCondition;

public class ifElseIfCondition {

	public static void main(String[] args) {
		int marks = 58;
		
		if(marks>=65) {
			System.out.println("A+ grade");
		}else if(marks>=60 && marks<65) {
			System.out.println("A grade");
		}else if(marks>=55 && marks<60) {
			System.out.println("B grade");
		}else if(marks>=50 && marks<55) {
			System.out.println("C grade");
		}else if(marks>=45 && marks<50) {
			System.out.println("D grade");
		}else if (marks<45) {
			System.out.println("fail");
		}

	}

}
