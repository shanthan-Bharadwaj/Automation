package Vowels;

//Find the no.of vowels in the given String

public class noOfVowelsInAString {

	public static void main(String[] args) {

String str = "Hello Welcoming to your area";
str = str.toLowerCase();
int count = 0;
for (int i=0;i<str.length();i++) {
	
	if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||
					str.charAt(i)=='o'||str.charAt(i)=='u') {
		count++;
		
	}
}
System.out.println("Total no.of Vowels in a String is:"+ count);

	}

}
