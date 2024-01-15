package Strings;

public class StringComparisonUsingEqualOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 ="shanthan";
		String s2 ="shanthan";
		String s3 = new String("Bharadwaj");
		System.out.println("using == operator"+" "+ s1 == s2);
		System.out.println("using equals method"+" "+ s1==s3);
		
		// compareTo method for comparing of the string
		
		String s4 ="shanthan";
		String s5 ="shanthan";
		String s6 = new String("Bharadwaj");
		System.out.println(s4.compareTo(s5));
		System.out.println(s4.compareTo(s6));
		System.out.println(s6.compareTo(s4));

	}

}
