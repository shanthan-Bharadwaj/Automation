package DisplayingCharacterOfString;

public class DisplayoddindexofaString {

	public static void main(String[] args) {
		String s1 = "1234846545464735454636454";
		int s2 = s1.length();
		System.out.println("total no of chars in the string is"+ " "+ s2);
		for(int i=0;i<s2;i++) {
			if(i%2!=0) {
				System.out.println("position of the char is "+ i+ " "+s1.charAt(i));
			}
			
		}

	}

}
