package removeBeginingAndEndingSpaces;

//Trim will remove only single white space from leading and trailing
//Strip will remove all the either all the leading space or trailing spaces.
//Stripleading method will remove all the leading white sapces.
//Striptrailing method will remove all the trailing white spaces.

public class UsingTrimMethod {

	public static void main(String[] args) {
		String s1 = "    Shanthan Bharadwaj Boinapalli    ";
		System.out.println("Before trim"+ s1);
		s1.trim();
		System.out.println("After trim"+ s1);
		String s2 = "    Begining or trialing whitespaces    ";
		System.out.println("strip leading method"+ s2.stripLeading());
		System.out.println("strip traling method"+ s2.stripTrailing());
	}

}
