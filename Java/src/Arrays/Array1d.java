package Arrays;

public class Array1d {
	
	//java arrays --->object -->String []

	public static void main(String[] args) {
		int[] array = new int[5];
		String[] myarray = new String[13];
		
		System.out.println(array.length);
		System.out.println(myarray.length);
		
		
		System.out.println("print array values");
		for(int index=0;index<array.length;index++) {
			array[index]= (int)( Math.random()*100);
			System.out.println(array[index]);
		}
		System.out.println("reverse order array");
		for(int index=array.length-1;index>=0;index--) {
			System.out.println(array[index]);
		}

	}

}
