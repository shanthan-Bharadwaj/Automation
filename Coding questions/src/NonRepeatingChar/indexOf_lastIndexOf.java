package NonRepeatingChar;

public class indexOf_lastIndexOf {

	public static void main(String[] args) {
		String S1 = "geekforgeek";

		for(char i: S1.toCharArray()) {
			if(S1.indexOf(i)== S1.lastIndexOf(i)) {
				System.out.println("First non repeat character is" + i);
				break;
			}
		}
		

	}

}
