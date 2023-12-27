package Operators;

public class scenario_based {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*The total number of students in a class are 90 out of which 45 are boys. 
		If 50% of the total students secured grade 'A' out of which 20 are boys, 
		then write a program to calculate the total number of girls getting grade 'A'*/
		
		int total_Students = 90;
		int Boys_count = 45;
		int girlscount = (90/2)-20;
		System.out.println("Girls count who got A grade is : "+ girlscount );

	}

}
