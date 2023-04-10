package Comparing2Strings;

/*
Here we are checking both strings are equal are not in both ways 
1. Directly comparing both the strings are displaying the boolean info
2. comparing both the strings in if condition. If condition is true statement will be print if not another statement will print.
*/
public class comparing2Strings_2 {

	public static void main(String[] args) {
		String s1 = "shanthan";
		String s2 = "Bharadwaj";
		String s3 = "shanthan";
		String s4 = "Boinapalli";
		
		System.out.println(s1.equals(s4));
		
		if(s1.equals(s3)) {
			System.out.println("Both strings are matching");
		}else {
			System.out.println("Both strings are not matching");
		}
		

	}

}
