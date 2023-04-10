package NonRepeatingChar;

public class UsingLoops {

	public static void main(String[] args) {
		String str1 = "BCDEFEF";
		System.out.println("The given string is: " + str1);
		for (int i = 0; i < str1.length(); i++) {

			for (int j = i + 1; j < str1.length(); j++) {
				if (i != j) {

				
				}

				
				  else if( i==j) {
					  System.out.println("The first  repeated character in String is: " + str1.charAt(j));
				 
				  }
				 

			}
			System.out.println("The first non repeated character in String is: " + str1.charAt(i));
			break;

		}

	}

}
