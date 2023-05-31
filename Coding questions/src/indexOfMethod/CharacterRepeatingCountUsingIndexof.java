package indexOfMethod;

public class CharacterRepeatingCount {

	public static void main(String[] args) {
		String s1 = "Welcome to javapoint ahshsyehhhhhhh";
		int count = 0;
		int startfrom = 0;
	for(int i=0;i<s1.length();i++) {	
		int index = s1.indexOf("a",startfrom);
		
		if(index >= 0) {
			count = count+1;
			startfrom = index+1;
		}
		else {
			break;
		}
		
	}
	System.out.println("The String is " + s1);
	System.out.println("The a is repeated in String is"+ " "+ count);

	}

}
