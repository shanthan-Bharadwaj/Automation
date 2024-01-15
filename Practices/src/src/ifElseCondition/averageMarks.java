package ifElseCondition;

import java.util.Scanner;

public class averageMarks {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the marks: ");
		int phy  =input.nextInt();
		int chem = input.nextInt();
		int bio = input.nextInt();;
		int math = input.nextInt();
		int com = input.nextInt();
		int sum = phy+chem+bio+math+com;
		float perc = sum/5;
		System.out.println("total marks are"+sum);
		System.out.println("percentage of marks"+perc);
		if(perc>=90) {
			System.out.println("GradeA");
		}else if(perc>=80 && perc<90) {
			System.out.println("GradeB");
		}else if(perc>=70 && perc<80) {
			System.out.println("GradeC");
		}else if(perc>=60 && perc<70) {
			System.out.println("GradeD");
		}else if(perc>=50 && perc<60) {
			System.out.println("GradeE");
		}else if(perc<=40) {
			System.out.println("GradeF");
		}

	}

}
