package DisplayingCharacterOfString;

/*
first display last character in the string
 next display all the characters in the string with the position

*/
public class DisplayPositionOfcharOfString {

	public static void main(String[] args) {
		
		String s1 = "Shanthan";
		int s2 = s1.length();
		char ch = s1.charAt(s2-1);
		System.out.println(ch);
		
		for(int i=0; i<s2;i++) {
			
			char c = s1.charAt(i);
			System.out.println(c +" "+ i+ " "+ "position in the string");
		}

	}

}
