package NonRepeatingChar;

public class NonRepeatingAndRepeatingInAString {

	public static void main(String[] args) {
		String S1 = "ABCDDEEFFGHIJJ";
		boolean flagrepet = true;
		boolean flagnonrepet = true;
		char ch = 0;
		char c = 0;
		for(int i=0; i<=S1.length()-1;i++) {
			for(int j=i+1; j<S1.length();j++) {
				if(flagrepet) {
					if(S1.charAt(i)==S1.charAt(j)) {
						ch = S1.charAt(i);
						flagrepet = false;//need to check this why this is given
					}
				}
				if(flagnonrepet) {
					if(S1.charAt(i)!=S1.charAt(j)) {
						c = S1.charAt(j);
						flagnonrepet = false;
					}
				}
		
			}
			
		}
		System.out.println("Print first repeat char in string is"+ c);
		System.out.println("Print first non-repeat char in string is"+ ch);

	}

}
