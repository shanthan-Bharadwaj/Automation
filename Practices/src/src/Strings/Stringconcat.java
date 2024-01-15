package Strings;

import java.util.StringJoiner;

public class Stringconcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Shanthan"+"Bharadwaj";
		System.out.println("The first methid to string concat"+" "+ s);
		
		String s1 = "Shanthan";
		String s2 = "Boinapalli";
		String s3 = s1.concat(s2);
		System.out.println("Using string concat method"+" "+ s3);
		
		StringBuilder s4 = new StringBuilder("Bharadwaj");
		StringBuilder s5 = new StringBuilder("Boinapalli");
		StringBuilder s6 = s4.append(s5);
		System.out.println("Using string Builder append method"+" "+ s6);
		
		String s7 = "Shanthan";
		String s8 = "bharadwaj";
		String s8copy = "boinapalli";
		String s9 = String.format("%s%s%s",s7,s8,s8copy);
		System.out.println("Using string format method"+" "+ s9);
		
		StringJoiner s10 = new StringJoiner(" ");
		s10.add("Shanthan");
		s10.add("Bharadwaj");
		System.out.println(s10.toString());

	}

}
