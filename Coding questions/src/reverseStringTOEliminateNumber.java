
public class reverseStringTOEliminateNumber {

	public static void main(String[] args) {
		
		String input = "S  hanthan       98boinapa       lli";
		String output = "";
		for(int i=input.length()-1;i>=0;i--) {
			output=output+input.charAt(i);
		}
		output = output.replaceAll("\\s+", " ");
		System.out.println(output); 
		output = output.replaceAll("\\d", "");
		System.out.println(output);

	}

}
