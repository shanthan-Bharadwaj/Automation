package DisplayingCharacterOfString;

public class NoOfCharsRepeatingInString {

	public static void main(String[] args) {
		String s1 = "11225819272635w41414111uu363848281111193846366";
		int count = 0;
		int s2 = s1.length();
		System.out.println("total no of chars in the string is"+ " "+ s2);
		for(int i=0;i<s1.length()-1;i++) {
			if(s1.charAt(i)== '1') {
				count++;
			}
		}
		System.out.println("frequency of 1 is"+ " "+ count);

	}

}
