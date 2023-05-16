package removeAllSpacesInString;

public class removeSpacesInString_UsingLoops {

	public static void main(String[] args) {
		String str= " Shanthan Bharadwaj Boinapalli ";
		
		char[] arr = str.toCharArray();
		
		String temparr = "";
		
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!= ' ') {
			temparr+=arr[i];
		}
	}
	str = temparr;
	System.out.println(str);

	}

}
