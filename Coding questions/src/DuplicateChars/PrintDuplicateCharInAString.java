package DuplicateChars;

import java.util.ArrayList;

public class PrintDuplicateCharInAString {

	public static void main(String[] args) {
		String s1 = "shanthan bharadwaj boinapalli";
		int count;
		char s2[]=s1.toCharArray();
		ArrayList<Character> output = new  ArrayList<Character>();
		
		for(int i=0; i<s1.length();i++) {
			count = 1;
			for(int j=i+1;j<s1.length();j++) {
				if(s2[i]==s2[j] && s2[i]!= ' ') {
					count++;
					
				}
				
				}
			if(count>1 && !(output.contains(s2[i]))) {
				output.add(s2[i]);
				System.out.println("repeated char is"+ " "+s2[i]+" "+count);
				
			}
		}

	}

}
