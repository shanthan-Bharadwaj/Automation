package removeAllSpacesInString;



public class removeSpacesInAString_usingReplaceAll {

	public static void main(String[] args) {
		String str = " Shanthan Bharadwaj Boinapalli ";
		 String str1 = str.replaceAll(" ", "");
		 //String str1 = str.replaceAll("\\s", "");
		 //we can use both the ways here \\s is a single space indication in unicode
		 System.out.println(str1);

	}

}
