package Strings;

public class stringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//By Using equals method()
		String s1 = "Shanthan";
		String s2 = "Shanthan";
		String s3 = new String("Shanthan");
		String s4 = "Bharadwaj";
		System.out.println("using equals method"+" "+ s1.equals(s2));
		System.out.println("using equals method"+" "+ s1.equals(s3));
		System.out.println("using equals method"+" "+ s1.equals(s4));
		System.out.println();
		
		//uisng equalsIgnoreCase method": This method will compare 2 strings but it will not check for case sensitive.
		
		String s5 = "SHANTHAN";
		String s6 = "shanthan";
		System.out.println("using equals ignore method"+" "+ s5.equals(s6));
		System.out.println("using equals ignore method"+" "+s5.equalsIgnoreCase(s6));
		
		//using == operator
		
		
	}

}
