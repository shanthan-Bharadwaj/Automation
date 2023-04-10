package ReverseOfaString;

public class StringReverseUsing_StringBuffer_Builder {

	public static void main(String[] args) {
		String s1 = "shanthan";
		String s2 = reverseofstring(s1);
		System.out.println(s2);
		System.out.println(s1);
		
		if(s1.equals(s2)) {
			System.out.println(s1 +" "+ "is a palindrome word");
		}
		else {
			System.out.println(s1 +" "+ "is not a palindrome word");
		}
		

	}
	
	public static String reverseofstring(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		return sb.toString();
		
	}

}
