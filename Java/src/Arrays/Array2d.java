package Arrays;

public class Array2d {
	
	//In the 2 dimensional array[][] two brackets means 2 arrays will be created
	//[2][3] here this annotations means like 1st and 2nd array will be having 3 indexes in each array
	//in the below for loops 1st for loop is for 1st array

	public static void main(String[] args) {
		
		int [] i = new int[4];
		int [][] myArray = new int[2][4];
		//i[2] = 5;
		
		myArray[0][0]=10;
		myArray[0][1]=20;
		myArray[0][2]=30;
		
		myArray[1][0]=40;
		myArray[1][1]=50;
		myArray[1][2]=60;
		myArray[1][3]=70;
		
		System.out.println(i[2]);
		  System.out.println(myArray[0][2]);
		  System.out.println(myArray.length);
		  System.out.println(myArray[0].length); 
		  System.out.println(myArray[1].length);
		 
		for( int i1=0;i1<myArray.length;i1++) {
			for (int j=0;j<myArray[i1].length;j++) {
				System.out.print(myArray[i1][j]+" ");//to display spaces in between the values of the array
				
				 //* println is used for display the values in vertical line //print is used to
				 //* display the values in horizontal line.
				 			}
			System.out.println(" ");//to display two arrays one after the other
		}
	}

}
