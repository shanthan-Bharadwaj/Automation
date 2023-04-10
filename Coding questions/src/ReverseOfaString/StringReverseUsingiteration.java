package ReverseOfaString;

/*
 * String Reverse function using charAT string function and empty constant reverse variable..

*/
public class StringReverseUsingiteration {

	public static void main(String[] args) {
		String s1 = "nitin", reverse = "";
		char ch ;
		System.out.println("print original word" + " " + s1);
		for(int i = s1.length()-1; i>=0;i--) {
			
			ch= s1.charAt(i);
			reverse = reverse+ch;
			
		}
		
		System.out.println("reverse of string" +" "+ reverse);
		
		if(s1.equals(reverse)) {
			System.out.println(s1 + " "+"it is palindrome");
		}
		else {
			System.out.println(s1 + " "+"it is not a palindrome");
		}

	}

}
