package Strings;

public class stringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Shanthan";
		s.concat("Bharadwaj");
		System.out.println(s);
		//Here ouptut will be "shanthan" only because of immutbale string 
		//that means If a string is concated then concated string should be assigned to another variable.other wise 1st varibale data will be only printed.
		String s1 = s.concat("Bharadwaj");
		System.out.println(s1);
		//Now output will be "Shanthan Bharadwaj" because concated string is saved to another string variable
	}

}
