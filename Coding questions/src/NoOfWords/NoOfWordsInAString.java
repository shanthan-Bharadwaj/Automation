package NoOfWords;

public class NoOfWordsInAString {

	public static void main(String[] args) {
		String S1 = "Shanthan Bharadwaj Boinapalli Test Five";
		int count = 1;
		for (int i=0; i<S1.length()-1;i++) {
			if(S1.charAt(i)== ' ') {
				count=count+1;
			}
			
		}
		System.out.println("no. of words ina string "+ count);

	}

}
