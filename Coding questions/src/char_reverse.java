
public class char_reverse {

	public static void main(String[] args) {
	String str = "Test Automation support";
	String[] input = str.split(" ");
	for(String i:input) {
		String output = "";
		for(int j=i.length()-1;j>=0;j--) {
			output = output+i.charAt(j);
		}
		System.out.println(output);
	}
	
	}

}
