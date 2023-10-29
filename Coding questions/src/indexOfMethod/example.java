package indexOfMethod;

public class example {

	public static void main(String[] args) {
		String s1 = "this is index of example";
		
		int index1 = s1.indexOf("is");
		int index2 = s1.indexOf("index");
		System.out.println(index1);
		System.out.println(index2);
		
		int index3 = s1.indexOf("is",4);
		System.out.println(index3);
		
		int index4 = s1.indexOf("o");
		System.out.println(index4);
		// -1 will be returned if there is nothing to display from the start value
		int index5 = s1.indexOf("is",8);
		System.out.println(index5);

	}

}
