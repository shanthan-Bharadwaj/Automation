package ReverseOfaString;

public class StringReverseFunctionUsingToCharArray {

	public static void main(String[] args) {
	String s1 = "nitin";
	char[] ch = s1.toCharArray();
	String s2 = "";
	
	for(int i=ch.length-1;i>=0;i--) {
	 s2 = s2+ch[i];

		
	}
	if(s1.equals(s2)) {
		System.out.println(s2 + " " + "is a palindrome");
	}

	}

}
