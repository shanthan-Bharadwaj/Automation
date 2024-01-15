package Strings;

public class StringsDifferentMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to upper case() and to lower case ()
		String s = "Shanthan Bharadwaj";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		//trim method: trim method will eliminate spaces in the start and end of the string
		String ss = "  shanthan Bharadwaj   ";
		System.out.println("Before trim"+" "+ss);
		String sh  = ss.trim();
		System.out.println("After yrime"+" "+sh);
		
		//startsWith and endsWith methods return true or false based on the condition.If the string starts with given condition 
		//and ends with given condition or not it will check.
		String s1 = "shanthan";
		System.out.println(s1.startsWith("s"));
		System.out.println(s1.endsWith("n"));
		System.out.println(s1.startsWith("sha"));
		System.out.println(s1.endsWith("nthan"));
		System.out.println(s1.startsWith("b"));
		System.out.println(s1.endsWith("h"));
		
		//valueOf() method converts given type such as int, long, float, double, boolean, char and char array into String.
		int a = 10;
		String s2 = String.valueOf(a);
		System.out.println(s2+10);
		char ch='B';
		String s3 = String.valueOf(ch);
		System.out.println(ch+"shanthan");
		
		
		String s4 = "shanthan joined in IBM. shanthan got a project ";
		String restring = s4.replace("Shanthan", " Shanthan Bharadwaj");
		System.out.println(restring);
	}

}
