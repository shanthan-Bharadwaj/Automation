package Vowels;

//In a Given String check both the vowels and consonants

public class checkVowelsAnsConsonants {

	public static void main(String[] args) {
		String str = "welcome";
		int cVowel = 0;
		int cconsonant = 0;
		
		for (int i = 0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||
					str.charAt(i)=='o'||str.charAt(i)=='u') {
				cVowel++;
			}
			else if(str.charAt(i)>= 'a' && str.charAt(i)<='z') {
				cconsonant++;
			}
		}
			System.out.println("No.of vowels in the staring are"+ cVowel);
			System.out.println("No.of consonants in the staring are"+ cconsonant);
	}

}
