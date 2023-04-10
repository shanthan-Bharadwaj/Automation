package Vowels;

//FInd the vowels in the given String.

public class findTheVowelsInTheString {

	public static void main(String[] args) {
		
		String str = "Hello Welcoming to your area";
	
		for (int i = 0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||
					str.charAt(i)=='o'||str.charAt(i)=='u') {
				System.out.println("Given string conatins vowels at "+ str.charAt(i)+ " "+"at the index of"+i);
			}
		}

	}

}
