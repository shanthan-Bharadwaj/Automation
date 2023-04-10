package DuplicateChars;

public class PrintDuplicateCharInAString {

	public static void main(String[] args) {
		String s1 = "shanthan bharadwaj boinapalli";
		int count;
		char s2[]=s1.toCharArray();
		
		for(int i=0; i<s1.length();i++) {
			count = 1;
			for(int j=i+1;j<s1.length();j++) {
				if(s2[i]==s2[j] && s2[i]!= ' ') {
					count++;
					s2[j]='0';
				}
				
				}
			if(count>1 && s2[i] !='0') {
				System.out.println("repeated char is"+ " "+s2[i]+" "+count);
			}
		}

	}

}
