package Strings;

public class StringSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sttarting index is inclusive and ending index is exclusive. means a character of ending node will be displayed .
		//substring(2,5) string will count from 2 and end with 4 subctring will be displayed from 2-4
		String s = "Shanthan bharadwaj";
		System.out.println(s.substring(0,11));
		System.out.println(s.substring(0));
		System.out.println("start and end index"+" "+s.substring(2, 5));
		
		
		//Using split method()
		String s2 = "shanthan bharadwaj";
		String[] s1 = s2.split(" ");
		for(String s3:s1) {
			System.out.println(s3);
		}
		
		
	}

}
