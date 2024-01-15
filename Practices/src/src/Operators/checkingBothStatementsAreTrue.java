package Operators;

public class checkingBothStatementsAreTrue {

	public static void main(String[] args) {
		//checking the condition if both the statements are true 
		int a = 55,b=70;
		boolean result = (a<50 && a<b);
		System.out.println(result);
		//checking the condition if any one statement is true
		boolean result2 = (a<50 || a<b);
		System.out.println(result2);

	}

}
