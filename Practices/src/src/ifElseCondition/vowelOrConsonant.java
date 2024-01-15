package ifElseCondition;

import java.util.Scanner;

public class vowelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the charc: ");
		char ch = input.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'|| ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
			System.out.println("Given char is a vowel");
		}else {
			System.out.println("Given char is a consonant");
		}

	}

}
